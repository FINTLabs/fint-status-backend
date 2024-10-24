package no.fint.java.fintstatusservicebackend;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrometheusData {

    @JsonProperty("app_kubernetes_io_component")
    private String appKubernetesIoComponent;

    @JsonProperty("app_kubernetes_io_instance")
    private String appKubernetesIoInstance;

    @JsonProperty("app_kubernetes_io_managed_by")
    private String appKubernetesIoManagedBy;

    @JsonProperty("app_kubernetes_io_name")
    private String appKubernetesIoName;

    @JsonProperty("app_kubernetes_io_part_of")
    private String appKubernetesIoPartOf;

    @JsonProperty("app_kubernetes_io_version")
    private String appKubernetesIoVersion;

    @JsonProperty("helm_sh_chart")
    private String helmShChart;

    @JsonProperty("instance")
    private String instance;

    @JsonProperty("job")
    private String job;

    @JsonProperty("kubernetes_name")
    private String kubernetesName;

    @JsonProperty("kubernetes_namespace")
    private String kubernetesNamespace;

    @JsonProperty("kubernetes_node")
    private String kubernetesNode;

    @JsonProperty("label_app")
    private String labelApp;

    @JsonProperty("label_app_kubernetes_io_component")
    private String labelAppKubernetesIoComponent;

    @JsonProperty("label_app_kubernetes_io_instance")
    private String labelAppKubernetesIoInstance;

    @JsonProperty("label_app_kubernetes_io_name")
    private String labelAppKubernetesIoName;

    @JsonProperty("label_app_kubernetes_io_part_of")
    private String labelAppKubernetesIoPartOf;

    @JsonProperty("label_app_kubernetes_io_version")
    private String labelAppKubernetesIoVersion;

    @JsonProperty("label_fintlabs_no_org_id")
    private String labelFintlabsNoOrgId;

    @JsonProperty("label_fintlabs_no_team")
    private String labelFintlabsNoTeam;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("pod")
    private String pod;

    @JsonProperty("release")
    private String release;

    @JsonProperty("uid")
    private String uid;
}
