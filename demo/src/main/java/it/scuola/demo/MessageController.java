package it.scuola.demo;


import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageRepository repo;

    public MessageController(MessageRepository repo) {
        this.repo = repo;
    }

    // GET: leggo tutti i messaggi dal DB
    @GetMapping
    public List<Message> all() {
        return repo.findAll();
    }

    // POST: scrivo un messaggio nel DB
    @PostMapping
    public Message create(@RequestBody Message msg) {
        return repo.save(msg);
    }

    // POST: scrivo un messaggio dal form HTML
    @PostMapping("/post")
    public Message createFromForm(@RequestParam String text) {
        return repo.save(new Message(text));
    }

    // GET: leggo tutti i messaggi dal DB dal form HTML
    @GetMapping("/get")
    public List<Message> getMessages() {
        return repo.findAll();
    }

    @DeleteMapping
    public void deleteAll() {
        repo.deleteAll();
    }
}
