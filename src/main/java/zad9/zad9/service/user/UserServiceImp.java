package zad9.zad9.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zad9.zad9.aspect.ReadTimeMeasure;
import zad9.zad9.aspect.SaveTimeMeasure;
import zad9.zad9.model.User;
import zad9.zad9.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @ReadTimeMeasure
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @SaveTimeMeasure
    public void saveAll(List<User> users) {
        userRepository.saveAll(users);
    }

}
