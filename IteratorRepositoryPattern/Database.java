package IteratorRepositoryPattern;
import java.util.*;
public class Database {
    private List<String> users = new ArrayList<>();

    public void seeder(){
        for (int i=0; i < 2000; i++){
            users.add("User " + i);
        }
    }

    public List<String> getUsers(){
        return users;
    }
    

}
