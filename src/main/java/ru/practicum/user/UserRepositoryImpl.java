package ru.practicum.user;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final Map<Long,User> users = new HashMap<>();
    static private long counter;

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User save(User user) {
        user.setId(++counter);
        users.put(counter,user);
        return user;
    }
}
