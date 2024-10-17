// Anya Biswas
// CSE 114
// ID: 115769441
// Extra Credit

public class Song implements Comparable<Song>{
    String songName, artistName, duration;

    public Song(){
    }

    public Song(String Songname, String Artistname, String Duration){
        songName = Songname;
        artistName = Artistname;
        duration = Duration;
    }

    public int compareTo(Song song){
        return songName.compareTo(song.songName);
    }

    public String toString(){
        return songName + " by " + artistName + " (" + duration + ") ";
    }

}