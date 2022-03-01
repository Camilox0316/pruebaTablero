package pruebaTablero;

public class Main{
    public static void main(String[] args){
        Tablero tableroActu = new Tablero(40);
        tableroActu.crearFichas();
        tableroActu.juego();
    }
}
