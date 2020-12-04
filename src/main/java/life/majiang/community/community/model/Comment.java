package life.majiang.community.community.model;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.ID
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.PARENT_ID
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.TYPE
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.COMMENTATOR
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private Long commentator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.CREATETIME
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private Long createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.MODIFYTIME
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private Long modifytime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.LIKE_COUNT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.CONTENT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.COMMENT_COUNT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    private Integer commentCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.ID
     *
     * @return the value of COMMENT.ID
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.ID
     *
     * @param id the value for COMMENT.ID
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.PARENT_ID
     *
     * @return the value of COMMENT.PARENT_ID
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.PARENT_ID
     *
     * @param parentId the value for COMMENT.PARENT_ID
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.TYPE
     *
     * @return the value of COMMENT.TYPE
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.TYPE
     *
     * @param type the value for COMMENT.TYPE
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.COMMENTATOR
     *
     * @return the value of COMMENT.COMMENTATOR
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public Long getCommentator() {
        return commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.COMMENTATOR
     *
     * @param commentator the value for COMMENT.COMMENTATOR
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setCommentator(Long commentator) {
        this.commentator = commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.CREATETIME
     *
     * @return the value of COMMENT.CREATETIME
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public Long getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.CREATETIME
     *
     * @param createtime the value for COMMENT.CREATETIME
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.MODIFYTIME
     *
     * @return the value of COMMENT.MODIFYTIME
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public Long getModifytime() {
        return modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.MODIFYTIME
     *
     * @param modifytime the value for COMMENT.MODIFYTIME
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setModifytime(Long modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.LIKE_COUNT
     *
     * @return the value of COMMENT.LIKE_COUNT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.LIKE_COUNT
     *
     * @param likeCount the value for COMMENT.LIKE_COUNT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.CONTENT
     *
     * @return the value of COMMENT.CONTENT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.CONTENT
     *
     * @param content the value for COMMENT.CONTENT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.COMMENT_COUNT
     *
     * @return the value of COMMENT.COMMENT_COUNT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.COMMENT_COUNT
     *
     * @param commentCount the value for COMMENT.COMMENT_COUNT
     *
     * @mbg.generated Mon Nov 30 18:15:30 CST 2020
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
}