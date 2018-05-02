package service;

import model.Teacher;
import repository.TeacherRepository;
import utils.HibernateUtil;

public class TeacherService {

    public static void addTeacher(String name, String username, String password) {

        Teacher teacher = new Teacher(name, username, password);
        HibernateUtil.addOrUpdate(teacher);
    }

    public static void removeTeacher(int teacherId) {

        HibernateUtil.deleteById(Teacher.class, teacherId);
    }

    public static void updateTeacher(String name, String username, String password) {

        Teacher teacher = (Teacher)HibernateUtil.getByField(Teacher.class, "name", name);
        teacher.setName(name);
        teacher.setUsername(username);
        teacher.setPassword(password);
        HibernateUtil.addOrUpdate(teacher);
    }
}
