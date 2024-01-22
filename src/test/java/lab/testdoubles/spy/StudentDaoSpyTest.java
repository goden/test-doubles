package src.test.java.lab.testdoubles.spy;

import org.junit.jupiter.api.Test;
import src.main.java.lab.testdoubles.StudentDao;
import src.main.java.lab.testdoubles.StudentService;
import src.main.java.lab.testdoubles.StudentServiceImpl;
import src.main.java.lab.testdoubles.spy.MethodAudit;
import src.main.java.lab.testdoubles.spy.StudentDaoSpy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDaoSpyTest {

    @Test
    public void testGetAuditLogWhenFindStudent() {

        MethodAudit audit = new MethodAudit();
        StudentDao dao =  new StudentDaoSpy(audit);
        StudentService service = new StudentServiceImpl(dao);
        String name = "Jim";

        // when
        service.findStudent(name);

        // then
        assertEquals(1, audit.getInvocationQuantity("findByName"));
        List<Object> params = audit.getInvocation("findByName", 1).getParams();
        assertEquals(name, params.get(0));
    }

}