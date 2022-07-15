package com.API.restAssuredAutomation;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;

import static org.testng.Assert.*;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class reqresApi {

    @Test
    public void testGet() {
        baseURI = "https://reqres.in/api";
        Response response = get("/users?page=2");

        given() .get("/users?page=2").
                then().statusCode(200).
                body("data[4].last_name", equalTo("Edwards")).
                body("data.last_name", hasItems("Ferguson", "Funke"));
    }


    @Test
    public void testPost2() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Esusu");
        jsonObject.put("job", "QA");

        baseURI = "https://reqres.in/api";///users

        System.out.println(given().
                body(jsonObject.toJSONString()).
                when().
                post("/users").
                then().
                log().all().
                contentType(ContentType.JSON).
                statusCode(201));

    }


}
