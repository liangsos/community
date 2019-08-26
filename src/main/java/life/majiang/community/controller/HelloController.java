package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Chen Hualiang
 * @date 2019/8/23 - 17:59
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "index";
    }

}
