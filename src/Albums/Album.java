package Albums;

public class Album {

    private String albumTitle;
    private Song[] songs;

    public Album(String albumTitle, Song[] songs) {

        this.albumTitle = albumTitle;
        this.songs = songs;
    }

    public Song[] getSongs() {
        return songs;
    }
    public String getAlbumTitle() {
        return albumTitle;
    }


}
