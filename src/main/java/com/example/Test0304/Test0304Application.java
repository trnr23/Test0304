package com.example.Test0304;

import java.io.IOException;

import com.example.Test0304.Model.Item;
import com.example.Test0304.Service.ItemServiceImp;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test0304Application {

	public static void main(String[] args) {
		SpringApplication.run(Test0304Application.class, args);

		GetString example = new GetString();

		String url3 = "https://lb.api-sandbox.openprocurement.org/api/2.4/contracts/800384f02be04ce091277202897de676/documents";

		//Получаем строку по http
		String jsonString = new String();
		try {
			String response = example
					.run(url3);
			System.out.println(response);
			jsonString = response;
		}
		catch (IOException e){
			e.printStackTrace();
		}

		//Преобразуем строку в JSON объект
		JSONObject jsonObject = new JSONObject(jsonString);
		JSONArray jsonArray = jsonObject.getJSONArray("data");

		//выводим объекты для проверки
		for (Object object:jsonArray) {
			System.out.println("\nOBJECT: " + object);
		}

		//получаем первый объект из строки
		Item testItem = new Item();
		ObjectMapper objectMapper = new ObjectMapper();

		String str = jsonArray.get(0).toString();
		System.out.println("Str: " + str);
		try {
			testItem = objectMapper.readValue(str, Item.class);

		}catch (Exception e){
			System.out.println("Error while creating object");
			e.fillInStackTrace();
		}

		System.out.println("ID объекта: " + testItem.getId());


		//DB test
		System.out.println("TESTING DB");

		ItemServiceImp itemServiceImp = new ItemServiceImp();
		itemServiceImp.saveItem(testItem);








	}
}
