package com.helpserver.pojo;

import java.io.Serializable;

public class UserWithBLOBs extends User implements Serializable {
    /**
     * ¼ò½é
     */
    private String userinfo;

    /**
     * Í·Ïñ
     */
    private String headicon;

    private static final long serialVersionUID = 1L;

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo == null ? null : userinfo.trim();
    }

    public String getHeadicon() {
        return headicon;
    }

    public void setHeadicon(String headicon) {
        this.headicon = headicon == null ? null : headicon.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userinfo=").append(userinfo);
        sb.append(", headicon=").append(headicon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}