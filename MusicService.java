// Anya Biswas
// CSE 114
// ID: 115769441
// Extra Credit

import java.util.*;
public class MusicService {

    //object user of User class
    User user;

    //arraylist of users
    static ArrayList<User> users = new ArrayList<>();

    //empty constructor
    public MusicService(){
    }

    //method to add user to arraylist
    public static void addUser(User user) {
        users.add(user);
    }

    //method to remove user from arraylist
    public static void removeUsers(User user) {
        users.remove(user);
    }


    public static ArrayList<Playlist> getUserPlaylists(User user) {
        if(users.size() != 0)
            return user.getAllPlaylists(); //calls method from
        return null;
    }
}

