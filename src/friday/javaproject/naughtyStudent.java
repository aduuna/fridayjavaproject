package friday.javaproject;


public class naughtyStudent extends Student {



    @Override
    public double getAverageGrade() {
        double sum = 0.0;
        //for(double num: this.grades){
        //  sum += num;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return sum / (grades.size() * 1.1);
    }

    private void get() {
    }

    private void grades() {
    }
}