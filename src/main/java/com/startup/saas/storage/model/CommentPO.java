package com.startup.saas.storage.model;

import java.util.Date;

public class CommentPO extends CommentPOKey {
    private String commentAuthor;

    private Integer commentParent;

    private String commentStatus;

    private Date createTime;

    private Date updateTime;

    private String commentContent;

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public Integer getCommentParent() {
        return commentParent;
    }

    public void setCommentParent(Integer commentParent) {
        this.commentParent = commentParent;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}