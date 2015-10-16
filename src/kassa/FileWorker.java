package kassa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/* @author ILLIA*/
public class FileWorker {
   /**
     * Method write write text to fileName.
     * If file doesnt exist, will creaye it/
     */
    public static void write(String fileName, String text) {       
    File file = new File(fileName);
    try {
        if(!file.exists()){file.createNewFile();}
 
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        try {
            out.print(text);
        } finally {
            out.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
}
         /**
         * Method read trying to read and return String with whole text from fileName.
         * If fileName doesnt exist return empty String "".
         */
    public static String read(String fileName) {
    StringBuilder sb = new StringBuilder(""); 
    if (exists(fileName)){
    File file = new File(fileName);
    try {
        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
        try {
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } finally {
            in.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
    }
    return sb.toString();
}
    /**
     * Method exists checks if file exists on hard-drive
     */
    private static boolean exists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }
    /**
     * Method appends text in existing file.
     * If file doesnt exist, will create new one.
     */
    public static void addText(String nameFile, String addText) {
        StringBuilder sb = new StringBuilder();
        String oldFile = read(nameFile);
        sb.append(oldFile);
        sb.append(addText);
        write(nameFile, sb.toString());
}

}
