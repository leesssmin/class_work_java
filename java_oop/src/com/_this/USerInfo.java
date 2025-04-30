package com._this;

/**
 * this. 문법을 왜 사용하는가
 * this() 문법 왜 사용하는가
 */
public class USerInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAddress;
    private String phoneNumber;

    // 생성자 매개변수 1게 ~ 5개 즉, 생성자 5개 만들어 주세요 (생성자 오버로딩)
    public USerInfo(String userId) {
        this.userId = userId;
    }

    public USerInfo(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public USerInfo(String userId, String userPassword, String userName) {
        this(userId, userPassword);
        this.userName = userName;
    }

    public USerInfo(String userId, String userPassword, String userName, String userAddress) {
        this(userId, userPassword, userName);
        this.userAddress = userAddress;
    }

    public USerInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
        this(userId, userPassword, userName, userAddress);
        this.phoneNumber = phoneNumber;
    }

    // getter 매서드 만들어 주세요
    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // setter 메서드 만들어 주세요
    public void setUserId(String UserId) {
        userId = UserId;
    }

    public void setUserPassword(String UserPassword) {
        userPassword = UserPassword;
    }

    public void setUserName(String UserName) {
        userName = UserName;
    }

    public void setUserAddress(String UserAddress) {
        userPassword = UserAddress;
    }

    public void setPhoneNumber(String PhoneNumber) {
        phoneNumber = PhoneNumber;
    }

    public void showInfo() {
        System.out.println("----------SHOW---------");
        System.out.println("유저 ID: " + userId);
        System.out.println("유저 PASSWORD: " + userPassword);
        System.out.println("유저 NAME: " + userName);
        System.out.println("유저 ADDRESS: " + userAddress);
        System.out.println("PHONE: " + phoneNumber);
    }
}
