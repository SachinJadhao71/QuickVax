package com.example.QuickVax.Controller;

import com.example.QuickVax.DTO.PersonRequestDto;
import com.example.QuickVax.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody PersonRequestDto personRequestDto){
        try {
            String message = personService.add(personRequestDto);
            return new ResponseEntity(message, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

//    update email

//      get all males of age greater than a certain age
//      get all females who have taken only dose 1 not dose 2
//      get all the people who are fully vaccinated
//      get all the people who have not taken even a single dose
//      get all females whose age is greater than a particular age and who have taken only dose 1
//      get all males whose age is greater than a particular age and who have taken both
}
