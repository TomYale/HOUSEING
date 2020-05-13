package com.house.domain;

import java.sql.Timestamp;

public class Recieved {
    private int no;//序号
    private String wno;//文号
    private Timestamp retime;//来文时间
    private String company;//来文单位
    private String sqhid;//申请户编号
    private String idc;//身份证

    @Override
    public String toString() {
        return "recieved{" +
                "no=" + no +
                ", wno='" + wno + '\'' +
                ", retime=" + retime +
                ", company='" + company + '\'' +
                ", sqhid='" + sqhid + '\'' +
                ", idc='" + idc + '\'' +
                ", zfno='" + zfno + '\'' +
                ", words='" + words + '\'' +
                ", phnumber='" + phnumber + '\'' +
                ", bzunit='" + bzunit + '\'' +
                ", fpunit='" + fpunit + '\'' +
                ", leaderps='" + leaderps + '\'' +
                ", result='" + result + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Recieved(int no, String wno, Timestamp retime, String company, String sqhid, String idc, String zfno, String words, String phnumber, String bzunit, String fpunit, String leaderps, String result, String remark) {
        this.no = no;
        this.wno = wno;
        this.retime = retime;
        this.company = company;
        this.sqhid = sqhid;
        this.idc = idc;
        this.zfno = zfno;
        this.words = words;
        this.phnumber = phnumber;
        this.bzunit = bzunit;
        this.fpunit = fpunit;
        this.leaderps = leaderps;
        this.result = result;
        this.remark = remark;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getWno() {
        return wno;
    }

    public void setWno(String wno) {
        this.wno = wno;
    }

    public Timestamp getRetime() {
        return retime;
    }

    public void setRetime(Timestamp retime) {
        this.retime = retime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSqhid() {
        return sqhid;
    }

    public void setSqhid(String sqhid) {
        this.sqhid = sqhid;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getZfno() {
        return zfno;
    }

    public void setZfno(String zfno) {
        this.zfno = zfno;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public String getBzunit() {
        return bzunit;
    }

    public void setBzunit(String bzunit) {
        this.bzunit = bzunit;
    }

    public String getFpunit() {
        return fpunit;
    }

    public void setFpunit(String fpunit) {
        this.fpunit = fpunit;
    }

    public String getLeaderps() {
        return leaderps;
    }

    public void setLeaderps(String leaderps) {
        this.leaderps = leaderps;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String zfno;//已配租房号
    private String words;//发文及来问内容
    private String phnumber;//联系电话
    private String bzunit;//保障股意见
    private String fpunit;//分配股意见
    private String leaderps;//领导批示
    private String result;//处理结果
    private String remark;//备注
}
