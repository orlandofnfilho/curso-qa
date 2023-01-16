package services;

import io.restassured.http.ContentType;
import pojo.QaUser;

import static io.restassured.RestAssured.given;

public class QaUserServices extends TestingSupport {

    public  QaUserServices(){
        setURI( "http://agapito-server.herokuapp.com/users");
    }

    public void fillFields(QaUser user, String field, String value) {
        switch (field){
            case "login": user.setLogin(value);break;
            case "full_name": user.setFull_name(value);break;
            case "email": user.setEmail(value);break;
            case "age": user.setAge(Integer.valueOf(value));break;

        }
    }

    public void post(QaUser qaUser) {
        String bodySended =getGson().toJson(qaUser);
        logRequest(bodySended);
        setResponse(given().
                         when().
                             contentType(ContentType.JSON).
                             accept(ContentType.JSON).
                             post(getURI()).
                             then().extract().response()

                );
        logResponse();
    }
}
