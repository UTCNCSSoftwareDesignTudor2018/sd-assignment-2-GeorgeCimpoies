package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "idstudent")
    int studentId;

    @Column(name = "student_name")
    String name;

    @Column(name = "card_nr")
    String cardNo;

    @Column(name = "personal_numerical_code")
    String personalNumericalCode;

    @Column(name = "address")
    String address;

    @Column(name = "student_group")
    String group;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    private Student() {
        this.studentId = UUID.randomUUID().hashCode();
        this.name = "";
        this.cardNo = "";
        this.personalNumericalCode = "";
        this.address = "";
        this.group = "";
        this.username = "";
        this.password = "";
    }

    private Student(StudentBuilder builder) {
        this.studentId = UUID.randomUUID().hashCode();
        this.name = builder.name;
        this.cardNo = builder.cardNo;
        this.personalNumericalCode = builder.personalNumericalCode;
        this.address = builder.address;
        this.group = builder.group;
        this.username = builder.username;
        this.password = builder.password;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPersonalNumericalCode() {
        return personalNumericalCode;
    }

    public void setPersonalNumericalCode(String personalNumericalCode) {
        this.personalNumericalCode = personalNumericalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    public static class StudentBuilder{

        int studentId;
        String name;
        String cardNo;
        String personalNumericalCode;
        String address;
        String group;
        String username;
        String password;

        public StudentBuilder(String studentName){
            this.name = studentName;
        }

        public StudentBuilder studentId(int studentId) {
            this.studentId = studentId;
            return this;
        }

        public StudentBuilder cardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }

        public StudentBuilder personalNumericalCode(String personalNumericalCode) {
            this.personalNumericalCode = personalNumericalCode;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder group(String group) {
            this.group = group;
            return this;
        }

        public StudentBuilder username(String username) {
            this.username = username;
            return this;
        }

        public StudentBuilder password(String password) {
            this.password = password;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
