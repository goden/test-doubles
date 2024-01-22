package src.main.java.lab.testdoubles.spy;

import src.main.java.lab.testdoubles.Student;
import src.main.java.lab.testdoubles.StudentDao;

import java.sql.SQLException;

public class StudentDaoSpy implements StudentDao {

    private MethodAudit audit;
    public StudentDaoSpy(MethodAudit audit) {
        this.audit = audit;
    }

    @Override
    public Student findByName(String name) throws SQLException {
        audit(name);
        return new Student("000", name);
    }

    private void audit(String name) {
        MethodInvocation invocation = new MethodInvocation();
        invocation.addParam(name).setMethod("findByName");
        audit.registerCall(invocation);
    }
}
