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
@Table(name = "apartment")
public class Apartment {
    @Builder.Default
    @Setter(AccessLevel.NONE)
    @OneToMany
    final Set<Device> devices = new HashSet<>();
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "apartment_id_generator")
    @SequenceGenerator(name = "apartment_id_generator", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Integer id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "building_id", nullable = false)
    Building building;
}
