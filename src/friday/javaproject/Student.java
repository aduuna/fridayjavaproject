package friday.javaproject;

import java.util.ArrayList;

public class Student implements Nameable, HasLevel {
    private ArrayList<Double> grades;
    public Level level;

    public Student(Level level) {
        this.level = level;
    }

    public Student(){

    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0.0;
        for (double num : this.grades) {
            sum += num;
        }

        return sum / grades.size();
    }

    public String getName() {
        return "";
    }
}
