package com.kk.eureka.model.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class UserQuery {
    /**
     * word
     */
    private String word;
    /**
     * ID
     */
    private String id;
    /**
     * 用户ID
     */
    private String userNo;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 账号名
     */
    private String shortName;
    /**
     * 账号密码
     */
    private String password;
    /**
     * 手机号
     */
    private String telephone;
    /**
     * QQ号
     */
    private String qqCode;
    /**
     * 性别1-男0-女
     */
    private String gender;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern ="yyyy-MM-dd",timezone="GMT+8")
    private Date createTime;
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
            this.id = id;
    }
    public String getUserNo() {
        return userNo;
    }
    public void setUserNo(String userNo) {
            this.userNo = userNo;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
            this.userName = userName;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
            this.shortName = shortName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
            this.password = password;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
            this.telephone = telephone;
    }
    public String getQqCode() {
        return qqCode;
    }
    public void setQqCode(String qqCode) {
            this.qqCode = qqCode;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
            this.gender = gender;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
            this.createTime = createTime;
    }
}
