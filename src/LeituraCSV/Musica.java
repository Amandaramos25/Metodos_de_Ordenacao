package LeituraCSV;
public class Musica {
    private String nome_musica;
    private String nome_artista;
    private int numero_artistas;
    private int ano_lancado;
    private int mes_lancado;
    private int dia_lancado;
    private int spotify_numero_playlist;
    private int spotify_ranking;
    private String streams;
    private int apple_numero_playlist;
    private int apple_ranking;
    private String deezer_numero_playlist;
    private int deezer_ranking;
    private double shazam_ranking;
    private int bpm;
    private String key;
    private String mode;
    private int danceability;
    private int valence;
    private int energy;
    private int acousticness;
    private int instrumentalness;
    private int liveness;
    private int speechiness;

    
    public Musica() {
        
    }


    public Musica(String nome_musica, String nome_artista, int numero_artistas, int ano_lancado, int mes_lancado,
            int dia_lancado, int spotify_numero_playlist, int spotify_ranking, String streams, int apple_numero_playlist,
            int apple_ranking, String deezer_numero_playlist, int deezer_ranking, double shazam_ranking, int bpm, String key,
            String mode, int danceability, int valence, int energy, int acousticness, int instrumentalness,
            int liveness, int speechiness) {
        this.nome_musica = nome_musica;
        this.nome_artista = nome_artista;
        this.numero_artistas = numero_artistas;
        this.ano_lancado = ano_lancado;
        this.mes_lancado = mes_lancado;
        this.dia_lancado = dia_lancado;
        this.spotify_numero_playlist = spotify_numero_playlist;
        this.spotify_ranking = spotify_ranking;
        this.streams = streams;
        this.apple_numero_playlist = apple_numero_playlist;
        this.apple_ranking = apple_ranking;
        this.deezer_numero_playlist = deezer_numero_playlist;
        this.deezer_ranking = deezer_ranking;
        this.shazam_ranking = shazam_ranking;
        this.bpm = bpm;
        this.key = key;
        this.mode = mode;
        this.danceability = danceability;
        this.valence = valence;
        this.energy = energy;
        this.acousticness = acousticness;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.speechiness = speechiness;
    }


    public String getNome_musica() {
        return nome_musica;
    }


    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }


    public String getNome_artista() {
        return nome_artista;
    }


    public void setNome_artista(String nome_artista) {
        this.nome_artista = nome_artista;
    }


    public int getNumero_artistas() {
        return numero_artistas;
    }


    public void setNumero_artistas(int numero_artistas) {
        this.numero_artistas = numero_artistas;
    }


    public int getAno_lancado() {
        return ano_lancado;
    }


    public void setAno_lancado(int ano_lancado) {
        this.ano_lancado = ano_lancado;
    }


    public int getMes_lancado() {
        return mes_lancado;
    }


    public void setMes_lancado(int mes_lancado) {
        this.mes_lancado = mes_lancado;
    }


    public int getDia_lancado() {
        return dia_lancado;
    }


    public void setDia_lancado(int dia_lancado) {
        this.dia_lancado = dia_lancado;
    }


    public int getSpotify_numero_playlist() {
        return spotify_numero_playlist;
    }


    public void setSpotify_numero_playlist(int spotify_numero_playlist) {
        this.spotify_numero_playlist = spotify_numero_playlist;
    }


    public int getSpotify_ranking() {
        return spotify_ranking;
    }


    public void setSpotify_ranking(int spotify_ranking) {
        this.spotify_ranking = spotify_ranking;
    }


    public String getStreams() {
        return streams;
    }


    public void setStreams(String streams) {
        this.streams = streams;
    }


    public int getApple_numero_playlist() {
        return apple_numero_playlist;
    }


    public void setApple_numero_playlist(int apple_numero_playlist) {
        this.apple_numero_playlist = apple_numero_playlist;
    }


    public int getApple_ranking() {
        return apple_ranking;
    }


    public void setApple_ranking(int apple_ranking) {
        this.apple_ranking = apple_ranking;
    }


    public String getDeezer_numero_playlist() {
        return deezer_numero_playlist;
    }


    public void setDeezer_numero_playlist(String deezer_numero_playlist) {
        this.deezer_numero_playlist = deezer_numero_playlist;
    }


    public int getDeezer_ranking() {
        return deezer_ranking;
    }


    public void setDeezer_ranking(int deezer_ranking) {
        this.deezer_ranking = deezer_ranking;
    }


    public double getShazam_ranking() {
        return shazam_ranking;
    }


    public void setShazam_ranking(double shazam_ranking) {
        this.shazam_ranking = shazam_ranking;
    }


    public int getBpm() {
        return bpm;
    }


    public void setBpm(int bpm) {
        this.bpm = bpm;
    }


    public String getKey() {
        return key;
    }


    public void setKey(String key) {
        this.key = key;
    }


    public String getMode() {
        return mode;
    }


    public void setMode(String mode) {
        this.mode = mode;
    }


    public int getDanceability() {
        return danceability;
    }


    public void setDanceability(int danceability) {
        this.danceability = danceability;
    }


    public int getValence() {
        return valence;
    }


    public void setValence(int valence) {
        this.valence = valence;
    }


    public int getEnergy() {
        return energy;
    }


    public void setEnergy(int energy) {
        this.energy = energy;
    }


    public int getAcousticness() {
        return acousticness;
    }


    public void setAcousticness(int acousticness) {
        this.acousticness = acousticness;
    }


    public int getInstrumentalness() {
        return instrumentalness;
    }


    public void setInstrumentalness(int instrumentalness) {
        this.instrumentalness = instrumentalness;
    }


    public int getLiveness() {
        return liveness;
    }


    public void setLiveness(int liveness) {
        this.liveness = liveness;
    }


    public int getSpeechiness() {
        return speechiness;
    }


    public void setSpeechiness(int speechiness) {
        this.speechiness = speechiness;
    }
    
    
}