package com.aka.demoGif.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @RequestMapping("/showGifsInBrowser")
    @ResponseBody
    public String showgifsInBrowser(){
        return "gifs";
    }

}
