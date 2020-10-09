package friday.javaproject;

public class Register {

    private Namable[] studentList;

    public Register(Namable[] namables) {
        this.studentList = namables;
    }

    String[] getRegister(){
        return new String[]{""};
    }

    String[] getRegisterByLevel(Level level){
        return new String[]{""};
    }
}
