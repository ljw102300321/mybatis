package com.library.pojo;

public class BookAdministrator {

    private int adminId;
    private String adminName;
    private String adminPassword;

    public BookAdministrator() {
    }

    public BookAdministrator(int adminId, String adminName, String adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    /**
     * 获取
     * @return adminId
     */
    public int getAdminId() {
        return adminId;
    }

    /**
     * 设置
     * @param adminId
     */
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取
     * @return adminName
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置
     * @param adminName
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * 获取
     * @return adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * 设置
     * @param adminPassword
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String toString() {
        return "bookAdministrator{adminId = " + adminId + ", adminName = " + adminName + ", adminPassword = " + adminPassword + "}";
    }
}
