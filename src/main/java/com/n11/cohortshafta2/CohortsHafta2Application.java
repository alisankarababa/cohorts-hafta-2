package com.n11.cohortshafta2;

import com.n11.cohortshafta2.component.ResidentialProperties;
import com.n11.cohortshafta2.service.ResidentialPropertiesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CohortsHafta2Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CohortsHafta2Application.class, args);

		ResidentialProperties residentialProperties = applicationContext.getBean(ResidentialProperties.class);

		System.out.println("---------------------Lists Of All ResidentialProperties-------------------------------");
		System.out.println(residentialProperties.getHouseList());
		System.out.println(residentialProperties.getVillaList());
		System.out.println(residentialProperties.getSummerHouseList());

		ResidentialPropertiesService residentialPropertiesService = applicationContext.getBean(ResidentialPropertiesService.class);

		System.out.println("---------------------Total Prices-------------------------------");
		System.out.println("Total price of Houses: " +  residentialPropertiesService.getTotalPriceOfHouses());
		System.out.println("Total price of Villas: " + residentialPropertiesService.getTotalPriceOfVillas());
		System.out.println("Total price of SummerHouses: " + residentialPropertiesService.getTotalPriceOfSummerHouses());
		System.out.println("Total price of ResidentialProperties: " + residentialPropertiesService.getTotalPriceOfResidentialProperties());

		System.out.println("---------------------Mean Areas-------------------------------");
		System.out.printf("Mean Area of Houses: %.2f\n", residentialPropertiesService.getMeanAreaOfHouses());
		System.out.printf("Mean Area of Villas: %.2f\n", residentialPropertiesService.getMeanAreaOfVillas());
		System.out.printf("Mean Area of SummerHouses: %.2f\n", residentialPropertiesService.getMeanAreaOfSummerHouses());
		System.out.printf("Mean Area of ResidentialProperties: %.2f\n", residentialPropertiesService.getMeanAreaOfResidentialProperties());


		System.out.println("---------------------Filtered Lists-------------------------------");
		var filteredListOfResidentialProperties1 = residentialPropertiesService.filterResidentialProperties(4, 2);
		System.out.println("List of ResidentialProperties having minCntRoom 4, min cntLivingRoom 2, size of the list: " + filteredListOfResidentialProperties1.size());
		System.out.println(filteredListOfResidentialProperties1);

		var filteredListOfResidentialProperties2 = residentialPropertiesService.filterResidentialProperties(3, 1);
		System.out.println("List of ResidentialProperties having minCntRoom 3, min cntLivingRoom 1, size of the list: " + filteredListOfResidentialProperties2.size());
		System.out.println(filteredListOfResidentialProperties2);

	}

}
