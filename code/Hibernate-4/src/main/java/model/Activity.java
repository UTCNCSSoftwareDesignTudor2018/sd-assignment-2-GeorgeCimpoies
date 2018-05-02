package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activities")
public class Activity {

    @Id
    @Column(name = "idactivities")
    int activityId;

    @Column(name = "username")
    String username;

    @Column(name = "date")
    String date;

    @Column(name = "operation")
    String operation;


    public Activity() {

        this.username = "";
        this.activityId = 0;
        this.date = "";
        this.operation = "";

    }

    public Activity(String username, int activityId, String date, String operation) {

        this.username = username;
        this.activityId = activityId;
        this.date = date;
        this.operation = operation;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}
