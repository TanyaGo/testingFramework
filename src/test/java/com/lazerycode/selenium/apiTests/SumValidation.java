package com.lazerycode.selenium.apiTests;

import com.lazerycode.selenium.files.payLoad;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class SumValidation {
    @Test
    public void sumOfCourses(){
        JsonPath js = new JsonPath(payLoad.CoursePrice());
        int count = js.getInt("courses.size()");
        for (int i = 0; i < count; i++) {
            int price = js.getInt("courses["+i+"].price");










        }
    }
}
