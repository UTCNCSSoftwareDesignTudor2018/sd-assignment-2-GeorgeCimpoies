package service;

import model.Course;
import utils.HibernateUtil;

public class CourseService {

    public static void addCourse(String name, int courseId, int teacherId) {

        Course course = new Course(courseId, name, teacherId);
        HibernateUtil.addOrUpdate(course);
    }

    public static void removeCourse(int courseId) {

        HibernateUtil.deleteById(Course.class, courseId);
    }

    public static void updateCourse(String name, int courseId, int teacherId) {

        Course course = (Course)HibernateUtil.getByField(Course.class, "courseId", String.valueOf(courseId));
        course.setTeacherId(teacherId);
        course.setName(name);
        HibernateUtil.addOrUpdate(course);
    }

}
