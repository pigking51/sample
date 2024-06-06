package dw.smaple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/login")
    public String login_form(){
        return "login_form";
    }
    @GetMapping("/articles")
    public String articles(){
        return "articles";
    }
    @GetMapping("/smaple/index.html")
    public String index(){
        return "index";
    }
    @GetMapping("/smaple/signup.html")
    public String signup(){
        return "signup";
    }
    @GetMapping("/smaple/singleProduct.html")
    public String singleProduct(){
        return "singleProduct";
    }
    @GetMapping("/smaple/login.html")
    public String login(){
        return "login";
    }
    @GetMapping("/smaple/cart.html")
    public String cart(){
        return "cart";
    }
    @GetMapping("/smaple/myPage.html")
    public String myPage(){
        return "myPage";
    }
}
