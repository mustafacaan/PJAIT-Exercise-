package Albums;
public class Song {
    private  String singer;
    private  String songTitle;

    public Song(String singer, String songTitle) {
        this.singer=singer;
        this.songTitle=songTitle;
    }
    public String getTitle(){
        return songTitle;
    }

}