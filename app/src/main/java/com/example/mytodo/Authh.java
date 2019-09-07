package com.example.mytodo;

public class Authh {
    private static final String EMAIL="namandfon@hotmail.com"; //**
    private static final String PASSWORD="0850445415Ff"; //**

    private String mEmail;
    private  String mPassword;

    public Authh(String email,String password){
        this.mEmail=email;
        this.mPassword=password;
    }
    public boolean check() {
        if (mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
}
