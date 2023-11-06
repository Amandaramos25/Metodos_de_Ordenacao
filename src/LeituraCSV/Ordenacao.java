package LeituraCSV;

import java.util.ArrayList;

public class Ordenacao extends LerArquivo{
    int contador=0;
    public void imprmirVetor(String[] nome, int n){
        for(int g=0; g<n; g++){
            System.out.println(nome[g]); 
        }
    }

    public void Contador(){
        contador++;
    }

    public String[] SelecionarNomesMusica(ArrayList<Musica> lista){
        int n = lista.size();
        String nomeMusic[] = new String[n];
        for(int g=0; g<n; g++){
            nomeMusic[g] = lista.get(g).getNome_musica();
            nomeMusic[g].trim();
        } 
        return nomeMusic;
    }

    public String[] SelecionarNomesArtista(ArrayList<Musica> lista){
        int n = lista.size();
        String nomeArtista[] = new String[n];
        for(int g=0; g<n; g++){
            nomeArtista[g] = lista.get(g).getNome_artista();
            nomeArtista[g].trim();
        } 
        return nomeArtista;
    }

    public void SelecaoMusica(){
        // instanciando lista do CSV
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();

        String nomeMusic[] = SelecionarNomesMusica(lista);

        for(int i=0;i<n-1;i++){
            //percorre do 0 até o N-1
            int min = i;
            for(int j=i+1; j<n; j++){
        		if(nomeMusic[j].compareTo(nomeMusic[min]) < 0){
                    min = j; 
		        }
                Contador();
            }
            if(nomeMusic[i].compareTo(nomeMusic[min]) != 0){
                String aux = nomeMusic[i];
        		nomeMusic[i]=nomeMusic[min];	
        		nomeMusic[min]= aux;
            }
        }
        imprmirVetor(nomeMusic, n);
    }

    

    public void InsercaoMusica(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = SelecionarNomesMusica(lista);
        int i= 0;
        int j= 1;
        String aux;
        
        while (j < n){
            aux = nomeMusic[j];
            i = j - 1;
            while ((i >= 0) && (nomeMusic[i].compareTo(aux) > 0)){
                nomeMusic[i + 1] = nomeMusic[i];
                i = i - 1;
                Contador();
            }
            nomeMusic[i + 1] = aux;
            j = j + 1;
        }

        imprmirVetor(nomeMusic, n);
    }

    public void SelecaoArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = SelecionarNomesArtista(lista);
        
        for(int i=0;i<n-1;i++){
            //percorre do 0 até o N-1
            int min = i;
            for(int j=i+1; j<n; j++){
        		if(nomeArtista[j].compareTo(nomeArtista[min]) < 0){
                    min = j; 
                    Contador();
		        }
            }
            if(nomeArtista[i].compareTo(nomeArtista[min]) != 0){
                String aux = nomeArtista[i];
        		nomeArtista[i]=nomeArtista[min];	
        		nomeArtista[min]= aux;
            }
        }
        imprmirVetor(nomeArtista, n);
    }

    public void InsercaoArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = SelecionarNomesArtista(lista);
        int i= 0;
        int j= 1;
        String aux;

        
        while (j < n){
            aux = nomeArtista[j];
            i = j - 1;
            while ((i >= 0) && (nomeArtista[i].compareTo(aux) > 0)){
                nomeArtista[i + 1] = nomeArtista[i];
                i = i - 1;
                Contador();
            }
            nomeArtista[i + 1] = aux;
            j = j + 1;
        }

        imprmirVetor(nomeArtista, n);
        
    }

    public void BubblesortMusica(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = SelecionarNomesMusica(lista);

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nomeMusic[j].compareTo(nomeMusic[j+1]) > 0){
                    String aux = nomeMusic[j];
        		    nomeMusic[j]=nomeMusic[j+1];	
        		    nomeMusic[j+1]= aux;
                }
                Contador();
            }
        }
        imprmirVetor(nomeMusic, n);

    }
    public void BubblesortArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = SelecionarNomesArtista(lista);

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nomeArtista[j].compareTo(nomeArtista[j+1]) > 0){
                    String aux = nomeArtista[j];
        		    nomeArtista[j]=nomeArtista[j+1];	
        		    nomeArtista[j+1]= aux;
                }
                Contador();
            }
        }
        imprmirVetor(nomeArtista, n);
        
    }
    public void ShellsortMusica(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = SelecionarNomesMusica(lista);
        int h = 1;
    
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
                    Contador();
                }
                nomeMusic[j] = c;
            }
            h = h / 2;
        }
        imprmirVetor(nomeMusic, n);

    }
    public void ShellsortArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = SelecionarNomesArtista(lista);
        int h = 1;
    
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
                    Contador();
                }
                nomeArtista[j] = c;
            }
            h = h / 2;
        }
        imprmirVetor(nomeArtista, n);
        
    }
    public void QuicksortMusica(String nomeMusic[],int left, int right){

        int i = left, j = right;
        String tmp;
        String pivot = nomeMusic[(left + right) / 2];

        while (i <= j) {
            while (nomeMusic[i].compareTo(pivot) < 0){
                i++;
                Contador();
            }
                
            while (nomeMusic[j].compareTo(pivot) > 0){
                j--;
                Contador();
            }
                
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
            while (nomeArtista[i].compareTo(pivot) < 0){
                i++;
                Contador();
            }
                
            while (nomeArtista[j].compareTo(pivot) > 0){
                j--;
                Contador();
            }
                
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
    private void aplicarHeap(String[] nome, int n, int i){
        int raiz = i;
        int esquerda = 2*i+1;
        int direita = 2*i+2;

        if(esquerda<n && nome[esquerda].compareTo(nome[raiz])>0){
            raiz = esquerda;
        }
        if(direita<n && nome[direita].compareTo(nome[raiz])>0){
            raiz = direita;
        }
        if(raiz!=i){
            String aux = nome[i];
        	nome[i]=nome[raiz];	
        	nome[raiz]= aux;
            aplicarHeap(nome, n, raiz);
        }

    }
    public void HeapsortMusica(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = SelecionarNomesMusica(lista);

        for(int i = n/2 -1; i>=0;i--){
            aplicarHeap(nomeMusic,n,i);
            Contador();
        }

        for(int j = n-1;j>0;j--){
            String aux = nomeMusic[0];
        	nomeMusic[0]=nomeMusic[j];	
        	nomeMusic[j]= aux;
            Contador();

            aplicarHeap(nomeMusic, j, 0);
        }
        imprmirVetor(nomeMusic, n);

    }
    public void HeapsortArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = SelecionarNomesArtista(lista);

        for(int i = n/2 -1; i>=0;i--){
            aplicarHeap(nomeArtista,n,i);
            Contador();
        }

        for(int j = n-1;j>0;j--){
            String aux = nomeArtista[0];
        	nomeArtista[0]=nomeArtista[j];	
        	nomeArtista[j]= aux;
            Contador();

            aplicarHeap(nomeArtista, j, 0);
        }
        
        imprmirVetor(nomeArtista, n);
        
    }
    public void MergesortMusica(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeMusic[] = SelecionarNomesMusica(lista);

        String nomeAux[] = new String[n];

        mergeSort(nomeMusic,nomeAux,0,n-1);

        imprmirVetor(nomeAux, n);
    }
    

    public void MergesortArtista(){
        ArrayList<Musica> lista = new ArrayList<>();
        lista = ListarMusicas();
        int n = lista.size();
        String nomeArtista[] = SelecionarNomesArtista(lista);

        String nomeAux[] = new String[n];

        mergeSort(nomeArtista,nomeAux,0,n-1);

        imprmirVetor(nomeAux, n);
        
    }

    public void mergeSort(String[] nome, String[] nomeAux, int ini, int fim) {
        if(ini<fim){
            int meio = (ini+fim)/2;
            mergeSort(nome, nomeAux, ini, meio);
            mergeSort(nome, nomeAux, meio+1, fim);
            intercalar(nome,nomeAux,ini, meio ,fim);
        }
    }

    public void intercalar(String[] nome, String[] nomeAux, int ini, int meio, int fim) {
         for(int k = ini; k <= fim; k++){
            nomeAux[k] = nome[k];
         }
        int i = ini;
        int j = meio +1;

        for(int k =ini;k<=fim;k++){
            Contador();
            if(i > meio){
                nome[k] = nomeAux[j++];
            }
            else if(j>fim){
                nome[k] = nomeAux[i++];
            }
            else if(nomeAux[i].compareTo(nomeAux[j])<0){
                nome[k] = nomeAux[i++];
            }
            else{
                nome[k] = nomeAux[j++];
            }
        }
    }

}
