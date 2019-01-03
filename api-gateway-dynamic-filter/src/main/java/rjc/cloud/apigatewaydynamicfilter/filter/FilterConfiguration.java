package rjc.cloud.apigatewaydynamicfilter.filter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {
    private String root;
    private Integer interval;
}
