package com.example.krishna.retrofitjsonparsing;

class User {
    private String id;
    private String updated_at;
    private String username;
    private String name;
    private String first_name;
    private String last_name;
    private String twitter_username;
    private String portfolio_url;
    private String bio;
    private String location;
    private String instagram_username;
    private int total_collections;
    private int total_likes;
    private int total_photos;
    private Links links;
    private  ProfileImage profile_image;

    public String getId() {
        return id;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getTwitter_username() {
        return twitter_username;
    }

    public String getPortfolio_url() {
        return portfolio_url;
    }

    public String getBio() {
        return bio;
    }

    public String getLocation() {
        return location;
    }

    public String getInstagram_username() {
        return instagram_username;
    }

    public int getTotal_collections() {
        return total_collections;
    }

    public int getTotal_likes() {
        return total_likes;
    }

    public int getTotal_photos() {
        return total_photos;
    }

    public Links getLinks() {
        return links;
    }

    public ProfileImage getProfile_image() {
        return profile_image;
    }
}
