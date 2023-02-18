package ru.nikitavov.building_control.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nikitavov.building_control.model.database.Building;
import ru.nikitavov.building_control.repository.BuildingRepository;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/building")
@RequiredArgsConstructor
public class ControllerBuilding {
    private final BuildingRepository buildingRepository;

    @GetMapping
    public ResponseEntity<List<Building>> allBuildings() {
        return ResponseEntity.ok(buildingRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Building> building(@PathVariable Integer id) {
        return ResponseEntity.ok(buildingRepository.findById(id).get());
    }

}
