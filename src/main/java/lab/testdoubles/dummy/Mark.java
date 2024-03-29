package src.main.java.lab.testdoubles.dummy;

import src.main.java.lab.testdoubles.Student;

import java.math.BigDecimal;

public class Mark {
    private final Student student;
    private final String subjectId;
    private final BigDecimal mark;

    public Mark(Student student, String subjectId, BigDecimal mark) {
        this.student = student;
        this.subjectId = subjectId;
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public BigDecimal getMark() {
        return mark;
    }
}
