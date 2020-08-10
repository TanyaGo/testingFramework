package com.lazerycode.selenium.files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {

    public static JsonPath rawToJson(String responce){
        JsonPath js1= new JsonPath(responce);
        return js1;
    }
}
