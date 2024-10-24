package no.fint.java.fintstatusservicebackend;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Repository
public class TjenesteRepository {

    private List<Tjeneste> tjenesteCache = new ArrayList<>();

    @PostConstruct
    private void fillCache() {
        ObjectMapper mapper = new ObjectMapper();

        try{
            List<PrometheusData> tjenesteDataList = mapper.readValue(
                    new File("/Users/sander/IdeaProjects/fint-status-service-backend/src/main/java/no/fint/java/fintstatusservicebackend/data/dummyData.json"),
                    new TypeReference<>(){});

            List<Tjeneste> list = tjenesteDataList.stream().map(this::fromPrometheusDataToTjenesteMapper).toList();
            tjenesteCache.addAll(list);

        } catch (Exception e){
            log.error(e.getMessage());
        }
    }

    public List<Tjeneste> getTjenesteCache() {
        return tjenesteCache;
    }

    private Tjeneste fromPrometheusDataToTjenesteMapper(PrometheusData prometheusData) {
       return Tjeneste
                .builder()
                .name(prometheusData.getLabelAppKubernetesIoName())
                .orgId(prometheusData.getLabelFintlabsNoOrgId())
                .status(true)
                .sistSjekket(new Timestamp(new Date().getTime()))
                .build();
    }




}
