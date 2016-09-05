package opal.controller;

import opal.model.User;
import opal.service.UserServiceI;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by dongsidou on 2016/7/17.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserServiceI userService;


    public UserServiceI getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserServiceI userService) {
        this.userService = userService;
    }

    //localhost:8080:myopal/usercontroller/showUser/14
    @RequestMapping("/doLogin")
    public String login(String name, String password, HttpSession session, HttpServletResponse response, HttpServletRequest request){
        User u = userService.getUserByUserName(name);
        //登录成功，跳转到list页面
        if (!u.getName().isEmpty()) {
            if (u != null && u.getPassword().equals(password)) {
                session.setAttribute("user", u);

                return "redirect:/userController/showUser/14";
            } else {
                //登录失败
                if (request.getAttribute("first") == null) {
                    String errorMessage = "密码错误。";
                    request.setAttribute("message", errorMessage);
                }
            }
        }
        else {
            //登录失败
            if (request.getAttribute("first") == null) {
                String errorMessage = "密码错误。";
                request.setAttribute("message", errorMessage);
            }
        }
        return "index";
    }

}
