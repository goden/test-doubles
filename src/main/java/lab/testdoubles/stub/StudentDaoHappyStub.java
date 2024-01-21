package src.main.java.lab.testdoubles.stub;

import src.main.java.lab.testdoubles.Student;
import src.main.java.lab.testdoubles.StudentDao;

import java.sql.SQLException;

public class StudentDaoHappyStub implements StudentDao {
    @Override
    public Student findByName(String name) throws SQLException {
        return new Student("000", name);
    }
}
