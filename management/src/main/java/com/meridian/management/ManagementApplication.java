package com.meridian.management;

import com.meridian.patterns.builder.Client;
import com.meridian.patterns.builder2.Seller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Scanner;

import static com.meridian.collection.NonRepeating.findFirstUnique;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ManagementApplication {
	private static final Logger LOGGER = (Logger) LogManager.getLogger(ManagementApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ManagementApplication.class, args);

		try (Scanner scanner = new Scanner(System.in)){
			LOGGER.info("insert the string to evaluate");
			if (scanner.hasNextLine()){
				String word=scanner.nextLine();
				int index =findFirstUnique(word);

				if (index!=-1) {
					LOGGER.info("the first non repetitive is at " + index);
				}else {
					LOGGER.info("Not found");
				}
			}


		}catch(java.util.InputMismatchException e){
			LOGGER.error("Invalid input" + e);
		}

		Client client = new Client.ClientBuilder("Client Name", "Client last Name").age(21).build();

		Seller seller = new Seller.SellerBuilder(10000, "Rod").build();
	}

}
