package friday.javaproject;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    private HashSet<Student> students = new HashSet<>();

    @org.junit.jupiter.api.Test
    void getHighestAverageGrade() {

    }

    @Test
    void testEnter() {

        Lecture math = new Lecture();
        Student mike = new Student();

        boolean isAccepted = math.enter(mike);

        assertTrue(isAccepted);

        // when adding student twice.

        boolean isAccepted2 = math.enter(mike);

        assertFalse(isAccepted2);
    }
}