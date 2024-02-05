package e2e;

import com.devlab.models.Login;
import com.devlab.utils.jsonreader.JsonReader;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

public class TestJsonReader {
    @Test
    public void test(){
      Login login = JsonReader.getObject(Login.class,"TID1");

        System.out.println(login);
    }
}
