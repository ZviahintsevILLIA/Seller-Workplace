package kassa;

import java.math.BigDecimal;

/* @author ILLIA*/
/**
 * Class MyMth provides simple and correct work with double items.
 */
public final class MyMath {
    static double sum (double a, double b) {
        return (BigDecimal.valueOf(a).add(BigDecimal.valueOf(b))).doubleValue();
    }
    static double minus (double a, double b) {
        return (BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b))).doubleValue();
    }
    static double multiply (double a, double b) {
        return (BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b))).doubleValue();
    }
    static double division (double a, double b) {
        return (BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b))).doubleValue();
    }
    static double remainder (double a, double b) {
        return (BigDecimal.valueOf(a).remainder(BigDecimal.valueOf(b))).doubleValue();
    }
    /**
     * Method double2String returns String value of incoming double item in 
     * money format by adding, if it needs, a zero in the end:
     * 0.1 -> 0.10
     */
    static String double2String (Double a){
        String s = ""+a;
        String[] arr = s.split("\\.");
        if (arr[1].length()==1) s+="0";
        return s;
    }
    /**
     * Meyhod returns if Pressed key is number
     */
    static boolean isNumber(java.awt.event.KeyEvent evt){
        int e = evt.getKeyCode();
        
        return (e==46)||(e==44)||((e>=48)&&(e<=57))||((e>=96)&&(e<=105));
    }
}
