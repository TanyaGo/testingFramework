package com.lazerycode.selenium.apiTests;

import com.lazerycode.selenium.files.ReUsableMethods;
import com.lazerycode.selenium.files.payLoad;
import com.lazerycode.selenium.files.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AddAndUpdateEndToEnd {

    Properties prop = new Properties();
    @BeforeTest
    public  void getData() throws IOException {

        FileInputStream file = new FileInputStream("/Users/tshcherbyna/git/Selenium-Maven-Template/src/test/java/com/lazerycode/selenium/files/env.properties");
        prop.load(file);
        // prop.get("HOST");
    }
    @Test
    public void AddAndUpdatePlace(){

        //Task 1 - Grab the response
        RestAssured.baseURI = prop.getProperty("HOST");
        String response=given().log().all().
                queryParam("key", prop.getProperty("KEY")).header("Content-Type", "application/json").
                body(payLoad.getPostData()).
                when().
                post(resources.placePostData()).
                then().log().all().
                assertThat().statusCode(200).
                body("scope", equalTo("APP")).
                header("server", "Apache/2.4.18 (Ubuntu)").
                extract().response().asString();
        System.out.println(response);

        //Grab Place Id from response
        JsonPath js = new JsonPath(response); //for parsing Json
        String placeId= js.get("place_id");
        System.out.println(placeId);

        //Update place
        String newAddress = "Summer Walk, Africa";
        given().log().all().
                queryParam("key","qaclick123").header("Content-Type", "application/json").
                body("{\n" +
                        "\"place_id\":\""+placeId+"\",\n" +
                        "\"address\":\"70 Summer walk, USA\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}\n").
//                body("{" +
//                        "\"place_id\": \""+placeId+"\""+
//                        "\"address\": \"70 Summer walk, USA\""+
//                        "\"key\": \"qaclick123\""+
//                        "}").
                when().
                put("/maps/api/place/update/json").
                then().log().all().
                assertThat().statusCode(200).
                body("msg", equalTo("Address successfully updated"));

        //Get place
        String getPlaceResponse= given().log().all().
                queryParam("key","qaclick123").
                queryParam("place_id", placeId).
                when().get("maps/api/place/get/json").
                then().assertThat().log().all().statusCode(200).extract().response().asString();

        //JsonPath js1= new JsonPath(getPlaceResponse);
        JsonPath js1= ReUsableMethods.rawToJson(getPlaceResponse);
        String actualAddresss = js1.getString("address");
        System.out.println(actualAddresss);
        Assert.assertEquals(actualAddresss, "");
    }
}
