package src.test.java.lab.testdoubles.mock;

import org.junit.jupiter.api.Test;
import src.main.java.lab.testdoubles.Student;
import src.main.java.lab.testdoubles.StudentService;
import src.main.java.lab.testdoubles.StudentServiceImpl;
import src.main.java.lab.testdoubles.mock.StudentDaoMock;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDaoMockTest {

    @Test
    public void GetAuditLogWhenFindStudent() {

        StudentDaoMock mockDao = new StudentDaoMock();
        StudentService service = new StudentServiceImpl(mockDao);
        String name = "Jim";

        // when
        service.findStudent(name);

        // then
        mockDao.expect(new Student("000", name));
        mockDao.verifyEquals();

    }
}