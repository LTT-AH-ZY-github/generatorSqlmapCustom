package com.vote.po;

public class Userlogin {
    private Integer uid;

    private String username;

    private String password;

    private String token;

    private String phone;

    private String email;

    private String uservisitcode;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUservisitcode() {
        return uservisitcode;
    }

    public void setUservisitcode(String uservisitcode) {
        this.uservisitcode = uservisitcode == null ? null : uservisitcode.trim();
    }
}