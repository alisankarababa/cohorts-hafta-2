package com.n11.cohortshafta2.component;

import com.n11.cohortshafta2.entity.ResidentialProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResidentialProperties {

    private List<ResidentialProperty> houseList;
    private List<ResidentialProperty> villaList;
    private List<ResidentialProperty> summerHouseList;

    private final List<ResidentialProperty> residentialPropertyList;

    @Autowired
    public ResidentialProperties(@Qualifier(value = "houseList") List<ResidentialProperty> houseList,
                                 @Qualifier(value = "villaList") List<ResidentialProperty> villaList,
                                 @Qualifier(value = "summerHouseList") List<ResidentialProperty> summerHouseList) {
        this.houseList = houseList;
        this.villaList = villaList;
        this.summerHouseList = summerHouseList;

        this.residentialPropertyList = new ArrayList<>();

        residentialPropertyList.addAll(this.houseList);
        residentialPropertyList.addAll(this.villaList);
        residentialPropertyList.addAll(this.summerHouseList);
    }

    public List<ResidentialProperty> getHouseList() {
        return houseList;
    }

    public List<ResidentialProperty> getVillaList() {
        return villaList;
    }

    public List<ResidentialProperty> getSummerHouseList() {
        return summerHouseList;
    }

    public List<ResidentialProperty> getResidentialPropertyList() {
        return residentialPropertyList;
    }
}
