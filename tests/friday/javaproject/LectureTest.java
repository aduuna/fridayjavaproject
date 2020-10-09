package friday.javaproject;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @org.junit.jupiter.api.Test
    void testGetHighestAverageGrade() {
        Lecture science = new Lecture();

        double[] averages = {0,0,0};


        for(int i=0; i<3; i++){
            Student student = new Student();
            ArrayList<Double> grades = new ArrayList<>();
            double sum = 0.0;
            for(int j=0; j<5; j++){
                double grade = Math.random()*100;
                grades.add(grade);

                sum += grade;

            }
            averages[i] = sum/5;
            student.setGrades(grades);
            science.enter(student);
        }
        
        double highestAverage = science.getHighestAverageGrade();

        double actualHighestAverage = Math.max( Math.max(averages[0], averages[1]), averages[2] );

        assertEquals(highestAverage, actualHighestAverage);

    }
}