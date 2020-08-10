package com.lazerycode.selenium.apiTests;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


import java.lang.reflect.Parameter;

public class APItest {
    @Test
    public  void getMethod(){
    RestAssured.baseURI = "https://maps.googleapis.com";
    given().
         param("location","-33.8670522,151.1957362").
         param("radius", "1500").
         param("key","AIzaSyB6aoc03sXI4AYT-IGuq4KfsB3gK98gB00" );
         when().
                 get("/maps/api/place/nearbysearch/json").
          then().
                 assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                 //body("results[0].geometry.location.lat", equalTo("-33.8688197"));
                 body("results[1].name", equalTo("ibis Sydney Darling Harbour")).and().
                 body("results[0].scope", equalTo("GOOGLE")).and().
                 header("Server", "scaffolding on HTTPServer2");
}
    @Test
    public void slrResponse(){
        RestAssured.baseURI= "http://kraken-qa-21.sofitest.com:9067/slrservicing";
        given().
                when().get("errorTester/notFoundException").
                then().
                assertThat().statusCode(404).and().body("status", equalTo(404)).and().
                body("message", equalTo("Not Found")).and().
                body("debugMessage", equalTo("nothing was found"));

    }

    @Test
    public void posDataTest(){
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().
                queryParam("key","qaclick123").header("Content-Type", "application/json").
                body("{\n" +
                        "\n" +
                        "    \"location\":{\n" +
                        "\n" +
                        "        \"lat\" : -38.383494,\n" +
                        "\n" +
                        "        \"lng\" : 33.427362\n" +
                        "\n" +
                        "    },\n" +
                        "\n" +
                        "    \"accuracy\":50,\n" +
                        "\n" +
                        "    \"name\":\"Frontline house\",\n" +
                        "\n" +
                        "    \"phone_number\":\"(+91) 983 893 3937\",\n" +
                        "\n" +
                        "    \"address\" : \"29, side layout, cohen 09\",\n" +
                        "\n" +
                        "    \"types\": [\"shoe park\",\"shop\"],\n" +
                        "\n" +
                        "    \"website\" : \"http://google.com\",\n" +
                        "\n" +
                        "    \"language\" : \"French-IN\"\n" +
                        "\n" +
                        "}").
                when().post("/maps/api/place/add/json").
                then().log().all().
                assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("scope", equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)");
    }
    //Create a place = response (place_id)
    //delete Place = (Request - place_did)


}