package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @Column(name = "idcourse")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "teachers_id")
    private int teacherId;

    public Course(int courseId, String name, int teacherId) {
        this.id = courseId;
        this.name = name;
        this.teacherId = teacherId;
    }

    public Course(){
        this.id = 0;
        this.name = "";
        this.teacherId = 0;
    }

    public int getCourseId() {
        return id;
    }

    public void setCourseId(int courseId) {
        this.id = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
