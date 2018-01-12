package com.helpserver.pojo;

import java.io.Serializable;

public class IdentityWithBLOBs extends Identity implements Serializable {
    /**
     * 身份证正面
     */
    private String frontphoto;

    /**
     * 身份证反面
     */
    private String backphoto;

    private static final long serialVersionUID = 1L;

    public String getFrontphoto() {
        return frontphoto;
    }

    public void setFrontphoto(String frontphoto) {
        this.frontphoto = frontphoto == null ? null : frontphoto.trim();
    }

    public String getBackphoto() {
        return backphoto;
    }

    public void setBackphoto(String backphoto) {
        this.backphoto = backphoto == null ? null : backphoto.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", frontphoto=").append(frontphoto);
        sb.append(", backphoto=").append(backphoto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}