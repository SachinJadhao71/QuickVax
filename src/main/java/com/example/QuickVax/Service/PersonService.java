package com.example.QuickVax.Service;

import com.example.QuickVax.DTO.PersonRequestDto;
import com.example.QuickVax.Exception.BelowAgeException;
import com.example.QuickVax.Model.Person;
import com.example.QuickVax.Repository.PersonRepository;
import com.example.QuickVax.Transformer.PersonTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;
    public String add(PersonRequestDto personRequestDto) {

        Person person = PersonTransformer.requestDtoToPerson(personRequestDto);

//        check if age is not above 18
        if(person.getAge() < 18){
            throw new BelowAgeException("You are under Age");
        }

        Person savedPerson = personRepository.save(person);

        return "Congrats, Mr. "+ savedPerson.getName() +", You have successfully registered on QuickVax." +
                " Book your Dose as soon as possible, Thanks and regard..!";

    }
}
