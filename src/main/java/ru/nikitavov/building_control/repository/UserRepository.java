package ru.nikitavov.building_control.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nikitavov.building_control.model.database.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}