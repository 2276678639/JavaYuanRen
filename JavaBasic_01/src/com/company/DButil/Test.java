package com.company.DButil;

public class Test {

    public static void main(String[] args) {

        User user=new User();
        user.setName("张三");
        user.setAddress("");
        user.setIdCard(123);
        user.setPhone("");
        user.setPassword("");
        user.setSex('男');

        MethodFunction methodFunction=new MethodFunction();
        methodFunction.addUser(user);
       // methodFunction.print();







        user=new User();
        user.setName("张三1");
        user.setAddress("2");
        user.setIdCard(123);
        user.setPhone("0");
        user.setPassword("2");
        user.setSex('男');

        methodFunction.addUser(user);
        methodFunction.print();


        methodFunction.updateUser("9527","456","科技园","415678");
        methodFunction.print();

    }

}
