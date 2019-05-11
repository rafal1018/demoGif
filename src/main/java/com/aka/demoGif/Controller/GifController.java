package com.aka.demoGif.Controller;

import com.aka.demoGif.model.Gif;
import com.aka.demoGif.model.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GifController {


    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/showGifsInBrowser")
    @ResponseBody
    public String showgifsInBrowser(){

        return gifRepository.getGifNames();
    }

    @RequestMapping("/")
    @ResponseBody
    public String listGifs(){

        //1. Wyciąganie gifów
        List<Gif> gifList = gifRepository.getGifs();

        //2. Przekazywanie gifa do viwe

        //3. Zwracanie widoku

        return gifRepository.getGifs().toString();
    }

}
