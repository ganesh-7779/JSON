/********************************************
 * Purpose : Implementation Of JSON 
 * And learning About How to read JSON file
 * And How Create JSON Object And JSON Array
 * @author Ganesh Gavhad
 * @version 1.0;
 *********************************************/
package com.bridgelabz;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryManegement {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser jsonparser = new JSONParser();

		FileReader reader = new FileReader(".\\jsonfile\\inventory.json");  //File reader to read JSON File

		Object obj = jsonparser.parse(reader); //Parse Method to pass the data into object.

		JSONObject inventoryObj = (JSONObject) obj; // converted into JSON Object

		JSONArray arrayRice = (JSONArray) inventoryObj.get("Rice");  // Array object of JSON File
		JSONArray arrayPulses = (JSONArray) inventoryObj.get("Pulses");
		JSONArray arrayWheat = (JSONArray) inventoryObj.get("Wheat");

		for (int i = 0; i < arrayRice.size(); i++) {
			
			JSONObject rice = (JSONObject) arrayRice.get(i);

			String type = (String) rice.get("Type");
			String name = (String) rice.get("Name");
			double weight = (double) rice.get("WeightInKg");
			double price = (double) rice.get("Price");

			System.out.println("Type   : " + type);
			System.out.println("Name   : " + name);
			System.out.println("Weight : " + weight);
			System.out.println("Price  : " + price);

			double value = weight * price;
			System.out.printf("Total Inventory Value : %.2f ", value);
			System.out.println();
			System.out.println();

		}
	
		for (int i = 0; i < arrayPulses.size(); i++) {
			
			JSONObject pulses = (JSONObject) arrayPulses.get(i);

			String type = (String) pulses.get("Type");
			String name = (String) pulses.get("Name");
			double weight = (double) pulses.get("WeightInKg");
			double price = (double) pulses.get("Price");

			System.out.println("Type   : " + type);
			System.out.println("Name   : " + name);
			System.out.println("Weight : " + weight);
			System.out.println("Price  : " + price);

			double value = weight * price;
			System.out.printf("Total Inventory Value : %.2f ", value);
			System.out.println();
			System.out.println();

		}
		
		for (int i = 0; i < arrayWheat.size(); i++) {
			
			JSONObject wheat = (JSONObject) arrayWheat.get(i);

			String type = (String) wheat.get("Type");
			String name = (String) wheat.get("Name");
			double weight = (double) wheat.get("WeightInKg");
			double price = (double) wheat.get("Price");

			System.out.println("Type   : " + type);
			System.out.println("Name   : " + name);
			System.out.println("Weight : " + weight);
			System.out.println("Price  : " + price);

			double value = weight * price;
			System.out.printf("Total Inventory Value : %.2f ", value);
			System.out.println();
			System.out.println();

		}
	}

}
