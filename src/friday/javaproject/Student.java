package friday.javaproject;

import java.util.ArrayList;
import java.util.List;

public class Student {
    ArrayList<Double> grades;

    public ArrayList<Double> getGrades(List<Double> grade) {
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

    public void setGrades(List<Double> grade) {
    }
}