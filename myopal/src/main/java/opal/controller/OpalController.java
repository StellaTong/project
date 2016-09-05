package opal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dongsidou on 2016/8/30.
 */
@Controller
@RequestMapping("/opalController")
public class OpalController {

    @RequestMapping("/pdl")
    public String pdl(Model model, HttpServletRequest request){
        return "processlib";
    }
    @RequestMapping("/lcl")
    public String lcl(Model model, HttpServletRequest request){
        return "lifecyclelib";
    }

    @RequestMapping("/gll")
    public String gll(Model model, HttpServletRequest request){
        return "guidelinelib";
    }

    @RequestMapping("/rdl")
    public String rdl(Model model, HttpServletRequest request){
        return "documentlib";
    }

    @RequestMapping("/mr")
    public String mr(Model model, HttpServletRequest request){
        return "mearepository";
    }
}
