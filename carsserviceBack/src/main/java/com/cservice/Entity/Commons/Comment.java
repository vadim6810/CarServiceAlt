package com.cservice.Entity.Commons;

import java.util.Date;
import java.util.List;


public class Comment {

    private int id;
    private int idClient;
    private int idContractor;
    private String comment;
    private int value;
    private Date dateComment;

    public Comment(int idClient, int idContractor, String comment, int value, Date dateComment) {

        this.idClient = idClient;
        this.idContractor = idContractor;
        this.comment = comment;
        this.value = value;
        this.dateComment = dateComment;
    }

    public boolean addComment(int idClient, int id, String comment){

        return false;
    }

    public Comment getCommentAboutContractor(int idContractor){

        return null;
    }

    public Comment getCommentByClient(int idClient){
        return null;
    }

    public List<Comment> getRecentComments(){

        return null;
    }
}
