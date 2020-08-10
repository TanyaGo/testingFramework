package com.lazerycode.selenium.apiTests;

import com.lazerycode.selenium.files.payLoad;
import com.lazerycode.selenium.files.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AddAndDeleteEndToEnd {

    Properties prop = new Properties();
    @BeforeTest
    public  void getData() throws IOException {

        FileInputStream file = new FileInputStream("/Users/tshcherbyna/git/Selenium-Maven-Template/src/test/java/com/lazerycode/selenium/files/env.properties");
        prop.load(file);
       // prop.get("HOST");
    }

    @Test
    public void AddAndDeletePlace(){

        //Task 1 - Grab the response
        RestAssured.baseURI = prop.getProperty("HOST");
        Response res=given().log().all().
                queryParam("key", prop.getProperty("KEY")).
                body(payLoad.getPostData()).
                when().
                post(resources.placePostData()).
                then().log().all().
                assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status", equalTo("OK")).
                extract().response();

        //Grab Place Id from response
        String responseString=res.asString();
        System.out.println(responseString);
        JsonPath js = new JsonPath(responseString);
        String placeid= js.get("place_id");
        System.out.println(placeid);

        //Place this place id in the delete request
        given().
                queryParam("key","qaclick123").
                body("{" +
                        "\"place_id\": \""+placeid+"\""+
                        "}").
                when().
                post("/maps/api/place/delete/json").
                then().log().all().
                assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status", equalTo("OK"));
    }
}
