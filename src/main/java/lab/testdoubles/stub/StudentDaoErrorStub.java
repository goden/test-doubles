package src.main.java.lab.testdoubles.stub;

import src.main.java.lab.testdoubles.Student;
import src.main.java.lab.testdoubles.StudentDao;

import java.sql.SQLException;

public class StudentDaoErrorStub implements StudentDao {
    @Override
    public Student findByName(String name) throws SQLException {
        throw new SQLException("DB connection timeout.");
    }
}
