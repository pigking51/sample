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
    @GetMapping("/sample/index.html")
    public String index(){
        return "index";
    }

    @GetMapping("/sample/singleProduct.html")
    public String singleProduct(){
        return "singleProduct";
    }
    @GetMapping("/sample/login")
    public String login(){
        return "login";
    }
    @GetMapping("/sample/cart.html")
    public String cart(){
        return "cart";
    }
    @GetMapping("/sample/myPage.html")
    public String myPage(){
        return "myPage";
    }
}
