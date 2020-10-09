package friday.javaproject;

import java.util.ArrayList;

public class Register {

    private Nameable[] studentList;

    public Register(Nameable[] nameables) {
        this.studentList = nameables;
    }

    String[] getRegister(){
        ArrayList<String> namesOfStudents = new ArrayList<>();
        for (Nameable student : this.studentList){
            namesOfStudents.add(student.getName());
        }
        return (String[]) namesOfStudents.toArray();
    }

    String[] getRegisterByLevel(Level level){
        return new String[]{""};
    }
}
