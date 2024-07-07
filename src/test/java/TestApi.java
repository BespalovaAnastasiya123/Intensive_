import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class TestApi {
    @Test(priority = 1)
    public void checkStatus200() {
        RestAssured.given()
                .spec(Specification.requestSpec())
                .get("/get")
                .then()
                .spec(Specification.responseSpec());
    }

    @Test(priority = 2)
    public void checkGetBody(){
        RestAssured.given()
                .spec(Specification.requestSpec())
                .get("get?foo1=bar1&foo2=bar2")
                .then()
                .spec(Specification.responseSpec())
                .assertThat()
                .body("args.foo1", Matchers.is("bar1"))
                .body("args.foo2", Matchers.is("bar2"))
                .body("headers.x-forwarded-proto", Matchers.is("https"))
                .body("headers.host", Matchers.is("postman-echo.com"))
                .body("headers.accept", Matchers.is("*/*"))
                .body("headers.accept-encoding",Matchers.is("gzip,deflate"))
                //.body("headers.userArgent", Matchers.is("someUserArgent"))
                .body("headers.x-forwarded-port",Matchers.is("443"))
                .body("headers.x-amzn-trace-id",Matchers.is("someId"))
                .body("url", Matchers.is("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));

    }
}

