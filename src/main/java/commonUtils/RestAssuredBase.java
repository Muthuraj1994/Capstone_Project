package commonUtils;

import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class RestAssuredBase {

Response response=null;
    public void get_Flights(){
        baseURI="https://flights.booking.com";
        basePath="/api/search/min-price/";
        RequestSpecification requestSpecification=given().relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .queryParam("type","ONEWAY")
                .queryParam("adults",1)
                .queryParam("cabinClass","ECONOMY")
                .queryParam("from","MAA.AIRPORT")
                .queryParam("to","DEL.AIRPORT")
                .queryParam("fromCountry","IN")
                .queryParam("toCountry","IN")
                .queryParam("fromLocationName","Chennai+International+Airport")
                .queryParam("toLocationName","Delhi+International+Airport")
                .queryParam("depart","2023-06-15")
                .queryParam("sort","BEST")
                .log().all();
       response= requestSpecification.when().get().then().log().all()
                .statusCode(200).extract().response();
    }

    public void validateResponse(){
        JsonPath jsonPath=new JsonPath(response.asString());
        List<Map<String,Object>> list =jsonPath.getList(".");
        Assert.assertNotEquals(list.size(),0);
    }

    public void validateStatusCode(){
        response.then().statusCode(200);
    }
}
