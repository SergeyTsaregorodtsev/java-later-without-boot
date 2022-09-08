package ru.practicum.user;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users", schema = "public")
public class User {
    @Id
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate = LocalDateTime.now();

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private UserState state;

    enum UserState {
        ACTIVE, BLOCKED, DELETED;
    }
}
