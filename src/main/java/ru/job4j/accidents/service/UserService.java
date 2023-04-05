package ru.job4j.accidents.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.accidents.model.User;
import ru.job4j.accidents.repository.UserRepository;

/**
 * Сервис по работе с пользователями
 * @see ru.job4j.accidents.model.User
 * @author Alexander Emelyanov
 * @version 1.0
 */
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * Возвращает пользователя.
     *
     * @param username имя пользователя
     * @return пользователь
     */
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    /**
     * Сохраняет пользователя в базе данных, если пользователь существует,
     * будет выполнено его обновление.
     *
     * @param user пользователь
     * @return сохраненный пользователь
     */
    public User save(User user) {
        return userRepository.save(user);
    }
}