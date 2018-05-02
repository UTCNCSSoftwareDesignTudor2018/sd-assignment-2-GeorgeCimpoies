package model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import service.StudentService;

@RunWith(MockitoJUnitRunner.class)
public class StudentTest {

    @Mock
    private
    StudentService studentService;

    @Test
    public void  testGetStudentById() {
        Mockito.when(studentService.getStudentById(1)).thenReturn(
                new Student.StudentBuilder("George")
                        .cardNo("123")
                        .personalNumericalCode("321")
                        .address("G. Bacovia")
                        .group("2")
                        .username("gcimpoies")
                        .password( "gcimpoies")
                        .build());

        assert studentService.getStudentById(1).getName().equals("George");
    }
}