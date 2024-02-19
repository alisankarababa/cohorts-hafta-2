package com.n11.cohortshafta2.service;

import com.n11.cohortshafta2.component.ResidentialProperties;
import com.n11.cohortshafta2.entity.ResidentialProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class ResidentialPropertiesService {

    private final ResidentialProperties residentialProperties;

    @Autowired
    public ResidentialPropertiesService(ResidentialProperties residentialProperties) {
        this.residentialProperties = residentialProperties;
    }

    private static double getTotalPrice(List<ResidentialProperty> propertyList) {
        return propertyList.stream()
                .mapToDouble(ResidentialProperty::getPrice)
                .sum();
    }

    public double getTotalPriceOfHouses() {
        var houseList = residentialProperties.getHouseList();
        return getTotalPrice(houseList);
    }

    public double getTotalPriceOfVillas() {
        var villaList = residentialProperties.getVillaList();
        return getTotalPrice(villaList);
    }

    public double getTotalPriceOfSummerHouses() {
        var summerHouseList = residentialProperties.getSummerHouseList();
        return getTotalPrice(summerHouseList);
    }

    public double getTotalPriceOfResidentialProperties() {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    private static double getMeanArea(List<ResidentialProperty> propertyList) {
        OptionalDouble meanArea = propertyList.stream()
                .mapToInt(ResidentialProperty::getArea)
                .average();

        if(meanArea.isEmpty())
            return 0;

        return meanArea.getAsDouble();
    }

    public double getMeanAreaOfHouses() {
        var houseList = residentialProperties.getHouseList();
        return getMeanArea(houseList);
    }

    public double getMeanAreaOfVillas() {
        var villaList = residentialProperties.getVillaList();
        return getMeanArea(villaList);
    }

    public double getMeanAreaOfSummerHouses() {
        var summerHouseList = residentialProperties.getSummerHouseList();
        return getMeanArea(summerHouseList);
    }

    public double getMeanAreaOfResidentialProperties() {
        List<ResidentialProperty> propertyList = residentialProperties.getResidentialPropertyList();
        return getMeanArea(propertyList);
    }

    public List<ResidentialProperty> filterResidentialProperties(int minCntRoom, int minCntLivingRoom) {
        List<ResidentialProperty> propertyList = residentialProperties.getResidentialPropertyList();

        return propertyList.stream()
                .filter(
                    residentialProperty ->
                    residentialProperty.getNumberOfRooms() >= minCntRoom &&
                    residentialProperty.getNumberOfLivingRooms() >=minCntLivingRoom
                )
                .collect(Collectors.toList());
    }
}
