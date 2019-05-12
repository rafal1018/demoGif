package com.aka.demoGif.model.repository;

import com.aka.demoGif.model.Category;
import com.aka.demoGif.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true, 1),
            new Gif("ben-and-mike", "mika", true, 2),
            new Gif("book-dominos", "mem", true, 0),
            new Gif("compiler-bot", "bot", true, 1),
            new Gif("cowboy-coder", "code", true, 1),
            new Gif("infinite-andrew", "andrew", true, 2)
    );

    public String getGifNames(){

        String names = "";

        for (Gif g : ALL_GIFS){

            names += g.getName();
        }

        return names;
    }

    public List<Gif> getGifs(){

        return ALL_GIFS;
    }

    public List<Gif> getFavoriteGifs(){

        List<Gif> favoriteGifs = new ArrayList<>();

        for (Gif g : ALL_GIFS){

            if (g.getFavorite()){

                favoriteGifs.add(g);
            }

        }
        return favoriteGifs;
    }

    public List<Gif> getGifsByCategoryId(int id){

        List<Gif> listByCategoryId = new ArrayList<>();

        for (Gif g : ALL_GIFS){
            if (g.getCategoryId() == id){

                listByCategoryId.add(g);
            }
        }

        return listByCategoryId;
    }
}
