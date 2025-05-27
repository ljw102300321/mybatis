package com.library.pojo;

public class systemAdministrator {
    private int sysadminId;
    private String sysadminName;
    private String sysadminPassword;

    public systemAdministrator() {
    }

    public systemAdministrator(int sysadminId, String sysadminName, String sysadminPassword) {
        this.sysadminId = sysadminId;
        this.sysadminName = sysadminName;
        this.sysadminPassword = sysadminPassword;
    }

    /**
     * 获取
     * @return sysadminId
     */
    public int getSysadminId() {
        return sysadminId;
    }

    /**
     * 设置
     * @param sysadminId
     */
    public void setSysadminId(int sysadminId) {
        this.sysadminId = sysadminId;
    }

    /**
     * 获取
     * @return sysadminName
     */
    public String getSysadminName() {
        return sysadminName;
    }

    /**
     * 设置
     * @param sysadminName
     */
    public void setSysadminName(String sysadminName) {
        this.sysadminName = sysadminName;
    }

    /**
     * 获取
     * @return sysadminPassword
     */
    public String getSysadminPassword() {
        return sysadminPassword;
    }

    /**
     * 设置
     * @param sysadminPassword
     */
    public void setSysadminPassword(String sysadminPassword) {
        this.sysadminPassword = sysadminPassword;
    }

    public String toString() {
        return "systemAdministrator{sysadminId = " + sysadminId + ", sysadminName = " + sysadminName + ", sysadminPassword = " + sysadminPassword + "}";
    }
}
