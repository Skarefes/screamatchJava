package screenmatch.modelo;

import screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public Filme(String nome, int anoLancamento){
        super(nome, anoLancamento);
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }


    @Override
    public String toString() {
        return "Filme: " + this.getNome() +
                "(" + this.getAnoLancamento() + ")";
    }
}

