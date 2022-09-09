package ru.practicum.user;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserMapper {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH.mm.ss");

    public static User toUser(UserDto dto) {
        User user = new User();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setRegistrationDate(LocalDateTime.now());
        user.setState(User.UserState.valueOf(dto.getState()));
        return user;
    }

    public static UserDto toDto(User user) {
        UserDto dto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getRegistrationDate().format(formatter),
                user.getState().name()
        );
        return dto;
    }
}
