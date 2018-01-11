package com.helpserver.pojo;

import java.io.Serializable;
import java.util.Date;

public class Feedback implements Serializable {
    /**
     * ������id
     */
    private Integer feedbackid;

    /**
     * �����û�id
     */
    private Integer userid;

    /**
     * ����ʱ��
     */
    private Date feedbacktime;

    /**
     * ������Ϣ
     */
    private String feedbackinfo;

    private static final long serialVersionUID = 1L;

    public Integer getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(Integer feedbackid) {
        this.feedbackid = feedbackid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(Date feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public String getFeedbackinfo() {
        return feedbackinfo;
    }

    public void setFeedbackinfo(String feedbackinfo) {
        this.feedbackinfo = feedbackinfo == null ? null : feedbackinfo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackid=").append(feedbackid);
        sb.append(", userid=").append(userid);
        sb.append(", feedbacktime=").append(feedbacktime);
        sb.append(", feedbackinfo=").append(feedbackinfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}