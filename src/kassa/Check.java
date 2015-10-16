package kassa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/* @author ILLIA*/
public final class Check {
    /**
     * Method ReserveCheck creates row in DB table "all_checks" with new number of check,
     * date and time. Probably, date and time will renew after full proceeding 
     * of check. But it will help you later, if smth wrong will be happen, 
     * to know time of issue by founding row in  able "all_checks" with price = 0.
     * 
     * Method receives JLabel and set text in it with CheckNumber.
     */
    public static void ReserveCheck(JLabel label, String user){    
     
        try {
            Connection connection = DriverManager.getConnection(Parameters.getDBPath(), Parameters.getDBLogin(), Parameters.getDBPassword());
            Statement statement = connection.createStatement();
            String getPreviousCheckquery = "SELECT MAX(checknumber) FROM all_checks;";
            ResultSet result = statement.executeQuery(getPreviousCheckquery);
            result.next();
            int newcheck = result.getInt(1)+1;
            label.setText(checkNumber2String(newcheck, 10));
            
            String addCheck = 
"INSERT INTO all_checks VALUES ("+newcheck+",0,'"+GetTime.DateForSQL()+ "','"+GetTime.currentTimeWithSeconds()+ "','"
                    + user
                    + "');";
            statement.executeUpdate(addCheck);
            
            result.close();
            statement.close();
            connection.close();
        }
        catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Error to connect database!");
        }
    }   
    /**
         * Method doCheck gets all check product information from JTable table and 
         * decreases totals in "all_checks" table.
         * Method adds final information to reserved check: check total price,
         * date and time.
         * Method returns String with head and main body of check without cash,
         * differense and other more lower info.
         */
    public static String doCheck (JTable table, String CheckNumber, String TOTAL){
        
        HashMap<Integer,Integer> CodeQuan = new HashMap<>();//Values to decrease rest on store
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        StringBuilder checkBody = new StringBuilder("<html><font face=\"Courier New\">");
        checkBody.append("<b>"+spacesOutside("ILLIA ZVIAHINTSEV")+ "<br>"+spacesOutside("buster28@ya.ru")+ "<br>"+spacesOutside("SHOP \"HOME\"")+ "<br></b>");
        for (int i = 0; i < model.getRowCount();i++){
            int barcode = (int) model.getValueAt(i, 0);
            int quntity = (int) model.getValueAt(i, 3);
            CodeQuan.put(barcode, quntity);
            String price = (String)model.getValueAt(i, 2);
            String Product = model.getValueAt(i, 1).toString();
            String totalPrice = (String) model.getValueAt(i, 4);
            String str1 = (quntity+".X")+spacesBetween(quntity+".X", price+"  ", ".")+price+"&nbsp;&nbsp;";
            String str2 = Product+spacesBetween(Product, totalPrice+" A", ".")+totalPrice+" A";
            checkBody.append(str1).append("<br>").append(str2).append("<br>");
            }
        checkBody.append(spacesBetween("", "","-")).append("<br>");
    
        
        String querySetTotal="UPDATE all_checks SET check_price = "+TOTAL+" WHERE checknumber = "+CheckNumber+";";
        String querySetDate="UPDATE all_checks SET date_ = '"+GetTime.DateForSQL()+"' WHERE checknumber = "+CheckNumber+";";
        String querySetTime="UPDATE all_checks SET time_ = '"+GetTime.currentTimeWithSeconds()+"' WHERE checknumber = "+CheckNumber+";";
            
    
        try {
            Connection connection = DriverManager.getConnection(Parameters.getDBPath(), Parameters.getDBLogin(), Parameters.getDBPassword());
            Statement statement = connection.createStatement();
            statement.executeUpdate(querySetTotal);
            statement.executeUpdate(querySetDate);
            statement.executeUpdate(querySetTime);
            
            for (HashMap.Entry entry: CodeQuan.entrySet()) {
                String query = "UPDATE Products SET total = total-"+entry.getValue()+
                        " WHERE barcode = "+entry.getKey()+";"; 
                statement.executeUpdate(query);
            }
            
            statement.close();
            connection.close();
        }
        catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Error to connect database!");
        }
 
    return checkBody.toString();
    }
    /**
         * Method spacesBetween returns string s with so many symbols to create 
         * string a+s+b length = 40.
         */
    public static String spacesBetween(String a, String b, String symbol){
        
        int abLength = a.length()+b.length();
        String spaces = "";
        for (int i = 0; i < 40-abLength; i++) {
            spaces+=symbol;            
        }
        return spaces;
    }
    /**
         * Method checkNumber2String return string with so many zeros, that returning string length 
         * will be equals numberOfZeros value.
         */
    private static String checkNumber2String(int checkNumber, int numberOfZeros){
        
        String a = "";
        int CNLength = (""+checkNumber).length();
        //if (CNLength>numberOfZeros) return;
        for (int i = 0; i < numberOfZeros-CNLength; i++) {
            a+="0";
        }
        return a+checkNumber;
    }
     /**
         * Method spacesOutside returns string with spaces before and after word, length of 
         * new string equls 40.
         */
    public static String spacesOutside(String word) {
       
        int a = 40-word.length();
        String sp = "&nbsp;";
        String spaces="";
        for (int i = 0; i < a/2; i++) {
            spaces+=sp;
        }
        return spaces+word+spaces;
    }
}
