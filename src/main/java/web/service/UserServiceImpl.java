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
        userList.add(new User("Ольга", "Титова", "tito@mail.ru"));
        userList.add(new User("Надежда", "Москвина", "mosk@mail.ru"));
        userList.add(new User("Леонид", "Нулевой", "nolik@mail.ru"));
        userList.add(new User("Руслан", "Русских", "rus@mail.ru"));
        userList.add(new User("Степан", "Петров", "blue@mail.ru"));
    }

    @Override
    public List<User> getUsers(Integer count) {
        if (count <= 0 || count > userList.size()) {
            count = userList.size();
        }
        return userList.stream().limit(count).collect(Collectors.toList());
    }
}