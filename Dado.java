package pruebaTablero;

public class Dado {
    public int caras = 0;

    public Dado(int numCaras){
        caras = numCaras;
    }
    public double lanzar(){
        return Math.random()*caras+1;
    }
}
