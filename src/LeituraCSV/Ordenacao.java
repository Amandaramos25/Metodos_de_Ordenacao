package LeituraCSV;

import java.util.ArrayList;

public class Ordenacao extends LerArquivo{
    

    public void SelecaoMusica(){
        // instanciando lista do CSV
        ArrayList<Musica> lista = ListarMusicas();
        System.out.println(lista);
    }
}
