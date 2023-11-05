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

    public void BubblesortMusica(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = new String[n];
        for(int g=0; g<n; g++){
            nomeMusic[g] = lista.get(g).getNome_musica();
            nomeMusic[g].trim();
            
        } 
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nomeMusic[j].compareTo(nomeMusic[j+1]) > 0){
                    String aux = nomeMusic[j];
        		    nomeMusic[j]=nomeMusic[j+1];	
        		    nomeMusic[j+1]= aux;
                }
            }
        }
        for(int g=0; g<n; g++){
            System.out.println(nomeMusic[g]); 
        }

    }
    public void BubblesortArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = new String[n];
        for(int g=0; g<n; g++){
            nomeArtista[g] = lista.get(g).getNome_artista();
            nomeArtista[g].trim();
            
        } 
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nomeArtista[j].compareTo(nomeArtista[j+1]) > 0){
                    String aux = nomeArtista[j];
        		    nomeArtista[j]=nomeArtista[j+1];	
        		    nomeArtista[j+1]= aux;
                }
            }
        }
        for(int g=0; g<n; g++){
            System.out.println(nomeArtista[g]); 
        }
        
    }
    public void ShellsortMusica(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = new String[n];
        int h = 1;

        for(int g=0; g<n; g++){
            nomeMusic[g] = lista.get(g).getNome_musica();
            nomeMusic[g].trim();
            
        }
    
        while(h < n) {
            h = h * 3 + 1;
        }
    
        h = h / 3;
        int j;
        String c;
        
        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = nomeMusic[i];
                j = i;
                while (j >= h && (nomeMusic[j-h].compareTo(c) > 0)) {
                    nomeMusic[j] = nomeMusic[j - h];
                    j = j - h;
                }
                nomeMusic[j] = c;
            }
            h = h / 2;
        }
        for(int g=0; g<n; g++){
            System.out.println(nomeMusic[g]); 
        }

    }
    public void ShellsortArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = new String[n];
        int h = 1;

        for(int g=0; g<n; g++){
            nomeArtista[g] = lista.get(g).getNome_artista();
            nomeArtista[g].trim();
            
        }
    
        while(h < n) {
            h = h * 3 + 1;
        }
    
        h = h / 3;
        int j;
        String c;
        
        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = nomeArtista[i];
                j = i;
                while (j >= h && (nomeArtista[j-h].compareTo(c) > 0)) {
                    nomeArtista[j] = nomeArtista[j - h];
                    j = j - h;
                }
                nomeArtista[j] = c;
            }
            h = h / 2;
        }
        for(int g=0; g<n; g++){
            System.out.println(nomeArtista[g]); 
        }
        
    }
    public void QuicksortMusica(String nomeMusic[],int left, int right){

        int i = left, j = right;
        String tmp;
        String pivot = nomeMusic[(left + right) / 2];

        while (i <= j) {
            while (nomeMusic[i].compareTo(pivot) < 0)
                i++;
            while (nomeMusic[j].compareTo(pivot) > 0)
                j--;
            if (i <= j) {
                tmp = nomeMusic[i];
                nomeMusic[i] = nomeMusic[j];
                nomeMusic[j] = tmp;
                i++;
                j--;
            }
            };
            /* recursion */
            if (left < j)
            QuicksortMusica(nomeMusic, left, j);
            if (i < right)
            QuicksortMusica(nomeMusic, i, right);
            
            
    }
    public void QuicksortArtista(String nomeArtista[],int left2,int right2){
        int i = left2, j = right2;
        String tmp;
        String pivot = nomeArtista[(left2 + right2) / 2];

        while (i <= j) {
            while (nomeArtista[i].compareTo(pivot) < 0)
                i++;
            while (nomeArtista[j].compareTo(pivot) > 0)
                j--;
            if (i <= j) {
                tmp = nomeArtista[i];
                nomeArtista[i] = nomeArtista[j];
                nomeArtista[j] = tmp;
                i++;
                j--;
            }
            };
            /* recursion */
            if (left2 < j)
            QuicksortMusica(nomeArtista, left2, j);
            if (i < right2)
            QuicksortMusica(nomeArtista, i, right2);
        
    }
    public void HeapsortMusica(){

    }
    public void HeapsortArtista(){
        
    }
    public void MergesortMusica(){

    }
    public void MergesortArtista(){
        
    }

}
