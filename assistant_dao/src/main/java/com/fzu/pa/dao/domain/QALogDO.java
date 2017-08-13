package com.fzu.pa.dao.domain;

public class QALogDO {
    /**
     * 问题id
     */
    private Long id;

    /**
     * 问题
     */
    private String question;

    /**
     * 答案类型：1 内部知识 2 百度搜索
     */
    private Integer answerType;

    /**
     * 搜索到的知识id集合
     */
    private String knowledgeIds;

    /**
     * 答案，具体文案
     */
    private String answerText;

    /**
     * @return 问题id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id 
	 *            问题id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return 问题
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question 
	 *            问题
     */
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    /**
     * @return 答案类型：1 内部知识 2 百度搜索
     */
    public Integer getAnswerType() {
        return answerType;
    }

    /**
     * @param answerType 
	 *            答案类型：1 内部知识 2 百度搜索
     */
    public void setAnswerType(Integer answerType) {
        this.answerType = answerType;
    }

    /**
     * @return 搜索到的知识id集合
     */
    public String getKnowledgeIds() {
        return knowledgeIds;
    }

    /**
     * @param knowledgeIds 
	 *            搜索到的知识id集合
     */
    public void setKnowledgeIds(String knowledgeIds) {
        this.knowledgeIds = knowledgeIds == null ? null : knowledgeIds.trim();
    }

    /**
     * @return 答案，具体文案
     */
    public String getAnswerText() {
        return answerText;
    }

    /**
     * @param answerText 
	 *            答案，具体文案
     */
    public void setAnswerText(String answerText) {
        this.answerText = answerText == null ? null : answerText.trim();
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
        QALogDO other = (QALogDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
            && (this.getAnswerType() == null ? other.getAnswerType() == null : this.getAnswerType().equals(other.getAnswerType()))
            && (this.getKnowledgeIds() == null ? other.getKnowledgeIds() == null : this.getKnowledgeIds().equals(other.getKnowledgeIds()))
            && (this.getAnswerText() == null ? other.getAnswerText() == null : this.getAnswerText().equals(other.getAnswerText()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getAnswerType() == null) ? 0 : getAnswerType().hashCode());
        result = prime * result + ((getKnowledgeIds() == null) ? 0 : getKnowledgeIds().hashCode());
        result = prime * result + ((getAnswerText() == null) ? 0 : getAnswerText().hashCode());
        return result;
    }
}