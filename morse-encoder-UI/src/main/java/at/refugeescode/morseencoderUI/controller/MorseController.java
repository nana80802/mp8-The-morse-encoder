package at.refugeescode.morseencoderUI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MorseController {

    private Encoder encoder;

    public MorseController(Encoder encoder) {
        this.encoder = encoder;
    }

    private String message;

    @ModelAttribute("ciphrttext")
    String ciphrttext() {
        return encoder.encode(message);
    }

    @ModelAttribute("text")
     Text text(){
     return new Text();
    }

    @GetMapping
    String page() {
        return "home";
    }

    @PostMapping
    String postPlainText(Text text){
        message= text.getText();
        return "redirect:/";

    }
}
