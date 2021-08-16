package com.github.ciroesteves.citiesapi.repository;

import com.github.ciroesteves.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
