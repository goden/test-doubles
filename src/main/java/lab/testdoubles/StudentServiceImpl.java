package src.main.java.lab.testdoubles;

import java.sql.SQLException;

public class StudentServiceImpl implements StudentService{

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao dao) {
        this.studentDao = dao;
    }

    @Override
    public FindStudentResponse findStudent(String name) {

        FindStudentResponse response = null;

        try {
            Student student = studentDao.findByName(name);
            response = new FindStudentResponse(null, student);
        } catch (SQLException e) {
            response = new FindStudentResponse(e.getMessage(), null);
        }

        return response;
    }
}
