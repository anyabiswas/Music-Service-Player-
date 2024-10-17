
// Anya Biswas
// CSE 114
// ID: 115769441
// Extra Credit

import java.util.ArrayList;

public class Playlist {

    String playlistTitle;

    ArrayList<Song> songs = new ArrayList<>();

    public Playlist(){

    }

    public Playlist(String str) {
        this.playlistTitle = str;
    }

    public String getPlaylistTitle(){
        return this.playlistTitle;
    }

    public void setTitle(String playlistTitle){
        this.playlistTitle = playlistTitle;
    }

    public void setPlaylistTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    //add songs
    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String songTitle){
        for(Song songObject: songs){
            if(songObject.songName.equals(songTitle)) {
                songs.remove(songObject);
                break;
            }
        }
    }

    public void swapSongs(Song song1, Song song2){
        if(songs.contains(song1) && songs.contains(song2)){
            int tempIndex1 = songs.indexOf(song1);
            int tempIndex2 = songs.indexOf(song2);
            songs.set(tempIndex1, song2);
            songs.set(tempIndex2, song1);
        }
    }

    public String getTotalDuration(){
        int totalSecs = 0;
        int totalMins = 0;
        ArrayList<String> arr = new ArrayList<>();
        for(Song songObject: songs){
            arr.add(songObject.duration.substring(0,songObject.duration.length() -3));
            arr.add(songObject.duration.substring(songObject.duration.length() -2));

            int Secs = Integer.parseInt(arr.get(1));
            int Mins = Integer.parseInt(arr.get(0));

            totalSecs += Secs;
            totalMins += Mins;

            arr.remove(1);
            arr.remove(0);
        }

        int tempMins = totalSecs / 60;
        totalSecs %= 60;
        totalMins += tempMins;

        return totalMins + "min, " + totalSecs + "sec";

    }

    public void sortSongs(){

        for(int i = 0; i < songs.size()-1; i++){
            Song songObject;
            for(int j = 1 + 1; j < songs.size(); j++) {
                if (songs.get(i).compareTo(songs.get(j)) > 0) {
                    songObject = songs.get(i);
                    songs.set(i, songs.get(j));
                    songs.set(j, songObject);
                }
                if (songs.get(i).songName.equals(songs.get(j).songName) && (songs.get(i).artistName.compareTo(songs.get(j).artistName) > 0)) {
                    songObject = songs.get(i);
                    songs.set(i, songs.get(j));
                    songs.set(j, songObject);
                }
            }
        }
    }

    public String toString(){
        StringBuilder print = new StringBuilder(playlistTitle + " - " + getTotalDuration() + "\n");

        int n = 1;
        for(Song sObj: songs){
            print.append(n++ + ". " + sObj.toString() + "\n");
        }
        return print.toString();
    }
}

