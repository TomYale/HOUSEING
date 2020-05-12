package com.house.domain;

import java.sql.Timestamp;

public class Wxrecord {
    private int no;//序号
    private String zname;//小区名称
    private String hno;//房号
    private double measure;//面积
    private String layout;//户型
    private String rtype;//维修类型
    private String result;//结果

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Wxrecord{" +
                "no=" + no +
                ", zname='" + zname + '\'' +
                ", hno='" + hno + '\'' +
                ", measure=" + measure +
                ", layout='" + layout + '\'' +
                ", rtype='" + rtype + '\'' +
                ", result='" + result + '\'' +
                ", intime=" + intime +
                ", dotime=" + dotime +
                ", rno='" + rno + '\'' +
                '}';
    }

    public Wxrecord(int no, String zname, String hno, double measure, String layout, String rtype, String result, Timestamp intime, Timestamp dotime, String rno) {
        this.no = no;
        this.zname = zname;
        this.hno = hno;
        this.measure = measure;
        this.layout = layout;
        this.rtype = rtype;
        this.result = result;
        this.intime = intime;
        this.dotime = dotime;
        this.rno = rno;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
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

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    public Timestamp getDotime() {
        return dotime;
    }

    public void setDotime(Timestamp dotime) {
        this.dotime = dotime;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    private Timestamp intime;//填报日期
    private Timestamp dotime;//处理日期
    private String rno;//维修编号
}
