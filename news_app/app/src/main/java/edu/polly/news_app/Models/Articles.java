package edu.polly.news_app.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Articles {
    @SerializedName("source")
    @Expose
    private  Sources sources;

    @SerializedName("author")
    @Expose
    private  String author;

    @SerializedName("tittle")
    @Expose
    private  String tittle;

    @SerializedName("description")
    @Expose
    private  String description;

    @SerializedName("urlToImage")
    @Expose
    private  String urlToImage;

    @SerializedName("publishedAt")
    @Expose
    private  String publishedAt;

    public Sources getSources() {
        return sources;
    }

    public void setSources(Sources sources) {
        this.sources = sources;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}
