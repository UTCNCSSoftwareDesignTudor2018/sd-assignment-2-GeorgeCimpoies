package repository;

import model.Teacher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TeacherRepository {

    public static Teacher readTeacherFromUsername(String username) {

        Teacher teacher = new Teacher();

        try {
            java.sql.Connection con = ConnectionRepository.getConnection();
            PreparedStatement posted = con.prepareStatement("select `name`,username,password from teachers where username=?");
            posted.setString(1, username);

            ResultSet m = posted.executeQuery();

            while (m.next()) {

                teacher.setName(m.getString(1));
                teacher.setUsername(m.getString(2));
                teacher.setPassword(m.getString(3));
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Read Complete");
        }
        return teacher;
    }
}
