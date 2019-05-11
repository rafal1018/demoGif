package com.aka.demoGif.Controller;

import com.aka.demoGif.model.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {


    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/showGifsInBrowser")
    @ResponseBody
    public String showgifsInBrowser(){

        return gifRepository.getGifNames();
    }

}
