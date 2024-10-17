// Anya Biswas
// CSE 114
// ID: 115769441
// Extra Credit

import java.util.ArrayList;

public class User {

    private String userName;

    //arraylist of all the user's playlists 
    ArrayList<Playlist> playlists = new ArrayList<>();

    //add playlist
    public User(){

    }

    public User(String username) {
        userName = username;
    }


    //get userName

    public String getUsername(){
        return userName;
    }

    //add playlist
    public void addPlaylist(Playlist playlist){
        playlists.add(playlist);
    }


    public void removePlaylist(String playlistTitle){
        for(Playlist playlistObject: playlists){
            if(playlistObject.playlistTitle.contains(playlistTitle))
                playlists.remove(playlistObject);
        }
    }


    //returns all playlists 
    public ArrayList<Playlist> getAllPlaylists(){
        return this.playlists;
    }


    public Playlist getPlaylist(String playlistTitle){
        Playlist playlist;
        for(Playlist playlistObject: playlists){
            if(playlistObject.playlistTitle.equals(playlistTitle)){
                playlist = playlistObject;
                return playlist;
            }
        }
        return null;
    }


    public void makeCollaborativePlaylist(String playlistTitle, User friend){
        for(Playlist playlistObject: playlists){
            if(playlistObject.playlistTitle.equals(playlistTitle))
                friend.addPlaylist(playlistObject);
        }
    }

    public String toString(){
        return "\n";
    }
}


