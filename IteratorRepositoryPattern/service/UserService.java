package IteratorRepositoryPattern.service;
import IteratorRepositoryPattern.repository.UserRepository;
import IteratorRepositoryPattern.iterator.Iterator;




import java.util.List;

public class UserService {

   
    private final Iterator userIterator;

    public UserService() {
        
        this.userIterator = new Iterator();
    }

    public void getUsersOnPlatform() {

        /**
         this.userRepository.findUsers(10, 1);
         * 1. Here the Service layer has to keep track of current offset
         * 2. Wherever this pagination is reqd, we need to maintain offset there
         * 3. We don't know when to stop ? We might have to write a custom logic, to check if no more data is there
         *
          */

        while(userIterator.hasNext()) {
            List<String> users = userIterator.next();
            System.out.println(users);
        }

    }
}
