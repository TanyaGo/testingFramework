package com.lazerycode.selenium.apiTests;

import com.lazerycode.selenium.files.payLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
    public static void main(String[] arg) {
        //TODO Auto-generated method stub

        JsonPath js = new JsonPath(payLoad.CoursePrice());
        //Print number of courses returned by API

        int count = js.getInt("courses.size()");
        System.out.println((count));

        //Print Purchase Amount
        int totalAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(totalAmount);

        //Print the title of the first course
        String titleFirstCourse = js.get("courses[2].title");
        System.out.println(titleFirstCourse);

        //Print All course titles and their respective prices
        for (int i = 0; i < count; i++) {
            String courseTitles = js.get("courses[" + i + "].title");
            System.out.println(js.get("courses[" + i + "].price").toString());
            System.out.println(courseTitles);
        }
        //Print number of copies sold by RPA Course

        for (int i = 0; i < count; i++) {
            String courseTitles = js.get("courses[" + i + "].title");
            if(courseTitles.equalsIgnoreCase("RPA")){
                //copies sold
                int copies = js.get("courses["+i+"].copies");
                System.out.println("Print number of copies sold by RPA Course: " + copies);
                break;
            }
        }
    }
}
