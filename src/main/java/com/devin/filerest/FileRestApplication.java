package com.devin.filerest;

import com.devin.filerest.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FileRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileRestApplication.class, args);
    }

}

