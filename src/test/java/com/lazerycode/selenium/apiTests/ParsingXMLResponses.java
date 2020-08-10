package com.lazerycode.selenium.apiTests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ParsingXMLResponses {
    @Test
    public void posDataTest() throws IOException {
        String postdata= GenerateStringFromResource("/Users/tshcherbyna/Documents/postdata.xml");
        RestAssured.baseURI = "http://216.10.245.166";
        given().
                queryParam("key","qaclick123").
                body(postdata).
                when().post("/maps/api/place/add/xml").
                then().
                assertThat().statusCode(200).and().contentType(ContentType.XML).and().
                body("status", equalTo("OK"));
    }
    public static String GenerateStringFromResource(String path) throws IOException {
        return new String (Files.readAllBytes(Paths.get(path)));}
}
