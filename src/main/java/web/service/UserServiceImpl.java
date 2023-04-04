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
        userList.add(new User("Volga", "2411", "black"));
        userList.add(new User("Moskvich", "412", "red"));
        userList.add(new User("LADA", "2104", "grey"));
        userList.add(new User("UAZ", "469", "green"));
        userList.add(new User("Pobeda", "M-20", "blue"));
    }

    @Override
    public List<User> getUsers(Integer count) {
        if (count <= 0 || count > userList.size()) {
            count = userList.size();
        }
        return userList.stream().limit(count).collect(Collectors.toList());
    }
}