package IteratorRepositoryPattern.iterator;
import java.util.List;

import IteratorRepositoryPattern.repository.UserRepository;
public class Iterator implements IIterator<List<String>> {
    private int limit, offset , size;
    private UserRepository userRepo;
    private List<String> current;
    public Iterator(){
        this.limit = 1;
        this.offset = 1;
        this.userRepo = new UserRepository();
        this.size = userRepo.getSize();
        this.current = userRepo.fetch(this.limit, this.offset);
    }
    
    @Override
    public boolean hasNext() {
        return !this.current.isEmpty();
    
    }

    @Override
    public List<String> next() {
        List<String> result = this.current;
        this.offset += 1;
        this.current = userRepo.fetch(this.limit, this.offset);
        return result;
    
    }

}
