package LeituraCSV;

import java.util.ArrayList;

public class Ordenacao extends LerArquivo{
    

    public void SelecaoMusica(){
        // instanciando lista do CSV
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = new String[n];
        for(int g=0; g<n; g++){
            nomeMusic[g] = lista.get(g).getNome_musica();
            nomeMusic[g].trim();
            
        } 

        for(int i=0;i<n-1;i++){
            //percorre do 0 até o N-1
            int min = i;
            for(int j=i+1; j<n; j++){
        		if(nomeMusic[j].compareTo(nomeMusic[min]) < 0){
                    min = j; 
		        }
            }
            if(nomeMusic[i].compareTo(nomeMusic[min]) != 0){
                String aux = nomeMusic[i];
        		nomeMusic[i]=nomeMusic[min];	
        		nomeMusic[min]= aux;
            }
        }
        for(int g=0; g<n; g++){
            System.out.println(nomeMusic[g]); 
        }
        
    }

    public void InsercaoMusica(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = new String[n];
        int i= 0;
        int j= 1;
        String aux;

        for(int g=0; g<n; g++){
            nomeMusic[g] = lista.get(g).getNome_musica();
            nomeMusic[g].trim();
            
        } 
        
        while (j < n){
            aux = nomeMusic[j];
            i = j - 1;
            while ((i >= 0) && (nomeMusic[i].compareTo(aux) > 0)){
                nomeMusic[i + 1] = nomeMusic[i];
                i = i - 1;
            }
            nomeMusic[i + 1] = aux;
            j = j + 1;
        }

        for(int g=0; g<n; g++){
            System.out.println(nomeMusic[g]); 
        }
    }

    public void SelecaoArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = new String[n];
        for(int g=0; g<n; g++){
            nomeArtista[g] = lista.get(g).getNome_artista();
            nomeArtista[g].trim();
            
        } 

        for(int i=0;i<n-1;i++){
            //percorre do 0 até o N-1
            int min = i;
            for(int j=i+1; j<n; j++){
        		if(nomeArtista[j].compareTo(nomeArtista[min]) < 0){
                    min = j; 
		        }
            }
            if(nomeArtista[i].compareTo(nomeArtista[min]) != 0){
                String aux = nomeArtista[i];
        		nomeArtista[i]=nomeArtista[min];	
        		nomeArtista[min]= aux;
            }
        }
        for(int g=0; g<lista.size(); g++){
            System.out.println(nomeArtista[g]); 
        }
    }

    public void InsercaoArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = new String[n];
        int i= 0;
        int j= 1;
        String aux;

        for(int g=0; g<n; g++){
            nomeArtista[g] = lista.get(g).getNome_artista();
            nomeArtista[g].trim();
            
        } 
        
        while (j < n){
            aux = nomeArtista[j];
            i = j - 1;
            while ((i >= 0) && (nomeArtista[i].compareTo(aux) > 0)){
                nomeArtista[i + 1] = nomeArtista[i];
                i = i - 1;
            }
            nomeArtista[i + 1] = aux;
            j = j + 1;
        }

        for(int g=0; g<n; g++){
            System.out.println(nomeArtista[g]); 
        }
        
    }
}
