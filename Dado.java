package pruebaTablero;

public class Dado {
    public int caras = 0;

    public Dado(int numCaras){
        caras = numCaras;
    }
    public int lanzar(){
        return (int) Math.random()*caras+1;
    }
}
