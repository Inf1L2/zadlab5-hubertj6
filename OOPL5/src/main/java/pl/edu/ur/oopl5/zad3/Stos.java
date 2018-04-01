package pl.edu.ur.oopl5.zad3;

public class Stos {

    private int ws;
    private int[] tab;

    public Stos(int Rozmiar) {
        tab = new int[Rozmiar];
        ws = 0;
    }

    public int getWskaznik() {
        return ws;
    }

    public void push(int liczba) throws ArrayIndexOutOfBoundsException{
        if (ws < tab.length) {
            tab[ws] = liczba;
            ws++;
        } else throw new ArrayIndexOutOfBoundsException("Koniec miejsca na stosie, czynność niemożliwa");
    }
    public void pop() throws IndexOutOfBoundsException{
        if (ws == 0){
            throw new IndexOutOfBoundsException( "Stos pusty, error");
        }
        int temp = ws - 1;
        for (int i = temp; i> -1; i--){
            System.out.println(tab[temp]);
            temp--;
        }
    }
    public void wypiszStos(){
        for (int i = 0; i<tab.length; i++)
            System.out.println(tab[i]);
    }
    public void rozmiarStosu(){
        System.out.println(ws);
    }
}