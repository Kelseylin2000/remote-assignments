package com.example.assignments.data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;



@Controller
public class NameController {

    @GetMapping("/myName")
    public String getName(@CookieValue(value = "name", required = false) String name, Model model, HttpServletResponse response) {
        if (name != null) {
            model.addAttribute("name", name);
            return "showName"; 
        } else {
            return trackName(name, response);
        }
    }

    @GetMapping("/trackName")
    public String trackName(@RequestParam(value = "name", required = false) String name, HttpServletResponse response) {

        if(name != null){
            Cookie nameCookie = new Cookie("name", name);
            response.addCookie(nameCookie);
            return "redirect:/myName";
        }else{
            return "trackName";
        }
    }

}
