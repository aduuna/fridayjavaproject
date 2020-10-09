package friday.javaproject;

public interface HasLevel {

    Level level [] = Level.values();

     public default Level[] getLevel() {
         return level;
     }

    

}
