/*
*
* SymManager.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class SymManager {
    /**
     * 
     */
    private String managerid;

    /**
     * 员工编号: SM00001
     */
    private String managerno;

    /**
     * 登录名
     */
    private String loginname;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 
     */
    private Integer passwordformat;

    /**
     * 
     */
    private String passwordsalt;

    /**
     * 锁定标记
     */
    private Byte islockedout;

    /**
     * 最后登录时间
     */
    private Date lastlogindate;

    /**
     * 最后密码修改时间
     */
    private Date lastpasswordchangeddate;

    /**
     * 最后锁定时间
     */
    private Date lastlockoutdate;

    /**
     * 
     */
    private Date createdon;

    /**
     * 
     */
    private String createdby;

    /**
     * 删除标记
     */
    private Byte isdeleted;

    /**
     * 锁定标记: 0未锁定 2锁定（禁止登录）
     */
    private Byte isapproved;

    /**
     * 账号助记码
     */
    private String mnemonicname;

    /**
     * 
     * @return ManagerId 
     */
    public String getManagerid() {
        return managerid;
    }

    /**
     * 
     * @param managerid 
     */
    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    /**
     * 员工编号: SM00001
     * @return ManagerNo 员工编号: SM00001
     */
    public String getManagerno() {
        return managerno;
    }

    /**
     * 员工编号: SM00001
     * @param managerno 员工编号: SM00001
     */
    public void setManagerno(String managerno) {
        this.managerno = managerno;
    }

    /**
     * 登录名
     * @return LoginName 登录名
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * 登录名
     * @param loginname 登录名
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * 登录密码
     * @return Password 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 登录密码
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return PasswordFormat 
     */
    public Integer getPasswordformat() {
        return passwordformat;
    }

    /**
     * 
     * @param passwordformat 
     */
    public void setPasswordformat(Integer passwordformat) {
        this.passwordformat = passwordformat;
    }

    /**
     * 
     * @return PasswordSalt 
     */
    public String getPasswordsalt() {
        return passwordsalt;
    }

    /**
     * 
     * @param passwordsalt 
     */
    public void setPasswordsalt(String passwordsalt) {
        this.passwordsalt = passwordsalt;
    }

    /**
     * 锁定标记
     * @return IsLockedOut 锁定标记
     */
    public Byte getIslockedout() {
        return islockedout;
    }

    /**
     * 锁定标记
     * @param islockedout 锁定标记
     */
    public void setIslockedout(Byte islockedout) {
        this.islockedout = islockedout;
    }

    /**
     * 最后登录时间
     * @return LastLoginDate 最后登录时间
     */
    public Date getLastlogindate() {
        return lastlogindate;
    }

    /**
     * 最后登录时间
     * @param lastlogindate 最后登录时间
     */
    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    /**
     * 最后密码修改时间
     * @return LastPasswordChangedDate 最后密码修改时间
     */
    public Date getLastpasswordchangeddate() {
        return lastpasswordchangeddate;
    }

    /**
     * 最后密码修改时间
     * @param lastpasswordchangeddate 最后密码修改时间
     */
    public void setLastpasswordchangeddate(Date lastpasswordchangeddate) {
        this.lastpasswordchangeddate = lastpasswordchangeddate;
    }

    /**
     * 最后锁定时间
     * @return LastLockoutDate 最后锁定时间
     */
    public Date getLastlockoutdate() {
        return lastlockoutdate;
    }

    /**
     * 最后锁定时间
     * @param lastlockoutdate 最后锁定时间
     */
    public void setLastlockoutdate(Date lastlockoutdate) {
        this.lastlockoutdate = lastlockoutdate;
    }

    /**
     * 
     * @return CreatedOn 
     */
    public Date getCreatedon() {
        return createdon;
    }

    /**
     * 
     * @param createdon 
     */
    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    /**
     * 
     * @return CreatedBy 
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * 
     * @param createdby 
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * 删除标记
     * @return IsDeleted 删除标记
     */
    public Byte getIsdeleted() {
        return isdeleted;
    }

    /**
     * 删除标记
     * @param isdeleted 删除标记
     */
    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }

    /**
     * 锁定标记: 0未锁定 2锁定（禁止登录）
     * @return IsApproved 锁定标记: 0未锁定 2锁定（禁止登录）
     */
    public Byte getIsapproved() {
        return isapproved;
    }

    /**
     * 锁定标记: 0未锁定 2锁定（禁止登录）
     * @param isapproved 锁定标记: 0未锁定 2锁定（禁止登录）
     */
    public void setIsapproved(Byte isapproved) {
        this.isapproved = isapproved;
    }

    /**
     * 账号助记码
     * @return MnemonicName 账号助记码
     */
    public String getMnemonicname() {
        return mnemonicname;
    }

    /**
     * 账号助记码
     * @param mnemonicname 账号助记码
     */
    public void setMnemonicname(String mnemonicname) {
        this.mnemonicname = mnemonicname;
    }
}