package com.example.Test0304;

import java.io.IOException;

 import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.server.Session;

@SpringBootApplication
public class Test0304Application {

	public static void main(String[] args) {
		SpringApplication.run(Test0304Application.class, args);

		GetString example = new GetString();

		String JSONstring = new String();
		try {
			String response = example
					.run("https://lb.api-sandbox.openprocurement.org/api/2.4/contracts/800384f02be04ce091277202897de676/documents");
			System.out.println(response);
			JSONstring = response.toString();
		}
		catch (IOException e){
			e.printStackTrace();
		}


		JSONObject jsnobject = new JSONObject(JSONstring);
		JSONArray jsonArray = jsnobject.getJSONArray("data");

//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject explrObject = jsonArray.getJSONObject(i);
//		}


		for (Object object:jsonArray
			 ) {
			System.out.println("\nOBJECT: " + object);
			
		}



//		System.out.println("Connecting to DB...");
//		ServerConnect serverConnect = new ServerConnect();
//		serverConnect.Connect();

		ObjectMapper objectMapper = new ObjectMapper();

		//convert json string to object
		Employee emp = objectMapper.readValue(jsonData, Employee.class);


	}
}
