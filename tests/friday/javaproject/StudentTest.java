package friday.javaproject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testGetAverageGrade() {
        Student testStudent = new Student();
        ArrayList<Double> grades = new ArrayList<>();
        boolean added = grades.add(65.6);
        boolean added1 = grades.add(86.5);
        boolean added2 = grades.add(92.0);

        testStudent.setGrades(grades);

        assertEquals(testStudent.getAverageGrade(), (65.6+86.5+92)/3);
    }
}