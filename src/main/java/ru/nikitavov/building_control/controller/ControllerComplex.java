package ru.nikitavov.building_control.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nikitavov.building_control.model.database.Building;
import ru.nikitavov.building_control.model.database.Complex;
import ru.nikitavov.building_control.repository.ComplexRepository;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/complex")
@RequiredArgsConstructor
public class ControllerComplex {

    private final ComplexRepository complexRepository;

    @GetMapping
    public ResponseEntity<List<Complex>> allComplexes() {
        return ResponseEntity.ok(complexRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Complex> complex(@PathVariable Integer id) {
        return ResponseEntity.ok(complexRepository.findById(id).get());
    }

}