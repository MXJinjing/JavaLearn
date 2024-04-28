package com.itheima.d12_api_object;

public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private double[] scores;

    public User() {
    }

    public User(int id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    public User clone() {
        try {
            User u2 = (User) super.clone();
            u2.scores = (double[]) scores.clone();
            return u2;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
