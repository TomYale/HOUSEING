package com.house.domain;

import java.sql.Timestamp;

public class Lottery {//摇号预分配

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
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

    public int getBznum() {
        return bznum;
    }

    public void setBznum(int bznum) {
        this.bznum = bznum;
    }

    public int getLowbznum() {
        return lowbznum;
    }

    public void setLowbznum(int lowbznum) {
        this.lowbznum = lowbznum;
    }

    public int getPubbznum() {
        return pubbznum;
    }

    public void setPubbznum(int pubbznum) {
        this.pubbznum = pubbznum;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public String getIfagree() {
        return ifagree;
    }

    public void setIfagree(String ifagree) {
        this.ifagree = ifagree;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getViolation() {
        return violation;
    }

    public void setViolation(String violation) {
        this.violation = violation;
    }

    private int no;//序号

    public Lottery(int no, String name, String id, String idc, String pnumber, String company, String hno, String bno, String rno, double measure, String layout, int bznum, int lowbznum, int pubbznum, String dno, String type, String remark, String family, String original, Timestamp deadline, String ifagree, String insurance, String result, String violation) {
        this.no = no;
        this.name = name;
        this.id = id;
        this.idc = idc;
        this.pnumber = pnumber;
        this.company = company;
        this.hno = hno;
        this.bno = bno;
        this.rno = rno;
        this.measure = measure;
        this.layout = layout;
        this.bznum = bznum;
        this.lowbznum = lowbznum;
        this.pubbznum = pubbznum;
        this.dno = dno;
        this.type = type;
        this.remark = remark;
        this.family = family;
        this.original = original;
        this.deadline = deadline;
        this.ifagree = ifagree;
        this.insurance = insurance;
        this.result = result;
        this.violation = violation;
    }

    @Override
    public String toString() {
        return "Lottery{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", idc='" + idc + '\'' +
                ", pnumber='" + pnumber + '\'' +
                ", company='" + company + '\'' +
                ", hno='" + hno + '\'' +
                ", bno='" + bno + '\'' +
                ", rno='" + rno + '\'' +
                ", measure=" + measure +
                ", layout='" + layout + '\'' +
                ", bznum=" + bznum +
                ", lowbznum=" + lowbznum +
                ", pubbznum=" + pubbznum +
                ", dno='" + dno + '\'' +
                ", type='" + type + '\'' +
                ", remark='" + remark + '\'' +
                ", family='" + family + '\'' +
                ", original='" + original + '\'' +
                ", deadline=" + deadline +
                ", ifagree='" + ifagree + '\'' +
                ", insurance='" + insurance + '\'' +
                ", result='" + result + '\'' +
                ", violation='" + violation + '\'' +
                '}';
    }

    private String name;//姓名
    private String id;//卡号编号
    private String idc;//身份证
    private String pnumber;//联系电话
    private String company;//单位
    private String hno;//房源编号
    private String bno;//栋号
    private String rno;//房号
    private double measure;//面积
    private String layout;//户型
    private int bznum;//保障人口
    private int lowbznum;//廉租保障人数
    private int pubbznum;//公租保障人数
    private String dno;//档案编号
    private String type;//公廉
    private String remark;//备注
    private String family;//家庭成员
    private String original;//原租配
    private Timestamp deadline;//截止日期
    private String ifagree;//签约情况
    private String insurance;//是否在保
    private String  result;//处理结果
    private String violation;//违规事项

}
