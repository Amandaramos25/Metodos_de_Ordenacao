TP1 – Parte 1

Explorando as músicas do Spotify de 2023

Uma base de dados (dataset) contém as músicas mais tocadas no Spotify em 2023. Para cada
música guardaram as seguintes informações:
 track_name: Name of the song
 artist(s)_name: Name of the artist(s) of the song
 artist_count: Number of artists contributing to the song
 released_year: Year when the song was released
 released_month: Month when the song was released
 released_day: Day of the month when the song was released
 in_spotify_playlists: Number of Spotify playlists the song is included in
 in_spotify_charts: Presence and rank of the song on Spotify charts
 streams: Total number of streams on Spotify
 in_apple_playlists: Number of Apple Music playlists the song is included in
 in_apple_charts: Presence and rank of the song on Apple Music charts
 in_deezer_playlists: Number of Deezer playlists the song is included in
 in_deezer_charts: Presence and rank of the song on Deezer charts
 in_shazam_charts: Presence and rank of the song on Shazam charts
 bpm: Beats per minute, a measure of song tempo
 key: Key of the song
 mode: Mode of the song (major or minor)
 danceability_%: Percentage indicating how suitable the song is for dancing
 valence_%: Positivity of the song's musical content
 energy_%: Perceived energy level of the song
 acousticness_%: Amount of acoustic sound in the song
 instrumentalness_%: Amount of instrumental content in the song
 liveness_%: Presence of live performance elements
 speechiness_%: Amount of spoken words in the song
O programa lê esta base de dados. Foram criadas as estruturas necessárias para armazenar
estes dados em memória principal toda vez que o arquivo for lido. Foi implementado os algoritmos de ordenação por seleção, inserção, bubble sort, shell sort,
quick sort, heapsort e mergesort, ordenando primeiro pelo nome da musica e depois pelo nome do artista.

Fonte do dataset: https://www.kaggle.com/datasets/nelgiriyewithana/top-spotify-songs-
2023/data
