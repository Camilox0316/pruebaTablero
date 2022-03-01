package pruebaTablero;
public class Ficha {
    public String color;
    public int posicion = 0;   
    public Dado dadoActu = new Dado(6);
    public Ficha(String pcolor){
        color = pcolor;
    }
    public void avanzar(){
        double pasos = dadoActu.lanzar();
        posicion += pasos;
        System.out.println("Es el turno de la ficha: " + color + "\n");
        System.out.println("¡La ficha: " + color + " avanza " + (int)pasos + " casillas!\n");
        if (posicion >= 40)
            posicion = 40;
        System.out.println("La casilla actual de la ficha es: " + posicion + "\n");
    }
}
