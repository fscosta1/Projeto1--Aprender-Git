package dev.java10x.DockerAula.Javax10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Controller {

    @GetMapping
    public String mensagem() {
        return "Essa é uma aplicação DOCKER";
    }
}
