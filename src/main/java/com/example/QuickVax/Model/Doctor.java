package com.example.QuickVax.Model;

import com.example.QuickVax.Enum.Gender;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data  // contains getter,setter,toString,requiredConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(nullable = false,unique = true)
    String email;

    int age;

    @Enumerated(EnumType.STRING)
    Gender gender;
}
