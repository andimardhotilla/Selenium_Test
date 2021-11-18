package API.tugas5;

import static io.restassured.RestAssured.given; 
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITestNo5 {
		
	@Test
	public void tesDaftar() {
		Faker faker = new Faker();
		String surel = faker.name().username() + "@gmail.com";
		System.out.println(surel);
		
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		String body = "{\"user\":{\"first_name\": \"acs\", \"email\": \"rm@gmail.com\","
				+ "\"phone_number\": \"+62-89635845902\", \"currency\": \"YEN\", \"password\": \"nananana88\"}}";
		String daftarPayload = body.replace("$.rm@gmail.com", surel);
		Response response = RestAssured.given().contentType("application/json").body(daftarPayload)
				.when().post("/users");
		assertEquals(response.getStatusCode(),200);
	}


}
