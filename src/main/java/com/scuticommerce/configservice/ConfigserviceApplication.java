package com.scuticommerce.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigserviceApplication {

    public static void main(String[] args) {
        System.setProperty("archaius.configurationSource.additionalUrls",
                "file:////inovations/configproperties/config.properties");
        SpringApplication.run(ConfigserviceApplication.class, args);
    }

   /* @Bean
    public AbstractConfiguration addApplicationPropertiesSource() {
        PolledConfigurationSource source = new URLConfigurationSource(
                "file:////projects/configservice/src/test/resources/config.properties");
        return new DynamicConfiguration(source, new FixedDelayPollingScheduler());
    }*/

}
