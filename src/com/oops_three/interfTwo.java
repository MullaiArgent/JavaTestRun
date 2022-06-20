package com.oops_three;

interface GoogleApi{
    boolean emailVerified();
    void location();
    void loginTokenDateExpiry();
    void cookiesValidation();
}

class MyWebSite implements GoogleApi{

    public void news(){}
    public void captchacheck(){}

    @Override
    public boolean emailVerified() {
        return false;
    }

    @Override
    public void location() {

    }

    @Override
    public void loginTokenDateExpiry() {

    }

    @Override
    public void cookiesValidation() {

    }
}
interface Design{

    void frontEnd();
    void backend();
    void dbcon();

}

class Junior implements Design {

    @Override
    public void frontEnd() {

    }

    @Override
    public void backend() {

    }

    @Override
    public void dbcon() {

    }
}


public class interfTwo {
    public static void main(String[] args) {

    }
}
