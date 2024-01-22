package com.example.QuickVax.Transformer;

import com.example.QuickVax.DTO.PersonRequestDto;
import com.example.QuickVax.Model.Person;

public class PersonTransformer {

    public static Person requestDtoToPerson(PersonRequestDto personRequestDto){

        return Person.builder()
                .age(personRequestDto.getAge())
                .name(personRequestDto.getName())
                .email(personRequestDto.getEmail())
                .gender(personRequestDto.getGender())
                .build();
    }
}
