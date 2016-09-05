package opal.controller;

import opal.model.PPB;
import opal.service.PPBServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */

@Controller
@RequestMapping("/ppb")
public class PPBController {

    private PPBServiceI ppbService;

    public PPBServiceI getPpbService() {
        return ppbService;
    }

    @Autowired
    public void setppbService(PPBServiceI ppbService) {
        this.ppbService = ppbService;
    }



    //基线数据列表
    @RequestMapping("/list")
    public String ppblist(Model model, HttpServletRequest request){
        List<PPB> ppblist= ppbService.getAll();
        model.addAttribute("ppblist",ppblist);
        return "ppblist";
    }

    @RequestMapping("/detail/{ppbid}")
    public  String ppbdetail(@PathVariable Integer ppbid,Model model,HttpServletRequest request){
        PPB ppb = ppbService.getPPBById(ppbid);
        request.setAttribute("ppb",ppb);
        return "PPBdetail";
    }

    //删除基线数据
    @RequestMapping("/delete/{ppbid}")
    public String  PPBDelete(@PathVariable Integer ppbid, Model model, HttpServletRequest request){
        ppbService.deletePPBById(ppbid);
        List<PPB> ppbList=ppbService.getAll();
        model.addAttribute("ppblist",ppbList);
        return "ppblist";
    }

    @RequestMapping("/empty")
    public String PPBempty(HttpServletRequest request){
        PPB ppb = new PPB();
        request.setAttribute("ppb",ppb);
        return "ppbadd";
    }

    //增加基线数据
    @RequestMapping("/add")
    public  String PPBadd(Model model ,HttpServletRequest request){
        PPB ppb =new PPB();
        ppb.setPpbname(request.getParameter("ppbname"));
        ppb.setMetricname(request.getParameter("metricname"));
        ppb.setLcl(request.getParameter("lcl"));
        ppb.setCl(request.getParameter("cl"));
        ppb.setUcl(request.getParameter("ucl"));
        ppbService.insert(ppb);
        List<PPB> ppblist=ppbService.getAll();
        model.addAttribute("ppblist",ppblist);
        return "ppblist";
    }



    //修改基线数据信息
    @RequestMapping("/edit/{ppbid}")
    public String PPBedit(@PathVariable Integer ppbid, Model model, HttpServletRequest request){
        PPB ppb = ppbService.getPPBById(ppbid);
        ppb.setPpbname(request.getParameter("ppbname"));
        ppb.setMetricname(request.getParameter("metricname"));
        ppb.setLcl(request.getParameter("lcl"));
        ppb.setCl(request.getParameter("cl"));
        ppb.setUcl(request.getParameter("ucl"));
        ppbService.updatePPB(ppb);
        List<PPB> ppblist=ppbService.getAll();
        model.addAttribute("ppblist",ppblist);
        return "ppblist";
    }








}
