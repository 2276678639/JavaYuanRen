package com.company.DButil;

public class MethodFunction {

    private DButil dButil=new DButil();  //保持DButil的唯一性  就是为了宝石dbutil对象的数组唯一

    /**
     * 对User数组做添加操作
     * @param user
     */
    public void addUser(User user){
        //首先获取Users数组

        User[] users=dButil.getUsers();
        int index=dButil.getIndex();
        users[index]=user;
        index++;
        dButil.setIndex(index);//自加之后要把自加之后的索引重新赋值给dButil对象的index   方便下一次调用addUser（）方法获取index


    }

    public void deleteUser(String name){   //根据唯一条件删除
        if (name==null){
            return;
        }
        User[] users = dButil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (name.equals(users[i].getName())){
                //如果在数组中找到这个对象  对其进行删除操作
                users[i]=null;
                for (int j = 0; j < users.length-1; j++) {
                    users[j]=users[j+1];
                    if (j==users.length-2){
                        users[j+1]=null;
                        break;
                    }
                }

                break;
            }
        }
        int index = dButil.getIndex();
        dButil.setIndex(--index);


    }



    public void updateUser(String idCard,String password,String address,String phone){
        if (idCard==null){
            return;
        }
        User[] users = dButil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (idCard.equals(users[i].getIdCard())){
                users[i].setPassword((password));
                users[i].setPhone(phone);
                users[i].setPassword(password);
                break;
            }
        }
    }


    /**
     * 打印数组中所有的元素
     */

    public void print(){

        User[] users= dButil.getUsers();

        for (int i = 0; i < dButil.getIndex(); i++) {
            System.out.println(users[i].toString());
        }


    }


}
