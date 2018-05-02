package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @Column(name = "idteacher")
    int teacherId;

    @Column(name = "name")
    String name;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    public Teacher(String name, String username, String password) {
        this.teacherId = UUID.randomUUID().hashCode();;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Teacher() {
        this.teacherId = UUID.randomUUID().hashCode();;
        this.name = "";
        this.username = "";
        this.password = "";
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
