package com.fzu.pa.dao.domain;

import java.util.Date;

public class KnowledgeDO {
    /**
     * 知识id
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModify;

    /**
     * 主题
     */
    private String title;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 公开等级：1 私有；2 公开；3 部分公开
     */
    private Integer openLevel;

    /**
     * 内容
     */
    private String content;

    /**
     * @return 知识id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id 
	 *            知识id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate 
	 *            创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return 最后修改时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * @param gmtModify 
	 *            最后修改时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * @return 主题
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title 
	 *            主题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId 
	 *            用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return 公开等级：1 私有；2 公开；3 部分公开
     */
    public Integer getOpenLevel() {
        return openLevel;
    }

    /**
     * @param openLevel 
	 *            公开等级：1 私有；2 公开；3 部分公开
     */
    public void setOpenLevel(Integer openLevel) {
        this.openLevel = openLevel;
    }

    /**
     * @return 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content 
	 *            内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        KnowledgeDO other = (KnowledgeDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOpenLevel() == null ? other.getOpenLevel() == null : this.getOpenLevel().equals(other.getOpenLevel()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOpenLevel() == null) ? 0 : getOpenLevel().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}