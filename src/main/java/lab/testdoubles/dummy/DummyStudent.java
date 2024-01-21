package src.main.java.lab.testdoubles.dummy;

import src.main.java.lab.testdoubles.Student;

public class DummyStudent extends Student {
    public DummyStudent() {
        super(null, null);
    }

    @Override
    public String getRollNumber() {
        throw new RuntimeException("Should not be called!");
    }

    @Override
    public String getName() {
        throw new RuntimeException("Should not be called!");
    }
}
