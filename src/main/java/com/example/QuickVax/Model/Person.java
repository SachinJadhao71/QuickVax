package com.example.QuickVax.Model;

import com.example.QuickVax.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data  // contains getter,setter,toString,requiredConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(nullable = false,unique = true)
    String email;

    int age;

    @Enumerated(EnumType.STRING)
    Gender gender;

    boolean dose1Taken;
    boolean dose2Taken;

}
