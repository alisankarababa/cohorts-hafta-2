package com.n11.cohortshafta2.config;

import com.n11.cohortshafta2.entity.House;
import com.n11.cohortshafta2.entity.ResidentialProperty;
import com.n11.cohortshafta2.entity.SummerHouse;
import com.n11.cohortshafta2.entity.Villa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigResidentialProperties {

    @Bean(name = "houseList")
    List<ResidentialProperty> houseList() {
        List<ResidentialProperty> houseList = new ArrayList<>();
        houseList.add(new House(1000, 100, 2, 1));
        houseList.add(new House(1100, 110, 3, 1));
        houseList.add(new House(1200, 120, 4, 1));
        return houseList;
    }

    @Bean(name = "villaList")
    List<ResidentialProperty> villaList() {
        List<ResidentialProperty> villaList = new ArrayList<>();
        villaList.add(new Villa(100000, 500, 6, 2));
        villaList.add(new Villa(110000, 570, 7, 3));
        villaList.add(new Villa(120000, 610, 8, 3));
        return villaList;
    }

    @Bean(name = "summerHouseList")
    List<ResidentialProperty> summerHouseList() {
        List<ResidentialProperty> summerHouseList = new ArrayList<>();
        summerHouseList.add(new SummerHouse(10000, 410, 5, 2));
        summerHouseList.add(new SummerHouse(11000, 440, 6, 3));
        summerHouseList.add(new SummerHouse(12000, 460, 7, 4));
        return summerHouseList;
    }
}
