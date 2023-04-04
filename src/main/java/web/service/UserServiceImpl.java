package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
     List<User> userList = new ArrayList<>();

    {
        userList.add(new User("Olga", "Titiva", "tito@mail.ru"));
        userList.add(new User("Nadejda", "Moskvina", "mosk@mail.ru"));
        userList.add(new User("Leonid", "Nulevoy", "nolik@mail.ru"));
        userList.add(new User("Руслан", "Русских", "rus@mail.ru"));
        userList.add(new User("Stepan", "Petroff", "blue@mail.ru"));
    }

    @Override
    public List<User> getUsers(Integer count) {
        if (count <= 0 || count > userList.size()) {
            count = userList.size();
        }
        return userList.stream().limit(count).collect(Collectors.toList());
    }
}