package zad9.zad9.service.user;


import org.springframework.stereotype.Repository;
import zad9.zad9.model.User;

import java.util.List;


public interface UserService {

    List<User> findAll();

    void saveAll(List<User> users);


}
