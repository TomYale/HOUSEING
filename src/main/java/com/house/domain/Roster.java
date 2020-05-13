package com.house.domain;

import java.sql.Time;
import java.sql.Timestamp;

public class Roster {
    private int no;//序号
    private String zname;//小区名称
    private String roomno;//房号
    private double measure;//面积
    private String layout;//户型
    private String name;//住户姓名
    private String idc;//身份证号
    private String phnumber;//联系电话
    private Timestamp intime;//入住时间
    private String gno;//保障号
    private int prent;//公租
    private int lrent;//廉租

    @Override
    public String toString() {
        return "Roster{" +
                "no=" + no +
                ", zname='" + zname + '\'' +
                ", roomno='" + roomno + '\'' +
                ", measure=" + measure +
                ", layout='" + layout + '\'' +
                ", name='" + name + '\'' +
                ", idc='" + idc + '\'' +
                ", phnumber='" + phnumber + '\'' +
                ", intime=" + intime +
                ", gno='" + gno + '\'' +
                ", prent=" + prent +
                ", lrent=" + lrent +
                ", sum=" + sum +
                ", avemeasure=" + avemeasure +
                ", rent=" + rent +
                ", pfee=" + pfee +
                ", zytftime=" + zytftime +
                ", wgreason='" + wgreason + '\'' +
                ", fwtime=" + fwtime +
                ", yqtime=" + yqtime +
                ", tktime=" + tktime +
                ", bztype='" + bztype + '\'' +
                ", family='" + family + '\'' +
                ", zhtype='" + zhtype + '\'' +
                ", ifback='" + ifback + '\'' +
                ", remark='" + remark + '\'' +
                ", ifqt='" + ifqt + '\'' +
                ", yxtime=" + yxtime +
                '}';
    }

    private int sum;//合计

    public Roster(int no, String zname, String roomno, double measure, String layout, String name, String idc, String phnumber, Timestamp intime, String gno, int prent, int lrent, int sum, double avemeasure, double rent, double pfee, Timestamp zytftime, String wgreason, Timestamp fwtime, Timestamp yqtime, Timestamp tktime, String bztype, String family, String zhtype, String ifback, String remark, String ifqt, Timestamp yxtime) {
        this.no = no;
        this.zname = zname;
        this.roomno = roomno;
        this.measure = measure;
        this.layout = layout;
        this.name = name;
        this.idc = idc;
        this.phnumber = phnumber;
        this.intime = intime;
        this.gno = gno;
        this.prent = prent;
        this.lrent = lrent;
        this.sum = sum;
        this.avemeasure = avemeasure;
        this.rent = rent;
        this.pfee = pfee;
        this.zytftime = zytftime;
        this.wgreason = wgreason;
        this.fwtime = fwtime;
        this.yqtime = yqtime;
        this.tktime = tktime;
        this.bztype = bztype;
        this.family = family;
        this.zhtype = zhtype;
        this.ifback = ifback;
        this.remark = remark;
        this.ifqt = ifqt;
        this.yxtime = yxtime;
    }

    private double avemeasure;//人均保障面积
    private double rent;//房租
    private double pfee;//物业费

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
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

    public String getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    public String getGno() {
        return gno;
    }

    public void setGno(String gno) {
        this.gno = gno;
    }

    public int getPrent() {
        return prent;
    }

    public void setPrent(int prent) {
        this.prent = prent;
    }

    public int getLrent() {
        return lrent;
    }

    public void setLrent(int lrent) {
        this.lrent = lrent;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAvemeasure() {
        return avemeasure;
    }

    public void setAvemeasure(double avemeasure) {
        this.avemeasure = avemeasure;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getPfee() {
        return pfee;
    }

    public void setPfee(double pfee) {
        this.pfee = pfee;
    }

    public Timestamp getZytftime() {
        return zytftime;
    }

    public void setZytftime(Timestamp zytftime) {
        this.zytftime = zytftime;
    }

    public String getWgreason() {
        return wgreason;
    }

    public void setWgreason(String wgreason) {
        this.wgreason = wgreason;
    }

    public Timestamp getFwtime() {
        return fwtime;
    }

    public void setFwtime(Timestamp fwtime) {
        this.fwtime = fwtime;
    }

    public Timestamp getYqtime() {
        return yqtime;
    }

    public void setYqtime(Timestamp yqtime) {
        this.yqtime = yqtime;
    }

    public Timestamp getTktime() {
        return tktime;
    }

    public void setTktime(Timestamp tktime) {
        this.tktime = tktime;
    }

    public String getBztype() {
        return bztype;
    }

    public void setBztype(String bztype) {
        this.bztype = bztype;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getZhtype() {
        return zhtype;
    }

    public void setZhtype(String zhtype) {
        this.zhtype = zhtype;
    }

    public String getIfback() {
        return ifback;
    }

    public void setIfback(String ifback) {
        this.ifback = ifback;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIfqt() {
        return ifqt;
    }

    public void setIfqt(String ifqt) {
        this.ifqt = ifqt;
    }

    public Timestamp getYxtime() {
        return yxtime;
    }

    public void setYxtime(Timestamp yxtime) {
        this.yxtime = yxtime;
    }

    private Timestamp zytftime;//自愿退房时间
    private String wgreason;//违规事由
    private Timestamp fwtime;//发文时间
    private Timestamp yqtime;//延期时间
    private Timestamp tktime;//腾空房屋时间
    private String bztype;//保障类型
    private String family;//家庭成员
    private String zhtype;//住户类型
    private String ifback;//是否已退
    private String remark;//备注
    private String ifqt;//是否清退
    private Timestamp yxtime;//资格有效期
}
