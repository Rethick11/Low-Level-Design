package IteratorRepositoryPattern.repository;
import IteratorRepositoryPattern.Database;
import java.util.*;


public class UserRepository {

    private List<String> data ;
    private int size;
    public UserRepository(){
        this.data =  new Database().getUsers();
        this.size = this.data.size();
    }

    public List<String> fetch(int limit, int offset){

        int start = (offset - 1) * limit;
        int end = Math.min(start + limit , this.data.size());

        if (start > end){
            return List.of();
        }

        return data.subList(start,end);
    }

    public int getSize(){
        return this.size;
    }

}
