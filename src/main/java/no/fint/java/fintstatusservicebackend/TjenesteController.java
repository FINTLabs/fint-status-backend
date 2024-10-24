package no.fint.java.fintstatusservicebackend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class TjenesteController {

    private final TjenesteRepository tjenesteRepository;

    public TjenesteController(TjenesteRepository tjenesteRepository) {
        this.tjenesteRepository = tjenesteRepository;
    }

    @GetMapping
    public ResponseEntity<List<Tjeneste>> getStatus() {
        return ResponseEntity.ok(tjenesteRepository.getTjenesteCache());
    }
}
