package repository;

import model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class StudentRepository {
    
    public static Student readStudentFromUsername(String username) {

        Student student = new Student.StudentBuilder("")
                .build();

        try {
            java.sql.Connection con = ConnectionRepository.getConnection();
            PreparedStatement posted = con.prepareStatement("SELECT `name`,card_nr,personal_numerical_code,address,`group`,username,password from students where username=?");
            posted.setString(1, username);

            ResultSet m = posted.executeQuery();

            getStudentObject(username, student, m);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Read Complete");
        }
        return student;
    }

    private static void getStudentObject(String username, Student student, ResultSet m) throws SQLException {
        while (m.next()) {

            student.setName(m.getString(1));
            student.setCardNo(m.getString(2));
            student.setPersonalNumericalCode(m.getString(3));
            student.setAddress(m.getString(4));
            student.setGroup(m.getString(5));
            student.setUsername(m.getString(6));
            student.setPassword(m.getString(7));
            student.setPersonalNumericalCode(username);
        }
    }
}

