package br.com.eumiriam;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        //criando class Gato
        Gato gato = new Gato();
        System.out.println(gato);
        var livro = new Livro("A menina que não sabia ler", 282);
        System.out.println(livro);
        /*int a = 5;
        int b = 3;

        System.out.println("hello world! " + (a + b));*/

    }
}
class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
}