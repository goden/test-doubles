package src.test.lab.testdoubles.dummy;

import org.junit.jupiter.api.Test;
import src.main.java.lab.testdoubles.dummy.DummyStudent;
import src.main.java.lab.testdoubles.dummy.Grades;
import src.main.java.lab.testdoubles.dummy.Mark;
import src.main.java.lab.testdoubles.dummy.Teacher;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    public void testReturnGeWhenMarkAbove75() {

        DummyStudent dummy = new DummyStudent();
        Mark english = new Mark(dummy, "English", new BigDecimal("81.00"));
        Mark math = new Mark(dummy, "Math", new BigDecimal("97.00"));
        Mark history = new Mark(dummy, "History", new BigDecimal("79.00"));

        List<Mark> marks = new ArrayList<>();
        marks.add(english);
        marks.add(math);
        marks.add(history);

        // when
        Grades grade = new Teacher().generateGrade(marks);

        // then
        assertEquals(Grades.VeryGood, grade);


    }

}