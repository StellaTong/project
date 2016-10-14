package opal.controller;

import opal.model.Tool;
import opal.service.ToolServiceI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */

@Controller
@RequestMapping("/tool")
public class ToolController {

    private ToolServiceI toolService;

    public ToolServiceI getToolService() {
        return toolService;
    }

    @Autowired
    public void setToolService(ToolServiceI toolService) {
        this.toolService = toolService;
    }



    //工具列表
    @RequestMapping("/list")
    public String toollist(Model model, HttpServletRequest request){
        List<Tool> toolList= toolService.getAll();
        model.addAttribute("toollist",toolList);
        return "toollist";
    }

    @RequestMapping("/detail/{toolid}")
    public  String tooldetail(@PathVariable Integer toolid,Model model,HttpServletRequest request){
        Tool tool = toolService.getToolById(toolid);
        request.setAttribute("tool",tool);
        return "tooldetail";
    }

    //删除工具
    @RequestMapping("/delete/{toolid}")
    public String  toolDelete(@PathVariable Integer toolid, Model model, HttpServletRequest request){
        toolService.deleteToolById(toolid);
        List<Tool> toolList=toolService.getAll();
        model.addAttribute("toollist",toolList);
        return "toollist";
    }

    @RequestMapping("/empty")
    public String toolempty(HttpServletRequest request){
        Tool tool = new Tool();
        request.setAttribute("tool",tool);
        return "tooladd";
    }

    //增加工具
    @RequestMapping("/add")
    public  String tooladd(Model model ,HttpServletRequest request){
        Tool tool =new Tool();
        tool.setToolname(request.getParameter("toolname"));
        tool.setTooldes(request.getParameter("tooldes"));
        tool.setUrl(request.getParameter("url"));
        tool.setProcessid(Integer.parseInt(request.getParameter("processid")));
        toolService.insert(tool);
        List<Tool> toolList=toolService.getAll();
        model.addAttribute("toollist",toolList);
        return "toollist";
    }



    //修改工具信息
    @RequestMapping("/edit/{toolid}")
    public String tooledit(@PathVariable Integer toolid, Model model, HttpServletRequest request){
        Tool tool = toolService.getToolById(toolid);
        tool.setToolname(request.getParameter("toolname"));
        tool.setTooldes(request.getParameter("tooldes"));
        tool.setUrl(request.getParameter("url"));
        tool.setProcessid(Integer.parseInt(request.getParameter("processid")));
        toolService.updateTool(tool);
        List<Tool> toolList=toolService.getAll();
        model.addAttribute("toollist",toolList);
        return "toollist";
    }

    @RequestMapping("/access/xmr/{metric}")
    public void  accessxmr(@PathVariable String metirc, Model model, HttpServletRequest request ){

    }

    //修改工具信息
    @RequestMapping("/var/{toolid}")
    public String varedit(@PathVariable Integer toolid, Model model, HttpServletRequest request){
        Tool tool = toolService.getToolById(toolid);
        String tooldes;
        tooldes=tool.getTooldes();
        return tooldes+"var";
    }

    //打开本地工具
    @RequestMapping("/opensoftware/{toolid}")
    @ResponseBody
    public ModelAndView opensoftware(@PathVariable Integer toolid, Model model, HttpServletRequest request){
        Tool tool = toolService.getToolById(toolid);
        ModelAndView view = new ModelAndView();
        String toolurl;
        toolurl=tool.getUrl();
        System.out.println(toolurl);
        if (toolurl.contains("http")){
            view.setViewName("redirect:"+toolurl);
        }
        else{
            view.setViewName("redirect:http://localhost:8080/myopal/tool/list");
            toolService.opentool(toolurl);
        }
        return view;
    }

    //返回参数到工具
    @RequestMapping(value = "/addvartool", method = RequestMethod.POST)
    @ResponseBody
    public void varedit(String xmrname,String orgid,String proid,String xname,String yname, String metricname,Model model, HttpServletRequest request){
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("renah.buaa.edu.cn:8080/qpmtools/#/spc/create/XmR");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='name']")));
        WebElement name = driver.findElement(By.xpath(".//*[@id='name']"));
        name.sendKeys(xmrname);

        Select selectorg = new Select(driver.findElement(By.xpath("//td[2]/select")));
        selectorg.selectByIndex(Integer.parseInt(orgid));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[3]/select")));
        Select selectpro = new Select(driver.findElement(By.xpath("//td[3]/select")));
        selectpro.selectByIndex(Integer.parseInt(proid));

        WebElement xnamepath = driver.findElement(By.xpath("//tr[5]/td[1]/input"));
        xnamepath.sendKeys(xname);

        WebElement ynamepath = driver.findElement(By.xpath("//tr[5]/td[2]/input"));
        xnamepath.sendKeys(yname);


    }




}
