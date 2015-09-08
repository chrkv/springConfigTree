package com.intellij.treeConfigs.anno;

import com.intellij.treeConfigs.anno2.ConfigG;
import com.intellij.treeConfigs.model.Child;
import com.intellij.treeConfigs.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigG.G1.class, ConfigG.G2.class})
public class ConfigE {
    @Autowired
    public Child childA;

    @Autowired
    public Child childD;

    @Bean
    public Parent parentE1() {
        return new Parent(childA);
    }


}
