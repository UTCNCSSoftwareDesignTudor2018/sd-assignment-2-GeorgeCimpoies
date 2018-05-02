package service;

import model.Exam;
import utils.HibernateUtil;

public class ExamService {

    public static void addExam(int examId, int grade) {

        Exam exam = new Exam(examId, grade);
        HibernateUtil.addOrUpdate(exam);
    }

    public static void removeExam(int examId) {

        HibernateUtil.deleteById(Exam.class, examId);
    }

    public static void updateExam(int examId, int grade) {

        Exam exam = (Exam)HibernateUtil.getByField(Exam.class, "examId", String.valueOf(examId));
        exam.setGrade(grade);
        HibernateUtil.addOrUpdate(exam);
    }
}
