package service;

import model.Enrollment;
import utils.HibernateUtil;

public class EnrollmentService {

    public static void addEnrollment(String enrollmentId, int studentId, int courseId, int examId) {

        Enrollment enrollment = new Enrollment(enrollmentId, studentId, courseId, examId);
        HibernateUtil.addOrUpdate(enrollment);
    }

    public static void removeEnrollment(int enrollmentId) {

        HibernateUtil.deleteById(Enrollment.class, enrollmentId);
    }

    public static void updateEnrollment(String enrollmentId, int studentId, int courseId, int examId) {

        Enrollment enrollment= (Enrollment)HibernateUtil.getByField(Enrollment.class, "enrollmentId", enrollmentId);
        enrollment.setStudentId(studentId);
        enrollment.setCourseId(courseId);
        enrollment.setExamId(examId);
        HibernateUtil.addOrUpdate(enrollment);
    }
}
