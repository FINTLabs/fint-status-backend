package no.fint.java.fintstatusservicebackend;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
public class Tjeneste {
    private String name;
    private boolean status;
    private Timestamp sistSjekket;
    private String orgId;
}
