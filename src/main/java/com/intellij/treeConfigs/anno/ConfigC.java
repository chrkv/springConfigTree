package com.intellij.treeConfigs.anno;

import com.intellij.treeConfigs.model.Child;
import com.intellij.treeConfigs.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:META-INF/q*a.xml"})
public class ConfigC {
    @Autowired
    public Child childA;

    @Autowired
    public Child childD;

    @Autowired
    public Child childG;

    @Bean
    public Parent parentC1() {
        return new Parent(childA);
    }

    @Bean
    public Parent parentC2() {
        return new Parent(childD);
    }

    @Bean
    public Parent parentC3() {
        return new Parent(childG);
    }

    @Bean
    public Child childC() {
        return new Child("childC");
    }
}
