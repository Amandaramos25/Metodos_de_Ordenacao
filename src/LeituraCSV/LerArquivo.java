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

      String nome_musica = " ";
      String nome_artista = " ";
      int numero_artistas = 0;
      int ano_lancado = 0;
      int mes_lancado = 0;
      int dia_lancado = 0;
      int spotify_numero_playlist = 0;
      int spotify_ranking = 0;
      int streams = 0;
      int apple_numero_playlist = 0;
      int apple_ranking = 0;
      int deezer_numero_playlist = 0;
      int deezer_ranking = 0;
      int shazam_ranking = 0;
      int bpm = 0;
      String key =  " ";
      String mode =  " ";
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

        //dividir a linha em partes
        String[] partes = linha.split(",");


        if(linha.contains("\"")){
          String[] separarArtistas = linha.split("\"");
          
          String restoLinha = separarArtistas[2];
          String[] partesResto = restoLinha.split(",");

          nome_musica = separarArtistas[0];
          nome_artista = separarArtistas[1];
          numero_artistas = Integer.parseInt(partesResto[1]);
          ano_lancado = Integer.parseInt(partesResto[2]);
          mes_lancado = Integer.parseInt(partesResto[3]);
          dia_lancado = Integer.parseInt(partesResto[4]);
          spotify_numero_playlist = Integer.parseInt(partesResto[5]);
          spotify_ranking = Integer.parseInt(partesResto[6]);
          streams = Integer.parseInt(partesResto[7]);
          apple_numero_playlist = Integer.parseInt(partesResto[8]);
          apple_ranking = Integer.parseInt(partesResto[9]);
          deezer_numero_playlist = Integer.parseInt(partesResto[10]);
          deezer_ranking = Integer.parseInt(partesResto[11]);
          shazam_ranking = Integer.parseInt(partesResto[12]);
          bpm = Integer.parseInt(partesResto[13]);
          key = partesResto[14];
          mode = partesResto[15];
          danceability = Integer.parseInt(partesResto[16]);
          valence = Integer.parseInt(partesResto[17]);
          energy = Integer.parseInt(partesResto[18]);
          acousticness = Integer.parseInt(partesResto[19]);
          instrumentalness = Integer.parseInt(partesResto[20]);
          liveness = Integer.parseInt(partesResto[21]);
          speechiness = Integer.parseInt(partesResto[22]);

        }
        else{
          nome_musica = partes[0];
          nome_artista = partes[1];
          numero_artistas = Integer.parseInt(partes[2]);
          ano_lancado = Integer.parseInt(partes[3]);
          mes_lancado = Integer.parseInt(partes[4]);
          dia_lancado = Integer.parseInt(partes[5]);
          spotify_numero_playlist = Integer.parseInt(partes[6]);
          spotify_ranking = Integer.parseInt(partes[7]);
          streams = Integer.parseInt(partes[8]);
          apple_numero_playlist = Integer.parseInt(partes[9]);
          apple_ranking = Integer.parseInt(partes[10]);
          deezer_numero_playlist = Integer.parseInt(partes[11]);
          deezer_ranking = Integer.parseInt(partes[12]);
          shazam_ranking = Integer.parseInt(partes[13]);
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

        }

        //criar  objeto Musica
        Musica m = new Musica(nome_musica, nome_artista, numero_artistas, ano_lancado, mes_lancado, dia_lancado, spotify_numero_playlist, spotify_ranking, streams, apple_numero_playlist, apple_ranking, deezer_numero_playlist, deezer_ranking, shazam_ranking, bpm, key, mode, danceability, valence, energy, acousticness, instrumentalness, liveness, speechiness);
        lista.add(m);

        //imprimir
        System.out.println("Nome da Musica: " + nome_musica);
        System.out.println("Nome do(s) Artista(s): " + nome_artista);
        System.out.println("Numero de Artistas: " + numero_artistas);
        System.out.println("Ano Lançado: " + ano_lancado);
        System.out.println("Mês Lançado: " + mes_lancado);
        System.out.println("Dia Lançado: " + dia_lancado);
        System.out.println("Numero de Playlists no Spotify: " + spotify_numero_playlist);
        System.out.println("Ranking no Spotify: " + spotify_ranking);
        System.out.println("Total de Streams no Spotify: " + streams);
        System.out.println("Numero de Playlists na Apple: " + apple_numero_playlist);
        System.out.println("Ranking na Apple: " + apple_ranking);
        System.out.println("Numero de Playlists no Deezer: " + deezer_numero_playlist);
        System.out.println("Ranking no Deezer: " + deezer_ranking);
        System.out.println("Ranking no Shazam: " + shazam_ranking);
        System.out.println("Batidas por minuto (tempo): " + bpm);
        System.out.println("Nota musical (key): " + key);
        System.out.println("Modo: " + mode);
        System.out.println("Dançabilidade: " + danceability);
        System.out.println("Valência: " + valence);
        System.out.println("Energia: " + energy);
        System.out.println("Acusticidade: " + acousticness);
        System.out.println("Instrumentalidade: " + instrumentalness);
        System.out.println("Vivacidade: " + liveness);
        System.out.println("Fala: " + speechiness+"\n\n");
  
      }
      leitor.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return lista;
  }
    
}
