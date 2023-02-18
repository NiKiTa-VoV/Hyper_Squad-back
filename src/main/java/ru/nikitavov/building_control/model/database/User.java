package ru.nikitavov.building_control.model.database;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_id_generator")
    @SequenceGenerator(name = "user_id_generator", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Integer id;

    @Column(name = "uuid", nullable = false)
    UUID uuid;

    @Column(name = "surname", nullable = false)
    String surname;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "patronymic")
    String patronymic;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "password", nullable = false)
    String password;

    @Builder.Default
    @Column(name = "disabled", nullable = false)
    Boolean disabled = false;

    @Builder.Default
    @Column(name = "blocked", nullable = false)
    boolean blocked = false;
}
