package edu.poly.model;

public class BlogDTO {
    private Integer postID;
    private String postTitle;
    private String postImage;
    private String postContent;
    private Integer postView;
    private String pcName;
    private Integer pcID;
    private String date;

    public BlogDTO(Integer postID, String postTitle, String postImage, String postContent, Integer postView, String pcName, Integer pcID, String date) {
        this.postID = postID;
        this.postTitle = postTitle;
        this.postImage = postImage;
        this.postContent = postContent;
        this.postView = postView;
        this.pcName = pcName;
        this.pcID = pcID;
        this.date = date;
    }

    public BlogDTO() {

    }

    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Integer getPostView() {
        return postView;
    }

    public void setPostView(Integer postView) {
        this.postView = postView;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public Integer getPcID() {
        return pcID;
    }

    public void setPcID(Integer pcID) {
        this.pcID = pcID;
    }

    public String getDate(){ return date; }

    public void setDate(){ this.date = date; }
}
