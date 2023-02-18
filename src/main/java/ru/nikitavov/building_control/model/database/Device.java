package ru.nikitavov.building_control.model.database;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "device")
public class Device {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "device_id_generator")
    @SequenceGenerator(name = "device_id_generator", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Integer id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "url_image", nullable = false)
    String urlImage;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    DeviceStatus status;
}
