package songAlbums;

public class Song {

    private String songName;
    private Artist artistName;
    private Album albumName;

    public Song(String songName, Artist artistName, Album albumName) {
        this.songName = songName;
        this.artistName = artistName;
        this.albumName = albumName;
    }

    public String toString(){
        System.out.println("가 수   : " + artistName.getArtistName());
        System.out.println("제작연도 : " + albumName.getMakethYear());
        return this.songName;
    }
}
