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
     * �ظ�ʱ��
     */
    private Date replytime;

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

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
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
        sb.append(", replytime=").append(replytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}