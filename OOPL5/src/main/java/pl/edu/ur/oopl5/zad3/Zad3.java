package pl.edu.ur.oopl5.zad3;


import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        int menu = 0, menuG = 1, n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość elemętów stosu ");
        n = scan.nextInt();
        Stos stos = new Stos(n);
        while(menuG != 0){
            System.out.println("1- Dodanie elementu");
            System.out.println("2- Zrzucenie elementu");
            System.out.println("4- Elementy stosu");
            System.out.println("3- Rozmiar stosu");
            
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    int nowy;
                    System.out.println("Dodanie elementu do stosu:");
                    nowy = scan.nextInt();
                    stos.push(nowy);
                    System.out.println(stos.getWskaznik());
                    break;
                case 2:
                    System.out.println("Zrzucenie elementow ze stosu");
                    stos.pop();
                    break;
                case 3:
                    stos.rozmiarStosu();
                    break;
                case 4:
                    stos.wypiszStos();
                    break;
                default:
                    System.out.println("ERROR!");
                    break;
            }

        }
    }
}