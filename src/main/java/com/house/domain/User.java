package com.house.domain;

public class User {
    private int no;//序号
    private String username;//用户名
    private String password;//密码

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", jury='" + jury + '\'' +
                '}';
    }


    public void setNo(int no) {
        this.no = no;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJury() {
        return jury;
    }

    public void setJury(String jury) {
        this.jury = jury;
    }

    private String name;//姓名
    private String jury;//权限组
}
