package screenmatch.modelo;

import screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int epPorTemp;
    private int minutosEpisodio;

    @Override
    public String toString() {
        return "Serie: "+ this.getNome() + "(" + this.getAnoLancamento() + ")";
    }

    public Serie(String nome, int anoLancamento){
        super(nome , anoLancamento);
    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpPorTemp() {
        return epPorTemp;
    }

    public void setEpPorTemp(int epPorTemp) {
        this.epPorTemp = epPorTemp;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    @Override
    public int getDuracaoMinutos(){
        return temporadas * epPorTemp * minutosEpisodio;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
