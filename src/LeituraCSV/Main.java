package LeituraCSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        Ordenacao od = new Ordenacao();

        System.out.println("-------------------\nDigite qual metodo de ordenação deseja fazer: \n1. Seleção pelo nome da música\n2. Inserção pelo nome da música \n3.Seleção pelo nome do artista \n4. Inserção pelo nome do artista\n-------------------------"); 
        int op = sc.nextInt();
        
        switch(op){
          case 1:
            System.out.println("Seleção pelo nome da música: ");
            od.SelecaoMusica();
            break;
          case 2:
            System.out.println("Inserção pelo nome da música: ");
            od.InsercaoMusica();
            break;
          case 3:
            System.out.println("Seleção pelo nome do artista: ");
            od.SelecaoArtista();
            break;
          case 4:
            System.out.println("Inserção pelo nome do artista: ");
            od.InsercaoArtista();
            break;
          default:
            break;

        }
    
      }
    
}
