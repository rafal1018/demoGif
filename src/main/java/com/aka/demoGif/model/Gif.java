package com.aka.demoGif.model;

public class Gif {

    private String name;
    private String username;
    private Boolean favorite;

    public Gif(String name, String userName, Boolean favorite) {
        this.name = name;
        this.username = userName;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
