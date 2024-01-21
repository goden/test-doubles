package src.test.java.lab.testdoubles;

import org.junit.jupiter.api.Test;
import src.main.java.lab.testdoubles.FindStudentResponse;
import src.main.java.lab.testdoubles.StudentDao;
import src.main.java.lab.testdoubles.StudentService;
import src.main.java.lab.testdoubles.StudentServiceImpl;
import src.main.java.lab.testdoubles.stub.StudentDaoErrorStub;
import src.main.java.lab.testdoubles.stub.StudentDaoHappyStub;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    public void testGetErrorWhenFindStudent() {
        StudentDao dao = new StudentDaoErrorStub();
        StudentService service = new StudentServiceImpl(dao);
        String name = "Jim";
        FindStudentResponse response = service.findStudent(name);
        assertFalse(response.isSuccess());
    }

    @Test
    public void testGetStudentWhenFindStudent() {
        StudentDao dao = new StudentDaoHappyStub();
        StudentService service = new StudentServiceImpl(dao);
        String name = "Jim";
        FindStudentResponse response = service.findStudent(name);
        assertTrue(response.isSuccess());
        assertEquals(name, response.getStudent().getName());
    }

}