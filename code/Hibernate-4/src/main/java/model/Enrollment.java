package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @Column(name = "idenrollments")
    String enrollmentId;

    @Column(name = "students_id")
    int studentId;

    @Column(name = "courses_id")
    int courseId;

    @Column(name = "exams_id")
    int examId;

    public Enrollment(String enrollmentId, int studentId, int courseId, int examId) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.examId = examId;
    }

    public Enrollment() {
        this.enrollmentId = "";
        this.studentId = 0;
        this.courseId = 0;
        this.examId = 0;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }
}
