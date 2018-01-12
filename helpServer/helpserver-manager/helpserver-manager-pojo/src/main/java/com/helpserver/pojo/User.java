package com.helpserver.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * id���Զ�����
     */
    private Integer userid;

    /**
     * �ֻ�����¼�˺ţ�
     */
    private String phone;

    /**
     * ����
     */
    private String password;

    /**
     * ����
     */
    private String name;

    /**
     * �ǳ�
     */
    private String nickname;

    /**
     * ��ϵ��ַ
     */
    private String address;

    /**
     * ����
     */
    private Integer age;

    /**
     * �Ա�0Ů��1�У�
     */
    private Integer sex;

    /**
     * ע��ʱ��
     */
    private Date registertime;

    /**
     * ֧���˺�
     */
    private String payaccount;

    /**
     * Ȩ�ޣ�0��ͨ�û���1�ɽӵ��û���2�������û���
     */
    private Integer permission;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getPayaccount() {
        return payaccount;
    }

    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount == null ? null : payaccount.trim();
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", nickname=").append(nickname);
        sb.append(", address=").append(address);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", registertime=").append(registertime);
        sb.append(", payaccount=").append(payaccount);
        sb.append(", permission=").append(permission);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}