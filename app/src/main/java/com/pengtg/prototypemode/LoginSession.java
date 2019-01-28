package com.pengtg.prototypemode;

public class LoginSession {
    private static LoginSession sLoginSession = null;
    //已登录用户
    private User loginedUser;
    private LoginSession(){

    }
    public static LoginSession  getLoginSession(){
        if(sLoginSession == null){
            synchronized (LoginSession.class){
                if(sLoginSession == null){
                    sLoginSession = new LoginSession();
                }
            }
        }
        return sLoginSession;
    }
    //设置已登录的用户信息，不对外开放
    void setLoginedUser(User user){
        loginedUser = user;
    }

    public User getLoginedUser(){
//        return loginedUser;
        return loginedUser.clone();
    }
}
