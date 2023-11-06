package LeituraCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LerArquivo {
  private static String nomeArquivo =  "./dados/spotify_2023.csv";

  public ArrayList<Musica> ListarMusicas(){
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
        ArrayList<String> attributes = new ArrayList<>();
        StringBuilder currentAttribute = new StringBuilder();
        boolean insideQuotes = false;
        int parenthesesCount = 0;

        for (char c : linha.toCharArray()) {
            if (c == '(') {
                parenthesesCount++;
                currentAttribute.append(c);
            } else if (c == ')') {
                if (parenthesesCount > 0) {
                    parenthesesCount--;
                    currentAttribute.append(c);
                } else {
                    currentAttribute.append('.');
                }
            } else if (c == '"') {
                insideQuotes = !insideQuotes;
                currentAttribute.append(c);
            } else if (c == ',' && (insideQuotes)) {
                currentAttribute.append('.');
            } else if (c == ',' && !insideQuotes) {
                // Vírgula fora de aspas e parênteses
                attributes.add(currentAttribute.toString().trim());
                currentAttribute.setLength(0);
            } else {
                currentAttribute.append(c);
            }
        }

        // Adicione o último atributo após o loop
        attributes.add(currentAttribute.toString().trim());
        //System.out.println("Tamanho: "+attributes.size());
        for (int i = 0; i < attributes.size(); i++) {
          String attribute = attributes.get(i);
          attribute = attribute.replaceAll("[\"'()]", "");
          if(attribute==""){
            attribute="0";
          }
          attributes.set(i, attribute);
      }

        // Converta o ArrayList em um vetor
        String[] attributesArray = attributes.toArray(new String[0]);

        // Exiba os atributos separados por vírgulas
        //for (String attribute : attributesArray) {
        //    System.out.println(attribute);
        //}
       

        nome_musica = attributesArray[0];
        nome_artista = attributesArray[1];
        numero_artistas = Integer.parseInt(attributesArray[2]);
        ano_lancado = Integer.parseInt(attributesArray[3]);
        mes_lancado = Integer.parseInt(attributesArray[4]);
        dia_lancado = Integer.parseInt(attributesArray[5]);
        spotify_numero_playlist = Integer.parseInt(attributesArray[6]);
        spotify_ranking = Integer.parseInt(attributesArray[7]);
        streams = attributesArray[8];
        apple_numero_playlist = Integer.parseInt(attributesArray[9]);
        apple_ranking = Integer.parseInt(attributesArray[10]);
        deezer_numero_playlist = attributesArray[11];
        deezer_ranking = Integer.parseInt(attributesArray[12]);
        shazam_ranking = Double.parseDouble(attributesArray[13]);
        bpm = Integer.parseInt(attributesArray[14]);
        key = attributesArray[15];
        mode = attributesArray[16];
        danceability = Integer.parseInt(attributesArray[17]);
        valence = Integer.parseInt(attributesArray[18]);
        energy = Integer.parseInt(attributesArray[19]);
        acousticness = Integer.parseInt(attributesArray[20]);
        instrumentalness = Integer.parseInt(attributesArray[21]);
        liveness = Integer.parseInt(attributesArray[22]);
        speechiness = Integer.parseInt(attributesArray[23]);

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
