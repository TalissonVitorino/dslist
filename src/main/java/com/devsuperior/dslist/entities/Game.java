package com.devsuperior.dslist.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year")
    private Integer year;
    private String Genre;
    private String Platform;
    private String imgUrl;
    private String shortDescription;
    private String logDescription;

    public Game() {

    }

    public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl, String shortDescription, String logDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        Genre = genre;
        Platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.logDescription = logDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYer() {
        return year;
    }

    public void setYer(Integer yer) {
        this.year = yer;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) && Objects.equals(title,
                game.title) && Objects.equals(year, game.year) && Objects.equals(Genre, game.Genre)
                && Objects.equals(Platform, game.Platform) && Objects.equals(imgUrl, game.imgUrl)
                && Objects.equals(shortDescription, game.shortDescription)
                && Objects.equals(logDescription, game.logDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, Genre, Platform, imgUrl, shortDescription, logDescription);
    }
}
