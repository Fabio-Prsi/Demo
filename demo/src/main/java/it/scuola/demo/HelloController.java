package it.scuola.demo;

import java.util.Map;
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
        return Map.of(
                "message", "GoodMorning dalla API Spring!",
                "ok", true
        );
    }
}
