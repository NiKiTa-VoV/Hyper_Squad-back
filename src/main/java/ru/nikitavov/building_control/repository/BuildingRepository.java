package ru.nikitavov.building_control.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nikitavov.building_control.model.database.Building;

public interface BuildingRepository extends JpaRepository<Building, Integer> {
}