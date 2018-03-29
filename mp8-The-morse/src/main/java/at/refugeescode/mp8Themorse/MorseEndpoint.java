package at.refugeescode.mp8Themorse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.io.SequenceInputStream;
import java.util.*;

@RestController
@RequestMapping ("/morse")
public class MorseEndpoint {
    @PostMapping
    void get(){
        List<String> letter = new ArrayList<>();
        List<String> symbol = new ArrayList<>();
        letter.add("a");
        letter.add("b");
        letter.add("c");

        symbol.add("1");
        symbol.add("2");
        symbol.add("3");

        Map<String,String> map= new HashMap<>();
        map.put(letter.get(0),symbol.get(0));

        for (String s:letter) {
            map.put(s,symbol.get(letter.indexOf(s)));
        }

        String val = map.get("a");


    }

}
