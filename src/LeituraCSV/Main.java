package LeituraCSV;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        try (Scanner sc = new Scanner(System.in)) {
          Ordenacao od = new Ordenacao();
          LerArquivo lr = new LerArquivo();

          System.out.println("-------------------\nDigite qual metodo de ordenação deseja fazer: \n\n0. Listar todos os objetos em meu arquivo\n1. Seleção pelo nome da música\n2. Seleção pelo nome do artista \n3. Inserção pelo nome da música \n4. Inserção pelo nome do artista\n-------------------------\n" + //
              "5. Bubblesort pelo nome da musica\n6. Bubblesort pelo nome do artista\n7. Shellsort pelo nome da musica\n8. Shellsort pelo nome do artista\n9. Quicksort pelo nome da musica\n10. Quicksort pelo nome do Artista\n-------------------------\n" + //
              "11. Heapsort pelo nome da musica\n12. Heapsort pelo nome do artista\n13. Mergesort pelo nome da musica\n14. Mergesort pelo nome do Artista \n-------------------------"); 
          int op = sc.nextInt();
          
          // Obtenha o tempo atual antes da execução do código
        long tempoInicial = System.currentTimeMillis();

        // Execute o código que você deseja medir
        switch(op){
            case 0:
              lr.ListarMusicas();
              break;
            case 1:
              System.out.println("Seleção pelo nome da música: \n-------------------");
              od.SelecaoMusica();
              break;
            case 2:
              System.out.println("Seleção pelo nome do artista: \n-------------------");
              od.SelecaoArtista();
              break;
            case 3:
              System.out.println("Inserção pelo nome da música: \n-------------------");
              od.InsercaoMusica();
              break;
            case 4:
              System.out.println("Inserção pelo nome do artista: \n-------------------");
              od.InsercaoArtista();
              break;
            case 5:
              System.out.println("Bubblesort pelo nome da música: \n-------------------");
              od.BubblesortMusica();
              break;
            case 6:
              System.out.println("Bubblesort pelo nome do artista: \n-------------------");
              od.BubblesortArtista();
              break;
            case 7:
              System.out.println("Shellsort pelo nome da música: \n-------------------");
              od.ShellsortMusica();
              break;
            case 8:
              System.out.println("Shellsort pelo nome do artista: \n-------------------");
              od.ShellsortArtista();
              break;
            case 9:
              System.out.println("Quicksort pelo nome da música: \n-------------------");
              ArrayList<Musica> lista = new ArrayList<>();
              lista = lr.ListarMusicas();
              int n = lista.size();
              String nomeMusic[] = new String[n];
              int left = 0;
              int right = n-1;

              for(int g=0; g<n; g++){
                  nomeMusic[g] = lista.get(g).getNome_musica();
                  nomeMusic[g].trim();
              
              }
              od.QuicksortMusica(nomeMusic,left,right);
              for(int g=0; g<n; g++){
                System.out.println(nomeMusic[g]); 
              }
              break;

            case 10:
              System.out.println("Quicksort pelo nome do artista: \n-------------------");
              ArrayList<Musica> lista2 = new ArrayList<>();
              lista2 = lr.ListarMusicas();
              int n2 = lista2.size();
              String nomeArtista[] = new String[n2];
              int left2 = 0;
              int right2 = n2-1;

              for(int g=0; g<n2; g++){
                  nomeArtista[g] = lista2.get(g).getNome_artista();
                  nomeArtista[g].trim();
              
              }
              od.QuicksortArtista(nomeArtista,left2,right2);
              for(int g=0; g<n2; g++){
                System.out.println(nomeArtista[g]); 
              }
              break;
            case 11:
              System.out.println("Heapsort pelo nome da música: \n-------------------");
              od.HeapsortMusica();
              break;
            case 12:
              System.out.println("Heapsort pelo nome do artista: \n-------------------");
              od.HeapsortArtista();
              break;
            case 13:
              System.out.println("Mergesort pelo nome da música: \n-------------------");
              od.MergesortMusica();
              break;
            case 14:
              System.out.println("Mergesort pelo nome do artista: \n-------------------");
              od.MergesortArtista();
              break;
            default:
              break;

          }

        // Obtenha o tempo atual após a execução do código
        long tempoFinal = System.currentTimeMillis();

        // Calcule o tempo de execução em milissegundos
        long tempoDeExecucao = tempoFinal - tempoInicial;

        System.out.println("--------------------------\nTempo de execução: " + tempoDeExecucao + " ms");
        
        int quantidadelops = 0;
        quantidadelops = od.contador;
        System.out.println("--------------------------\nQuantidade de Operações: " +quantidadelops);
        }
    
      }
    
}
