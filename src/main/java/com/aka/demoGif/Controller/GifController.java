package com.aka.demoGif.Controller;

import com.aka.demoGif.model.Gif;
import com.aka.demoGif.model.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String listGifs(ModelMap modelMap){

        //1. Wyciąganie gifów
        List<Gif> gifList = gifRepository.getGifs();

        //2. Przekazywanie gifa do view
        modelMap.put("gifs", gifList);

        //3. Zwracanie widoku
        return "home";
    }

    @RequestMapping("/favorites")
    public String gifFavourites(ModelMap modelMap){
        // Wedługschematu:
        // Analogicznie: 1. Pobieramy listę gifów (tylko ulubionych)
        List<Gif> favoriteGifs = gifRepository.getFavoriteGifs();

        // 2. Przekazywanie gifów do widoku
        modelMap.put("gifs", favoriteGifs);

        // Informacja: widok nazywa się favourite.html

        return "favorites";


    }

}
