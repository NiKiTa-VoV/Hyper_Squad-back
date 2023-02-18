package ru.nikitavov.building_control.model.database;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "maintenance")
public class Maintenance {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "maintenance_id_generator")
    @SequenceGenerator(name = "maintenance_id_generator", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Integer id;

    @Builder.Default
    @Column(name = "planned", nullable = false)
    boolean planned = false;

    @Column(name = "date", nullable = false)
    Instant date;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    MaintenanceStatus status;
}
