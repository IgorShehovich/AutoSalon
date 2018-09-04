package Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public abstract class Kurs {


    // Map<String,Double>  currentDayKurs=new TreeMap<>();
   private static Map<LocalDate, Map<valuts, Double>> historyDayKursUsd = new TreeMap<>();

    public static void main(String[] args) {
        Kurs.setKurs(valuts.UAH,LocalDate.of(2018,7,6),27.5);
        Kurs.setKurs(valuts.UAH,LocalDate.of(2018,7,7),27.5);
        Kurs.printKursOfDay(LocalDate.of(2018,7,7));
        System.out.println( Kurs.getKurs(LocalDate.of(2018,9,7),valuts.UAH));
    }
    public static void setKurs(valuts qw, LocalDate date, double kurs) {
        historyDayKursUsd.get(date);
        Map<valuts, Double> tempDate = historyDayKursUsd.get(date);
        if (tempDate == null) {
            tempDate = new TreeMap<>();
            historyDayKursUsd.put(date, tempDate);
        }
        tempDate.put(qw, kurs);
    }

    public static double getKurs(LocalDate date, valuts vl) {
        double result = 0;
        Map<valuts, Double> temp = historyDayKursUsd.get(date);
        if (temp == null) {
            System.out.println("kurs is unknow" + date);
            result = 0;
        } else {
            result = temp.get(vl);
        }
        return result;
    }

    public static void printKursOfDay(LocalDate date){
        System.out.println(historyDayKursUsd.get(date));
    }

}

enum valuts {
    USD, EUR, UAH
}




