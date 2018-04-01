package pl.edu.ur.oopl5.zad5;

import java.util.Scanner;

public class Firma {

    public static void main(String[] args) {
        int menu, menuG = 1, in = 0;
        Scanner scan = new Scanner(System.in);
        Pracownik[] firma = new Pracownik[10];
        for (int i = 0; i < firma.length; i++) {
            firma[i] = new Pracownik("", "", 0, "");
        }
        while (menuG != 0) {
            System.out.println("1. Dodanie pracownika");
            System.out.println("2. Lista pracownikow");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    firma[in].wprDane();
                    in++;
                    break;
                case 2:
                    for (int i = 0; i < firma.length; i++) {
                        firma[i].wysDane();
                    }
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            System.out.println("1 - kontynuuj, 0 - przerwij");
            menuG = scan.nextInt();
        }
    }
}