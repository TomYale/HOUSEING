package com.house.domain;

import java.sql.Time;
import java.sql.Timestamp;

//退房记录
public class Tfrecord {
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getGno() {
        return gno;
    }

    public void setGno(String gno) {
        this.gno = gno;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getTftime() {
        return tftime;
    }

    public void setTftime(Timestamp tftime) {
        this.tftime = tftime;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public Timestamp getJbtime() {
        return jbtime;
    }

    public void setJbtime(Timestamp jbtime) {
        this.jbtime = jbtime;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    public String getYj() {
        return yj;
    }

    public void setYj(String yj) {
        this.yj = yj;
    }

    public double getSddeposit() {
        return sddeposit;
    }

    public void setSddeposit(double sddeposit) {
        this.sddeposit = sddeposit;
    }

    public double getYtsf() {
        return ytsf;
    }

    public void setYtsf(double ytsf) {
        this.ytsf = ytsf;
    }

    public double getYtdf() {
        return ytdf;
    }

    public void setYtdf(double ytdf) {
        this.ytdf = ytdf;
    }

    public double getFwdeposit() {
        return fwdeposit;
    }

    public void setFwdeposit(double fwdeposit) {
        this.fwdeposit = fwdeposit;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getYjstate() {
        return yjstate;
    }

    public void setYjstate(String yjstate) {
        this.yjstate = yjstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }
    private int no;//序号

    public Tfrecord(int no, String hno, double measure, String layout, String applicant, String idc, String gno, String reason, String qual, String type, Timestamp tftime, String pnumber, Timestamp jbtime, String hname, String bank, String bankno, String yj, double sddeposit, double ytsf, double ytdf, double fwdeposit, double other, double sum, String yjstate, String remark) {
        this.no = no;
        this.hno = hno;
        this.measure = measure;
        this.layout = layout;
        this.applicant = applicant;
        this.idc = idc;
        this.gno = gno;
        this.reason = reason;
        this.qual = qual;
        this.type = type;
        this.tftime = tftime;
        this.pnumber = pnumber;
        this.jbtime = jbtime;
        this.hname = hname;
        this.bank = bank;
        this.bankno = bankno;
        this.yj = yj;
        this.sddeposit = sddeposit;
        this.ytsf = ytsf;
        this.ytdf = ytdf;
        this.fwdeposit = fwdeposit;
        this.other = other;
        this.sum = sum;
        this.yjstate = yjstate;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Tfrecord{" +
                "no=" + no +
                ", hno='" + hno + '\'' +
                ", measure=" + measure +
                ", layout='" + layout + '\'' +
                ", applicant='" + applicant + '\'' +
                ", idc='" + idc + '\'' +
                ", gno='" + gno + '\'' +
                ", reason='" + reason + '\'' +
                ", qual='" + qual + '\'' +
                ", type='" + type + '\'' +
                ", tftime=" + tftime +
                ", pnumber='" + pnumber + '\'' +
                ", jbtime=" + jbtime +
                ", hname='" + hname + '\'' +
                ", bank='" + bank + '\'' +
                ", bankno='" + bankno + '\'' +
                ", yj='" + yj + '\'' +
                ", sddeposit=" + sddeposit +
                ", ytsf=" + ytsf +
                ", ytdf=" + ytdf +
                ", fwdeposit=" + fwdeposit +
                ", other=" + other +
                ", sum=" + sum +
                ", yjstate='" + yjstate + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    private String hno;//房号
    private double measure;//面积
    private String layout;//户型
    private String applicant;//申请人
    private String idc;//身份证
    private String gno;//保障号
    private String reason;//退房原因
    private String qual;//资格
    private String type;//公廉
    private Timestamp tftime;//退房时间
    private String pnumber;//联系电话
    private Timestamp jbtime;//交表时间
    private String hname;//户名
    private String bank;//开户银行
    private String bankno;//银行账号
    private String yj;//押金单
    private double sddeposit;//水电押金
    private double ytsf;//应退水费
    private double ytdf;//应退电费
    private double fwdeposit;//房屋押金
    private double other;//其他退费
    private double sum;//合计
    private String yjstate;//押金状态
    private String remark;//备注
}
