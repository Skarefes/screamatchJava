package screenmatch.calculos;

import screenmatch.modelo.Filme;
import screenmatch.modelo.Serie;
import screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTot;

    public int getTempoTot() {
        return this.tempoTot;
    }

//    public void inclui (Filme f){
//        this.tempoTot += f.getDuracaoMinutos();
//    }
//    public void inclui (Serie s){
//        this.tempoTot += s.getDuracaoMinutos();
//    }

    public void inclui(Titulo titulo){
        this.tempoTot += titulo.getDuracaoMinutos();

    }
}
