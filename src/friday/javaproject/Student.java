package friday.javaproject;

import java.util.ArrayList;
import java.util.List;

public class Student implements HasLevel, Namable {
    ArrayList<Double> grades;
    private Level level;

    public Student(Level level) {
        this.level = level;
    }

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

}