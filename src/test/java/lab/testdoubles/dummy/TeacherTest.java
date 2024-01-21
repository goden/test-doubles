package src.test.java.lab.testdoubles.dummy;

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

    /**
     * 因為Mark類別建構子需要傳入Student類別的物件參考，但實際上在Teacher並未使用到DummyStudent物件。
     * 所以DummyStudent物件僅作為傳入物件參考不做其它使用。
     */
    @Test
    public void testReturnVeryGoodWhenMarkAbove75() {

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

    /**
     * DummyStudent物件即被NULL取代，也不會影響原有測試結果
     */
    @Test
    public void testReturnVeryGoodByNullWhenMarkAbove75() {

        Mark english = new Mark(null, "English", new BigDecimal("81.00"));
        Mark math = new Mark(null, "Math", new BigDecimal("97.00"));
        Mark history = new Mark(null, "History", new BigDecimal("79.00"));

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