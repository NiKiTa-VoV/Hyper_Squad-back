package ru.nikitavov.building_control.model.database;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "complex")
public class Complex {
    @Builder.Default
    @Setter(AccessLevel.NONE)
    @OneToMany
    @JoinColumn(name = "complex_id")
    final Set<Building> buildings = new HashSet<>();
    @Builder.Default
    @Setter(AccessLevel.NONE)
    @OneToMany
    final Set<Device> devices = new HashSet<>();
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "complex_id_generator")
    @SequenceGenerator(name = "complex_id_generator", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Integer id;
    @Column(name = "address", nullable = false)
    String address;
}
