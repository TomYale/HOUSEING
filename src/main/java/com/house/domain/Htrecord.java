package com.house.domain;

import java.sql.Timestamp;

public class Htrecord {
    private int no;//序号
    private String roomno;//房号
    private String name;//住户姓名
    private String idc;//身份证
    private String dno;//档案编号
    private Timestamp buytime;//购房时间
    private String place;//购房地点及房号
    private double measure;//房产面积
    private Timestamp jftime;//购房交房日
    private Timestamp tktime;//可延期腾空房时间
    private String pnumber;//联系电话
    private String ifqt;//是否已发清退通知

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "Htrecord{" +
                "no=" + no +
                ", roomno='" + roomno + '\'' +
                ", name='" + name + '\'' +
                ", idc='" + idc + '\'' +
                ", dno='" + dno + '\'' +
                ", buytime=" + buytime +
                ", place='" + place + '\'' +
                ", measure=" + measure +
                ", jftime=" + jftime +
                ", tktime=" + tktime +
                ", pnumber='" + pnumber + '\'' +
                ", ifqt='" + ifqt + '\'' +
                ", tjtime=" + tjtime +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Htrecord(int no, String roomno, String name, String idc, String dno, Timestamp buytime, String place, double measure, Timestamp jftime, Timestamp tktime, String pnumber, String ifqt, Timestamp tjtime, String remark) {
        this.no = no;
        this.roomno = roomno;
        this.name = name;
        this.idc = idc;
        this.dno = dno;
        this.buytime = buytime;
        this.place = place;
        this.measure = measure;
        this.jftime = jftime;
        this.tktime = tktime;
        this.pnumber = pnumber;
        this.ifqt = ifqt;
        this.tjtime = tjtime;
        this.remark = remark;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public Timestamp getBuytime() {
        return buytime;
    }

    public void setBuytime(Timestamp buytime) {
        this.buytime = buytime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    public Timestamp getJftime() {
        return jftime;
    }

    public void setJftime(Timestamp jftime) {
        this.jftime = jftime;
    }

    public Timestamp getTktime() {
        return tktime;
    }

    public void setTktime(Timestamp tktime) {
        this.tktime = tktime;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getIfqt() {
        return ifqt;
    }

    public void setIfqt(String ifqt) {
        this.ifqt = ifqt;
    }

    public Timestamp getTjtime() {
        return tjtime;
    }

    public void setTjtime(Timestamp tjtime) {
        this.tjtime = tjtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Timestamp tjtime;//提交合同时间
    private String remark;//备注

}
