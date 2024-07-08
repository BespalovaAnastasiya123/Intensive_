import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class TestApi {

    @Test(priority = 1)
    public void checkGetBody() {
        RestAssured.given()
                .spec(Specification.requestSpec())
                .get("get?foo1=bar1&foo2=bar2")
                .then().log().all()
                .assertThat()
                .body("args.foo1", Matchers.is("bar1"))
                .body("args.foo2", Matchers.is("bar2"))
                .body("headers.x-forwarded-proto", Matchers.is("https"))
                .body("headers.host", Matchers.is("postman-echo.com"))
                .body("headers.accept", Matchers.is("*/*"))
                .body("headers.accept-encoding", Matchers.is("gzip,deflate"))
                .body("headers.user-agent", Matchers.is("Apache-HttpClient/4.5.14 (Java/17.0.9)"))
                .body("headers.x-forwarded-port", Matchers.is("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("url", Matchers.is("https://postman-echo.com/get?foo1=bar1&foo2=bar2"))
                .spec(Specification.responseSpec());
    }

    @Test(priority = 2)
    public void checkPostBodyRawText() {
        Map<String, String> testValue = new HashMap<>();
        testValue.put("test", "value");
        RestAssured.given()
                .spec(Specification.requestSpec())
                .body(testValue)
                .post("/post")
                .then().log().all()
                .assertThat()
                .body("args", notNullValue())
                .body("data.test", Matchers.is("value"))
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("headers.host", Matchers.is("postman-echo.com"))
                .body("headers.content-length", Matchers.is("16"))
                .body("headers.x-forwarded-proto", Matchers.is("https"))
                .body("headers.x-forwarded-port", Matchers.is("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", Matchers.is("application/json"))
                .body("headers.user-agent", Matchers.is("Apache-HttpClient/4.5.14 (Java/17.0.9)"))
                .body("headers.accept", Matchers.is("*/*"))
                .body("headers.accept-encoding", Matchers.is("gzip,deflate"))
                .body("json.test", Matchers.is("value"))
                .body("url", Matchers.is("https://postman-echo.com/post"))
                .spec(Specification.responseSpec());
    }

    @Test(priority = 3)
    public void checkPostBodyFormData() {
        Map<String, String> testValue = new HashMap<>();
        testValue.put("foo1", "bar1");
        testValue.put("foo2", "bar2");
        RestAssured.given()
                .spec(Specification.requestSpec())
                .body(testValue)
                .post("/post")
                .then().log().all()
                .assertThat()
                .body("args", notNullValue())
                .body("data.foo1", Matchers.is("bar1"))
                .body("data.foo2", Matchers.is("bar2"))
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("headers.host", Matchers.is("postman-echo.com"))
                .body("headers.content-length", Matchers.is("29"))
                .body("headers.x-forwarded-proto", Matchers.is("https"))
                .body("headers.x-forwarded-port", Matchers.is("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", Matchers.is("application/json"))
                .body("headers.user-agent", Matchers.is("Apache-HttpClient/4.5.14 (Java/17.0.9)"))
                .body("headers.accept", Matchers.is("*/*"))
                .body("headers.accept-encoding", Matchers.is("gzip,deflate"))
                .body("json.foo1", Matchers.is("bar1"))
                .body("json.foo2", Matchers.is("bar2"))
                .body("url", Matchers.is("https://postman-echo.com/post"))
                .spec(Specification.responseSpec());
    }

    @Test(priority = 4)
    public void checkPutBody() {
        String text = "This is expected to be sent back as part of response body.";
        RestAssured.given()
                .spec(Specification.requestSpec())
                .body(text)
                .put("/put")
                .then().log().all()
                .assertThat()
                .body("args", notNullValue())
                .body("data", Matchers.is(text))
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("headers.host", Matchers.is("postman-echo.com"))
                .body("headers.content-length", Matchers.is("58"))
                .body("headers.x-forwarded-proto", Matchers.is("https"))
                .body("headers.x-forwarded-port", Matchers.is("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", Matchers.is("application/json"))
                .body("headers.user-agent", Matchers.is("Apache-HttpClient/4.5.14 (Java/17.0.9)"))
                .body("headers.accept", Matchers.is("*/*"))
                .body("headers.accept-encoding", Matchers.is("gzip,deflate"))
                .body("json", nullValue())
                .body("url", Matchers.is("https://postman-echo.com/put"))
                .spec(Specification.responseSpec());
    }

    @Test(priority = 5)
    public void checkPatchBody() {
        String text = "This is expected to be sent back as part of response body.";
        RestAssured.given()
                .spec(Specification.requestSpec())
                .body(text)
                .patch("/patch")
                .then().log().all()
                .assertThat()
                .body("args", notNullValue())
                .body("data", Matchers.is(text))
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("headers.host", Matchers.is("postman-echo.com"))
                .body("headers.content-length", Matchers.is("58"))
                .body("headers.x-forwarded-proto", Matchers.is("https"))
                .body("headers.x-forwarded-port", Matchers.is("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", Matchers.is("application/json"))
                .body("headers.user-agent", Matchers.is("Apache-HttpClient/4.5.14 (Java/17.0.9)"))
                .body("headers.accept", Matchers.is("*/*"))
                .body("headers.accept-encoding", Matchers.is("gzip,deflate"))
                .body("json", nullValue())
                .body("url", Matchers.is("https://postman-echo.com/patch"))
                .spec(Specification.responseSpec());
    }

    @Test(priority = 6)
    public void checkDeleteBody() {
        String text = "This is expected to be sent back as part of response body.";
        RestAssured.given()
                .spec(Specification.requestSpec())
                .body(text)
                .delete("/delete")
                .then().log().all()
                .assertThat()
                .body("args", notNullValue())
                .body("data", Matchers.is(text))
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("headers.host", Matchers.is("postman-echo.com"))
                .body("headers.content-length", Matchers.is("58"))
                .body("headers.x-forwarded-proto", Matchers.is("https"))
                .body("headers.x-forwarded-port", Matchers.is("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", Matchers.is("application/json"))
                .body("headers.user-agent", Matchers.is("Apache-HttpClient/4.5.14 (Java/17.0.9)"))
                .body("headers.accept", Matchers.is("*/*"))
                .body("headers.accept-encoding", Matchers.is("gzip,deflate"))
                .body("json", nullValue())
                .body("url", Matchers.is("https://postman-echo.com/delete"))
                .spec(Specification.responseSpec());
    }
}

