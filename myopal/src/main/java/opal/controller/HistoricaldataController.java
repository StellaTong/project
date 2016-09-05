package opal.controller;

import opal.model.Historicaldata;
import opal.model.Historicaldata;
import opal.service.HistoricaldataServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by dongsidou on 2016/8/26.
 */

@Controller
@RequestMapping("/historicaldata")
public class HistoricaldataController {

    private HistoricaldataServiceI historicaldataService;

    public HistoricaldataServiceI getHistoricaldataService() {
        return historicaldataService;
    }

    @Autowired
    public void setHistoricaldataService(HistoricaldataServiceI historicaldataService) {
        this.historicaldataService = historicaldataService;
    }



    //历史数据记录列表
    @RequestMapping("/list")
    public String Historicaldatalist(Model model, HttpServletRequest request){
        List<Historicaldata> historicaldataList= historicaldataService.getAll();
        model.addAttribute("historicaldataList",historicaldataList);
        return "historicaldatalist";
    }

    @RequestMapping("/detail/{recordid}")
    public  String Historicaldatadetail(@PathVariable Integer recordid,Model model,HttpServletRequest request){
        Historicaldata historicaldata = historicaldataService.getHistoricaldataById(recordid);
        request.setAttribute("historicaldata",historicaldata);
        return "historicaldatadetail";
    }

    //删除历史数据记录
    @RequestMapping("/delete/{recordid}")
    public String  HistoricaldataDelete(@PathVariable Integer recordid, Model model, HttpServletRequest request){
        historicaldataService.deleteHistoricaldataById(recordid);
        List<Historicaldata> HistoricaldataList=historicaldataService.getAll();
        model.addAttribute("Historicaldatalist",HistoricaldataList);
        return "Historicaldatalist";
    }

    @RequestMapping("/empty")
    public String Historicaldataempty(HttpServletRequest request){
        Historicaldata historicaldata = new Historicaldata();
        request.setAttribute("historicaldata",historicaldata);
        return "historicaldata";
    }

    //增加历史数据记录
    @RequestMapping("/add")
    public  String Historicaldataadd(Model model ,HttpServletRequest request){
        Historicaldata historicaldata =new Historicaldata();
        historicaldata.setProcessid(Integer.parseInt(request.getParameter("processid")));
        historicaldata.setProjectid(Integer.parseInt(request.getParameter("projectid")));
        historicaldata.setMetricname(request.getParameter("metricname"));
        historicaldata.setValue(request.getParameter("value"));
       historicaldataService.insert(historicaldata);
        List<Historicaldata> historicaldatalist=historicaldataService.getAll();
        model.addAttribute("historicaldatalist",historicaldatalist);
        return "historicaldatalist";
    }



    //修改历史数据记录信息
    @RequestMapping("/edit/{recordid}")
    public String Historicaldataedit(@PathVariable Integer recordid, Model model, HttpServletRequest request){
        Historicaldata historicaldata = historicaldataService.getHistoricaldataById(recordid);
        historicaldata.setProcessid(Integer.parseInt(request.getParameter("processid")));
        historicaldata.setProjectid(Integer.parseInt(request.getParameter("projectid")));
        historicaldata.setMetricname(request.getParameter("metricname"));
        historicaldata.setValue(request.getParameter("value"));
        historicaldataService.updateHistoricaldata(historicaldata);
        List<Historicaldata> historicaldatalist=historicaldataService.getAll();
        model.addAttribute("historicaldatalist",historicaldatalist);
        return "historicaldatalist";
    }

}
