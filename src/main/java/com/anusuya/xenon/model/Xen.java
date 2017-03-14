package com.anusuya.xenon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by anusu on 3/12/2017.
 */

@Entity
public class Xen {
    @Id
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

//    @Column
//    private Date timestamp;

    @Column
    private Boolean isTask;

    @Column
    private Boolean isCompleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//
//    public Date getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Date timestamp) {
//        this.timestamp = timestamp;
//    }

    public Boolean getTask() {
        return isTask;
    }

    public void setTask(Boolean task) {
        isTask = task;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
