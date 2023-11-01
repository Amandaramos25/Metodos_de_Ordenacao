package LeituraCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LerArquivo {
  private static String nomeArquivo =  "./dados/spotify_2023.csv";

  public static ArrayList<Musica> ListarMusicas(){
    ArrayList<Musica> lista = new ArrayList<>();
    try {
      //Abrir Leitor
      BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
      String linha;
      boolean primeiraLinha = true;

      String nome_musica = "";
      String nome_artista = "";
      int numero_artistas = 0;
      int ano_lancado = 0;
      int mes_lancado = 0;
      int dia_lancado = 0;
      int spotify_numero_playlist = 0;
      int spotify_ranking = 0;
      String streams = "";
      int apple_numero_playlist = 0;
      int apple_ranking = 0;
      String deezer_numero_playlist = "";
      int deezer_ranking = 0;
      double shazam_ranking = 0.0;
      int bpm = 0;
      String key =  "";
      String mode =  "";
      int danceability = 0;
      int valence = 0;
      int energy = 0;
      int acousticness = 0;
      int instrumentalness = 0;
      int liveness = 0;
      int speechiness = 0;

      while( ( linha = leitor.readLine() ) != null){
        //ignora a primeira linha
        if(primeiraLinha){
          primeiraLinha = false;
          continue;
        }

        String sem_tratamento_de_aspas = "";
        String sem_tratamento_de_parenteses = "";
        int indiceAspas = 0;
        int indiceParen = 0;
        for(int i=0;i<linha.length();i++){
            
          char caractere = linha.charAt(i);
          linha = linha.replaceAll("\\[", "");
          linha = linha.replaceAll("\\]", "");
          
          //tratamento das aspas
          if(caractere=='\"'){
            indiceAspas++;
          }
          if(indiceAspas==1){
            sem_tratamento_de_aspas = sem_tratamento_de_aspas + caractere;
          }
          else if(indiceAspas==2){
            indiceAspas=0;
            String semvirgula = sem_tratamento_de_aspas.replaceAll(",", ".");
            linha = linha.replaceAll(sem_tratamento_de_aspas, semvirgula);
            
            sem_tratamento_de_aspas = "";
            semvirgula = "";
          }

          
        }
        //System.out.println(linha);
        
        linha = linha.replaceAll("\"", "");

        String[] partes = linha.split(",");

        partes[11] = partes[11].replaceAll(" ", "");

        for(int j=0;j<partes.length;j++){
          if(partes[j]==""){
            partes[j] = "0";
          }
          //System.out.println(partes[j]+": indice "+j);
        }
        nome_musica = partes[0];
        nome_artista = partes[1];
        numero_artistas = Integer.parseInt(partes[2]);
        ano_lancado = Integer.parseInt(partes[3]);
        mes_lancado = Integer.parseInt(partes[4]);
        dia_lancado = Integer.parseInt(partes[5]);
        spotify_numero_playlist = Integer.parseInt(partes[6]);
        spotify_ranking = Integer.parseInt(partes[7]);
        streams = partes[8];
        apple_numero_playlist = Integer.parseInt(partes[9]);
        apple_ranking = Integer.parseInt(partes[10]);
        deezer_numero_playlist = partes[11];
        deezer_ranking = Integer.parseInt(partes[12]);
        shazam_ranking = Double.parseDouble(partes[13]);
        bpm = Integer.parseInt(partes[14]);
        key = partes[15];
        mode = partes[16];
        danceability = Integer.parseInt(partes[17]);
        valence = Integer.parseInt(partes[18]);
        energy = Integer.parseInt(partes[19]);
        acousticness = Integer.parseInt(partes[20]);
        instrumentalness = Integer.parseInt(partes[21]);
        liveness = Integer.parseInt(partes[22]);
        speechiness = Integer.parseInt(partes[23]);

        //criar  objeto Musica
        Musica m = new Musica(nome_musica, nome_artista, numero_artistas, ano_lancado, mes_lancado, dia_lancado, spotify_numero_playlist, spotify_ranking, streams, apple_numero_playlist, apple_ranking, deezer_numero_playlist, deezer_ranking, shazam_ranking, bpm, key, mode, danceability, valence, energy, acousticness, instrumentalness, liveness, speechiness);
        lista.add(m);

        //imprimir
        //System.out.println("Nome da Musica: " + nome_musica + "\nNome do(s) Artista(s): " + nome_artista + "\nNumero de Artistas: " + numero_artistas + "\nAno Lançado: " + ano_lancado + "\nMês Lançado: " + mes_lancado + "\nDia Lançado: " + dia_lancado + "\nNumero de Playlists no Spotify: " + spotify_numero_playlist + "\nRanking no Spotify: " + spotify_ranking + "\nTotal de Streams no Spotify: " + streams + "\nNumero de Playlists na Apple: " + apple_numero_playlist + "\nRanking na Apple: " + apple_ranking + "\nNumero de Playlists no Deezer: " + deezer_numero_playlist + "\nRanking no Deezer: " + deezer_ranking + "\nRanking no Shazam: " + shazam_ranking + "\nBatidas por minuto (tempo): " + bpm + "\nNota musical (key): " + key + "\nModo: " + mode + "\nDançabilidade: " + danceability + "\nValência: " + valence + "\nEnergia: " + energy + "\nAcusticidade: " + acousticness + "\nInstrumentalidade: " + instrumentalness + "\nVivacidade: " + liveness + "\nFala: " + speechiness+"\n\n");


      }
      leitor.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return lista;
  }
    
}
