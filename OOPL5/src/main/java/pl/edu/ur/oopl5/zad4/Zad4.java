package pl.edu.ur.oopl5.zad4;
import java.util.*;

public class Zad4 {
    public static void main(String[] args) {
        Data data1 = new Data();
       System.out.append("ustawianie daty");
        data1.ustawDate();
        System.out.append("data 7 dni do przodu");
        data1.dataPrzod();
        System.out.append("data 7 dni do tyłu");
        data1.dataTyl();


    }
}