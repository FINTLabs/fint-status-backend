package no.fint.java.fintstatusservicebackend;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TjenesteService {

    private TjenesteRepository tjenesteRepository;

    private Map<String, List<Tjeneste>> tjenesteMap = new HashMap<>();

    public TjenesteService(TjenesteRepository tjenesteRepository) {

    }


}
