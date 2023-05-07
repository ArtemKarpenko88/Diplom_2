import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class OrderClient extends SpecificationConstructor{
    private final static String ORDERS = "orders";

    @Step("Create Order")
    public Response orderCreate(Order order, String token){
        return (Response) given()
                .spec(getBaseSpecSettings())
                .headers("Authorization", token)
                .body(order)
                .when()
                .post(ORDERS)
                .then()
                .extract();
    }
    @Step("Getting a list of orders")
    public Response getOrderList(String token) {
        return (Response) given()
                .spec(getBaseSpecSettings())
                .header("authorization", token)
                .when()
                .get(ORDERS)
                .then()
                .extract();
    }
}
