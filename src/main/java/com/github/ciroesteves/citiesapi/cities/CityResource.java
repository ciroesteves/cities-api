package com.github.ciroesteves.citiesapi.cities;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

    // 2nd - Pageable
    @GetMapping
    public ResponseEntity<Object> cities(final Pageable page) {
        try{
            return (ResponseEntity<Object>) repository.findAll(page);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }

    }
}
