package com.example.pract1.controler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class spring {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/index")
    public String calculate(@RequestParam(name = "firstval", required = false, defaultValue = "0") double firstval,
                            @RequestParam(name = "secval", required = false, defaultValue = "0") double secval,
                            @RequestParam(name = "math_operation", required = false, defaultValue = "+") String mathval, Model model) {
//        double res = 1;
        System.out.println(mathval);
        double res = switch (mathval) {
            case "+"-> firstval + secval;
            case "-"->firstval - secval;
            case "*"-> firstval * secval;
            case "/"-> firstval / secval;
            default-> 0;
        };
        model.addAttribute("res", res);

        return "rezultat";
    }
    @PostMapping("/index")
    public String POSTcalculate(@RequestParam(name = "firstval", required = false, defaultValue = "0") double firstval,
                                @RequestParam(name = "secval", required = false, defaultValue = "0") double secval,
                                @RequestParam(name = "math_operation", required = false, defaultValue = "+") String mathval, Model model) {
//        double res = 1;
        System.out.println(mathval);
        double res = switch (mathval) {
            case "+"-> firstval + secval;
            case "-"->firstval - secval;
            case "*"-> firstval * secval;
            case "/"-> firstval / secval;
            default-> 0;
        };
        model.addAttribute("res", res);

        return "rezultat";
    }

}
