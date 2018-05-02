package service;

import model.Student;
import utils.HibernateUtil;

import java.util.List;

public class StudentService {

    public void addStudent(String name, String cardNo, String personalNumericalCode, String address, String group, String username, String password) {

        Student student = new Student.StudentBuilder(name)
                .cardNo(cardNo)
                .personalNumericalCode(personalNumericalCode)
                .address(address)
                .group(group)
                .username(username)
                .password(password)
                .build();
        HibernateUtil.addOrUpdate(student);
    }

    public void removeStudent(Student student) {

        HibernateUtil.deleteByObject(student);
    }

    public void removeStudentByPNC(String pnc) {

        List<Student> toDeleteList = (List<Student>) HibernateUtil.getByField(Student.class, "personalNumericalCode", pnc);
        if(toDeleteList != null){
            for(Student student : toDeleteList){
                HibernateUtil.deleteByObject(student);
            }
        } else {
            System.out.println("There's no student with the PNC: " + pnc);
        }
    }

    public void updateStudent(int id, String name, String cardNo, String personalNumericalCode, String address, String group, String username, String password) {

        Student student = getStudentById(id);
        student.setName(name);
        student.setCardNo(cardNo);
        student.setPersonalNumericalCode(personalNumericalCode);
        student.setAddress(address);
        student.setGroup(group);
        student.setUsername(username);
        student.setPassword(password);
        HibernateUtil.addOrUpdate(student);
    }

    public Student getStudentById(int id){
        return (Student)HibernateUtil.getById(Student.class, id);
    }
}
