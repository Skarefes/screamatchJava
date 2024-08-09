package screenmatch.modelo;

import com.google.gson.annotations.SerializedName;
import screenmatch.modelo.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoLancamento;
    private boolean incluindoPlano;
    private double somaAvaliacoes;
    private int totAvaliacoes;
    private int duracaoMinutos;

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano, porque tem mais de 4 caracteres");
        }
        this.anoLancamento = Integer.parseInt(meuTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }


    public String toString() {
        return "Titulo" +
                "(nome = " + nome +
                ", anoLancamento = " + anoLancamento + "," + "duração = " + duracaoMinutos +
                ')';
    }

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public int getTotAvaliacoes(){
        return totAvaliacoes;
    }

    public void setTotAvaliacoes(int totAvaliacoes) {
        this.totAvaliacoes = totAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluindoPlano() {
        return incluindoPlano;
    }

    public void setIncluindoPlano(boolean incluindoPlano) {
        this.incluindoPlano = incluindoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano do lançamento: " + anoLancamento);

    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes/totAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {

        return this.getNome().compareTo(outroTitulo.getNome());
    }


}

