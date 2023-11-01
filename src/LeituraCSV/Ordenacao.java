package LeituraCSV;

import java.util.ArrayList;

public class Ordenacao extends LerArquivo{
    

    public void SelecaoMusica(){
        // instanciando lista do CSV
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = new String[n];
        for(int g=0; g<lista.size(); g++){
            nomeMusic[g] = lista.get(g).getNome_musica();
            
        } 
        for(int i=1;i<lista.size();i++){
            //percorre do 0 até o N-1
            for(int j=i; j>0; j--){
        		if(nomeMusic[j].compareTo(nomeMusic[j-1]) < 0){      
        		  String aux = nomeMusic[j];
        		  nomeMusic[j]=nomeMusic[j-1];	
        		  nomeMusic[j-1]= aux;
                  nomeMusic[j] = nomeMusic[j].replaceAll("\"", " ");
		        }
            }
        }
        for(int g=0; g<lista.size(); g++){
            System.out.println(nomeMusic[g]); 
        } 
        
    }

    public void InsercaoMusica(){

    }

    public void SelescaoArtista(){
        
    }

    public void InsercaoArtista(){
        
    }
}
