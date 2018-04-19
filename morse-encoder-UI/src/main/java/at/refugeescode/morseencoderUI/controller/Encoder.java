package at.refugeescode.morseencoderUI.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Encoder {
    private RestTemplate restTemplate;

    @Value("${encoder.url}")
    private String encoderUrl;

    public Encoder(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String encode(String message){
        if (message==null) {
            return "";
        }
        return restTemplate.postForObject(encoderUrl,message, String.class);

    }


}
