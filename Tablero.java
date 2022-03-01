package pruebaTablero;
public class Tablero {
    int casillas;
    Ficha listaFichas[] = new Ficha[4];
    public Tablero(int pcasillas){
        casillas = pcasillas;
    }
    public void crearFichas(){
        Ficha[] listarFichas = new Ficha[4];
        String[] colores = {"Rojo", "Azul", "Blanco", "Morado"};
        for (int i=0; i<4; i++){
            Ficha fichaActu = new Ficha(colores[i]);
            listarFichas[i] = fichaActu;
        }
        listaFichas = listarFichas;
    }
    public void turno(Ficha pficha){
        pficha.avanzar();
    }
    public String juego(){
        while(true){            
            for (int i=0; i<4; i++){
                turno(listaFichas[i]);
                if (listaFichas[i].posicion >= casillas){
                    System.out.println("El ganador: " + listaFichas[i].color);
                    return "";
                } 
            }
        }
    }
}
