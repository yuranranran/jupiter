package com.laioffer.jupiter.entity;

import sun.security.provider.certpath.Builder;

public class Game {
    // fields
    private String name;
    private String developer;
    private String releaseTime;
    private String website;
    private double price;

//    // old constructor example
//    public Game(String name, String developer, String releaseTime, String website, double price) {
//        this.name = name;
//        this.developer = developer;
//        this.releaseTime = releaseTime;
//        this.website = website;
//        this.price = price;
//    }

    // methods
    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public String getWebsite() {
        return website;
    }

    public double getPrice() {
        return price;
    }

    // constructor using Builder Pattern
    public Game(Builder builder) {
        this.name = builder.name;
        this.developer = builder.developer;
        this.releaseTime = builder.releaseTime;
        this.website = builder.website;
        this.price = builder.price;
    }

    public static class Builder {
        private String name;
        private String developer;
        private String releaseTime;
        private String website;
        private double price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }

        public Builder setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }
}
