package friday.javaproject;

import java.util.HashSet;

public class Lecture {

    private HashSet <Student> students = new HashSet<>();

    public boolean enter(Student student) {

        return this.students.add(student);
    }
 

    public double getHighestAverageGrade(){
        double highest = 0.0;
        for(Student student: this.students){
            double averageGrade = student.getAverageGrade();

            highest = Math.max(averageGrade, highest);

        }

        return highest;
    }


}
