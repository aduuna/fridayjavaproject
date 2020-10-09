package friday.javaproject;

import java.util.ArrayList;

public class Lecture {

    private ArrayList<Student> students;

    public void enter(Student student) {

    }
 

    public double getHighestAverageGrade(){

        double highest = 0.0;
        for(Student student: this.students){
            double averageGrade = student.getAverageGrade();

            highest = averageGrade > highest ? averageGrade : highest;

        }

        return highest;
    }


}
