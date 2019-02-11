package com.example.krishna.retrofitjsonparsing;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RJDataModel {
    private String id;
    private String created_at;
    private String updated_at;
    private int width;
    private int height;
    private String color;
    private String description;
    private Urls urls;
    private  Links links;
    private ArrayList<Categories >categories=null;
    private Boolean sponsored;
    @SerializedName("sponsored_by")
    private SponsoredBy sponsoredBy;
    @SerializedName("sponsored_impressions_id")
    private String sponsoredImpressionsId;
    @SerializedName("likes")
    private int linkes;
    @SerializedName("liked_by_user")
    private boolean likedByUser;
    private ArrayList<CurrentUserCollections> current_user_collections=null;
    private User user;

    public String getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public Urls getUrls() {
        return urls;
    }

    public Links getLinks() {
        return links;
    }

    public ArrayList<Categories> getCategories() {
        return categories;
    }

    public Boolean getSponsored() {
        return sponsored;
    }

    public SponsoredBy getSponsoredBy() {
        return sponsoredBy;
    }

    public String getSponsoredImpressionsId() {
        return sponsoredImpressionsId;
    }

    public int getLinkes() {
        return linkes;
    }

    public boolean isLikedByUser() {
        return likedByUser;
    }

    public ArrayList<CurrentUserCollections> getCurrent_user_collections() {
        return current_user_collections;
    }

    public User getUser() {
        return user;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public void setCategories(ArrayList<Categories> categories) {
        this.categories = categories;
    }

    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    public void setSponsoredBy(SponsoredBy sponsoredBy) {
        this.sponsoredBy = sponsoredBy;
    }

    public void setSponsoredImpressionsId(String sponsoredImpressionsId) {
        this.sponsoredImpressionsId = sponsoredImpressionsId;
    }

    public void setLinkes(int linkes) {
        this.linkes = linkes;
    }

    public void setLikedByUser(boolean likedByUser) {
        this.likedByUser = likedByUser;
    }

    public void setCurrent_user_collections(ArrayList<CurrentUserCollections> current_user_collections) {
        this.current_user_collections = current_user_collections;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
