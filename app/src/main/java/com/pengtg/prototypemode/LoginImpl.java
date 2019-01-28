package com.pengtg.prototypemode;
//登录实现
public class LoginImpl implements Login {
    @Override
    public void login() {
        //登录到服务器，获取到用户信息
        User loginedUser = new User();
        //将服务器返回的完整信息设置给loginedUser对象
        loginedUser.age = 22;
        loginedUser.name = "Mr.Simple";
        loginedUser.address = new Address("北京","朝阳区","劲松街道");

        //登录完之后将用户信息设置到Session中
        LoginSession.getLoginSession().setLoginedUser(loginedUser);

    }
}
