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
     * Method returns String with double value in words
     * Method works with cash under 1 billion
     */
    public static String cashInWords (Double cash) {
        String s = "";
        int cashInCents = (BigDecimal.valueOf(cash).movePointRight(2)).intValue();
        int hrivna = cash.intValue();
        int cop = cashInCents%100;
        if (hrivna/1000000>=1) s+=ch999(hrivna / 1000000, "million ");
        if (hrivna%1000000/1000>=1) s+=ch999(hrivna % 1000000 / 1000, "thousand ");
        if (hrivna%1000000%1000>=1) s+=ch999(hrivna % 1000000 % 1000, "");
        if (hrivna>0) s+="hryvnas ";
        if (hrivna>0&&cop>0) s+="and ";
        if (cop>0) s+=ch999(cop, "cop.");

        return s;
    }
    private static String ch999(int a, String b){
        if (a<=0) return "";
        String [] Edin = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ",
                "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
        String [] Des = {"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
        String [] Hundr = {"","one hundred ","two hundred ","three hundred ","four hundred ","five hundred ",
                "six hundred ","seven hundred ","eight hundred ","nine hundred "};
        int hundr = a/100;
        int des = a%100/10;
        int edin = a%100%10;
        return Hundr[hundr] + ((des==1)?Edin[edin+10]:Des[des]) + ((des!=1)?Edin[edin]:Edin[0]) + b;
    }
}
