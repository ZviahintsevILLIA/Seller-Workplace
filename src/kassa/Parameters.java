package kassa;

import java.io.File;
import java.util.HashMap;

/* @author ILLIA*/
public class Parameters {
    /**
     * Set your database parameters here
     */
    //Map with all parameters:
    private static HashMap<String,String> parametersMap = new HashMap<>();     
    // Parameters for my local DB:
    /*
    DBPath=jdbc:mysql://localhost:3306/Kassa
    DBLogin=user
    DBPassword=ILLIA
    */  
    static {
        String s = PathFinder.getPath()+"config.txt";
        File file = new File(s);
        if(file.exists()){
            String configFile = FileWorker.read(s);
            String[] rows = configFile.split("\\n");
            for (String row : rows) {
                if(row.contains("=")) {
                    String[]temp = row.split("=");
                    if(temp.length==2){
                        parametersMap.put(temp[0], temp[1]);
                    }
                }
            }
        }
    }    
    
    
    public static String getDBPath(){
        return parametersMap.get("DBPath");
    }
    public static String getDBLogin(){
        return parametersMap.get("DBLogin");
    }
    public static String getDBPassword(){
        return parametersMap.get("DBPassword");
    }
}
