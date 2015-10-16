package kassa;

/* @author ILLIA*/
public class PathFinder {
        /**
         * Method getPath() returns path to directory with Kassa.jar
         * If program runs from NetBeans IDE, returns "D:/"
         */
        
    public static String getPath(){
        String s = PathFinder.class.getResource("PathFinder.class").getPath();
        s = s.replaceAll("Kassa.jar!/kassa/PathFinder.class", "").replaceAll("file:/", "");
        if(s.contains("PathFinder.class")) {return "/d:/";}
        return s;
    }
}
