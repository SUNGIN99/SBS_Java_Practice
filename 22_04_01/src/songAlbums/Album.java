package songAlbums;

import java.util.ArrayList;

public class Album {

    private String albumName; //앨범 이름
    private int makethYear; // 앨범 제작년도

    private Artist albumsArtist; //앨범 소유 가수
    private ArrayList<Song> tracks = new ArrayList<>(); // 앨범 수록곡

    public Album(String albumName, int year, Artist artistName){
        this.albumName = albumName;
        this.albumsArtist = artistName;
        this.makethYear = year;
    }

    public int getMakethYear() {
        return makethYear;
    }

    public void addTrack(Song track){
        tracks.add(track);
    }

    public Song getTrack(int index){
        return tracks.get(index);
    }

}
