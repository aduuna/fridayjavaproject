package friday.javaproject;

import java.util.ArrayList;

public class Register {

    private Namable[] studentList;

    public Register(Namable[] namables) {
        this.studentList = namables;
    }

    String[] getRegister(){
        ArrayList<String> namesOfStudents = new ArrayList<>();
        for (Namable student : this.studentList){
            namesOfStudents.add(student.getName());
        }
        return (String[]) namesOfStudents.toArray();
    }

    String[] getRegisterByLevel(Level level){
        return new String[]{""};
    }
}
