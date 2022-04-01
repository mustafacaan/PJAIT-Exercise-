package Albums;

public class Shelf {
    private Album[] albums;

    public Shelf(Album[] albums) {
        this.albums=albums;
    }

    public String findAlbumBySong(String songTitle) {
        for (Album a:albums){
            for (Song s:a.getSongs()){
                if (s.getTitle().equals(songTitle))
                    return a.getAlbumTitle();
            }
        }
        return "Not Found";

    }


}




