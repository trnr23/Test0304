package com.example.Test0304;

import java.io.IOException;

 import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test0304Application {

	public static void main(String[] args) {
		SpringApplication.run(Test0304Application.class, args);

		GetString example = new GetString();

		//Получаем строку по http
		String JSONstring = new String();
		try {
			String response = example
					.run("https://lb.api-sandbox.openprocurement.org/api/2.4/contracts/800384f02be04ce091277202897de676/documents");
			System.out.println(response);
			JSONstring = response;
		}
		catch (IOException e){
			e.printStackTrace();
		}

		//Преобразуем строку в JSON объект
		JSONObject jsonObject = new JSONObject(JSONstring);
		JSONArray jsonArray = jsonObject.getJSONArray("data");

		//выводим объекты для проверки
		for (Object object:jsonArray) {
			System.out.println("\nOBJECT: " + object);
		}
	}
}
