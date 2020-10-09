package friday.javaproject;

public interface HasLevel {

    Level level = null;

     public default Level getLevel() {
         return level;
     }



}
