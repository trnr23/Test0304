package com.example.Test0304;

import java.io.IOException;

import com.example.Test0304.Model.Item;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

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

		//DB test
		Item testItem = new Item();





	}
}
