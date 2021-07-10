package com.debasish.findexecutiontimeofanAPI.controller;

import com.debasish.findexecutiontimeofanAPI.model.Person;
import com.debasish.findexecutiontimeofanAPI.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/test")
    public String test() {
        LOGGER.info("Hello World API Called");
        return "Hello World";
    }

    @PostMapping(value = "/saveAndRetrieve", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> savePersonInDB(@RequestBody @Validated Person person) {
        try {
            Instant startTime = Instant.now();
            personRepository.save(person);
            LOGGER.info("Record Persisted to DB Successfully !!");
            Iterable<Person> personIterable = personRepository.findAll();
            LOGGER.info("Found the person details from DB: " + personIterable);
            Instant endTime = Instant.now();
            long duration = Duration.between(startTime, endTime).toMillis();
            LOGGER.info("Time Elapsed in milli second = " + duration + " ms");
            String formattedRes = "Time Elapsed in milli second = " + duration + " ms";
            List list = Arrays.asList(formattedRes, personIterable);
            if (list.isEmpty())
                throw new Exception("");
            return ResponseEntity.ok().body(list);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return ResponseEntity.internalServerError().body(e);
        }
    }
}
