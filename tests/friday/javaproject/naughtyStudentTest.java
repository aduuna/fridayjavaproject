package friday.javaproject;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class naughtyStudentTest {
    @Test
    void testGetAverageGrade() {
        Student testStudent = new Student();
        List<Double> grade = new ArrayList<>();
        boolean added = grade.add(66.0);
        boolean added1 = grade.add(88.0);
        boolean added2 = grade.add(99.0);
        testStudent.setGrades((ArrayList<Double>) grade);


        assertEquals(testStudent.getAverageGrade(), ((66.0+88.0+99.0)/100) * 10);
    }
}