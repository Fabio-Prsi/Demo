package it.scuola.demo;

import java.util.Map;
import java.util.OptionalDouble;
import java.util.random.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  HelloController {

    @GetMapping("/api/hello")
    public Map<String, Object> hello() {
        return Map.of(
                "message", "Hello dalla API Spring!",
                "ok", true
        );
    }
    @GetMapping("/api/goodmorning")
    public Map<String, Object> goodmorning() {
        return hello();
        
    }

    OptionalDouble numero(){

        return RandomGenerator.of("L64X128MixRandom").doubles().average();
    }

    @GetMapping("/api/chico")
    public Map<String, Object> chico() {
    
        String str = "hola chico,te gusta la mañana? " + numero().toString();
        return Map.of(
                "message",str,
                "ok", true
                
        );
    }
}
