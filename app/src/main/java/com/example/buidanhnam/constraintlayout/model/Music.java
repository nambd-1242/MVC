package com.example.buidanhnam.constraintlayout.model;

import java.io.Serializable;

/**
 * Created by Bui Danh Nam on 19/12/2017.
 */

public class Music implements Serializable {
    private String nameSong ;
    private String nameSinger ;
    private String image ;
    private String lyrics ;

    public Music() {
    }

    public Music(String nameSong, String nameSinger, String image, String lyrics) {
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.image = image;
        this.lyrics = lyrics;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
