package com.vicraffa.mongo_pj;

import com.vicraffa.mongo_pj.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public List<User> findAll () {
        User user1 = new User("1", "alex", "alex@email");
        User user2 = new User("2", "jona", "jona@email");

        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(user1, user2));

        return users;
    }
}
