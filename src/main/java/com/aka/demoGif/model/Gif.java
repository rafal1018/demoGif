package com.aka.demoGif.model;

public class Gif {

    private String name;
    private String username;
    private Boolean favourite;

    public Gif(String name, String userName, Boolean favourite) {
        this.name = name;
        this.username = userName;
        this.favourite = favourite;
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

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }
}
