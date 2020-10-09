package friday.javaproject;

import java.util.ArrayList;

public class Student {
    ArrayList<Double> grades;

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade(){
        double sum = 0.0;
        for(double num: this.grades){
            sum += num;
        }

        return sum/grades.size();
    }
}