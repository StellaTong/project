package opal.controller;

import opal.model.User;
import opal.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by dongsidou on 2016/6/26.
 */
@Controller
@RequestMapping("/userController")
public class UserController {

    private UserServiceI userService;
    private String actionName;


    public UserServiceI getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserServiceI userService) {
        this.userService = userService;
    }

    //localhost:8080:myopal/usercontroller/showUser/14
    @RequestMapping("/showuser/{id}")
    public String showUser(@PathVariable Integer id, HttpServletRequest request){
        User u = userService.getUserById(id);
        request.setAttribute("user",u);
        return "userInfro";

    }


    @RequestMapping("/useredit/{id}")
    public String userEdit(@PathVariable Integer id, HttpServletRequest request,Model model,HttpSession session){
        User user =userService.getUserById(id);
        actionName="useredit";
        user.setName(request.getParameter("user.name"));
        user.setPassword(request.getParameter("uer.password"));
        user.setUsername(request.getParameter("user.username"));
        user.setUsertype(request.getParameter("user.usertype"));
        user.setEmail(request.getParameter("user.email"));
        userService.updateUser(user);
        List<User> userList = userService.getAll();
        model.addAttribute("userlist",userList);
        return "userlist";

    }



    @RequestMapping("/login")
    public String login(String name, String password,Model model) {
        System.out.println(name);
        System.out.println(password);
        User u = userService.getUserByUserName(name);

        if (u != null && u.getPassword().equals(password)) {
            model.addAttribute("loginuser",u);
            if(u.getUsertype().equals("Admin")){
                return "welcome";
            }else if(u.getUsertype().equals("OT")){
                return "welcomeOT";
            } else if(u.getUsertype().equals("EPG")){
                return "welcome";
            }else if(u.getUsertype().equals("ProMem")){
                return "welcome";
            }else {
                return "welcome";
            }

        } else if (u != null && !u.getPassword().equals(password)) {
            model.addAttribute("errormessage", "用户密码错误，登录失败");
            return "index";
        } else if(u==null){
            model.addAttribute("errormessage", "用户不存在");
            return "index";
        }else {
            model.addAttribute("errormessage", "接口异常，请稍后再试");
            return "index";
        }
    }
    @RequestMapping("/userlist")
    public String userList(Model model,HttpServletRequest request){
        List<User> userList = userService.getAll();
        model.addAttribute("userlist",userList);
        return "userlist";

    }
    @RequestMapping("/userDeleteById/{id}")
    public String userDeleteById(@PathVariable Integer id,Model model,HttpServletRequest request){
        userService.deleteUserById(id);
        List<User> userList = userService.getAll();
        model.addAttribute("userlist",userList);
        return "userlist";

    }



    @RequestMapping("/useradd")
    public String userAdd(HttpServletRequest request, HttpSession session, Model model){
        User user =new User();
        user.setName(request.getParameter("user.name"));
        user.setUsername(request.getParameter("user.username"));
        user.setEmail(request.getParameter("user.email"));
        user.setPassword(request.getParameter("user.password"));
        user.setUsertype(request.getParameter("user.usertype"));
        userService.insert(user);
        List<User> userList = userService.getAll();
        model.addAttribute("userlist",userList);
        return "userlist";
    }

    @RequestMapping("/emptyuser")
    public String emptyuser(HttpServletRequest request, HttpSession session, Model model){
        User user =new User();
        actionName="emptyuser";
        request.setAttribute("user",user);
        return "useradd";

    }



    //用户注册
    @RequestMapping("/userRegister")
    public String userRegister(HttpServletRequest request,HttpSession session){
        User user =new User();
        user.setUsername(request.getParameter("user.name"));
        user.setName(request.getParameter("user.username"));
        user.setEmail(request.getParameter("user.email"));
        user.setPassword(request.getParameter("user.password"));
        user.setUsertype("Common");
        userService.insert(user);
        return "index";

    }


}
