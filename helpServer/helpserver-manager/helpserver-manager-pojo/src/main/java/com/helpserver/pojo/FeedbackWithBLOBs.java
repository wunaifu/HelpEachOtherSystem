package com.helpserver.pojo;

import java.io.Serializable;

public class FeedbackWithBLOBs extends Feedback implements Serializable {
    /**
     * 反馈信息
     */
    private String feedbackinfo;

    /**
     * 管理员回复
     */
    private String reply;

    private static final long serialVersionUID = 1L;

    public String getFeedbackinfo() {
        return feedbackinfo;
    }

    public void setFeedbackinfo(String feedbackinfo) {
        this.feedbackinfo = feedbackinfo == null ? null : feedbackinfo.trim();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackinfo=").append(feedbackinfo);
        sb.append(", reply=").append(reply);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}