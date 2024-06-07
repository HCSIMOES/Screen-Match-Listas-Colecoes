package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main (String []args) {
        Filme meuFilme = new Filme("Duelo de titãs", 1999);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8.5);
        var filmeDoHenrique = new Filme("Top Gun", 2003);
        filmeDoHenrique.avalia(10);
        Serie chosen = new Serie("The Chosen", 2018);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoHenrique);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(chosen);
        for (Titulo item: lista) {
            System.out.println( "Nome: " + item.getNome());
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                if (filme.getClassificacao() > 2) {
                    System.out.println("Classificação:" + filme.getClassificacao());
                }
            }
        }
    }
}
