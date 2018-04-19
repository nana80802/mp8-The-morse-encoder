package at.refugeescode.mp8Theencoder.endpoint;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class encoderEndPointTest {

    @Autowired
    private EncoderEndPoint encoderEndPoint;
    @MockBean
    private TestRestTemplate restTemplate;

    @org.junit.jupiter.api.Test
    void getMessage() {


    }
}