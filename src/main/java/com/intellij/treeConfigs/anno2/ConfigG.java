package com.intellij.treeConfigs.anno2;

import com.intellij.treeConfigs.anno4.StrangeCompScan;
import com.intellij.treeConfigs.model.Child;
import com.intellij.treeConfigs.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

public class ConfigG {
    @Configuration
//    @EnableCaching
    @EnableScheduling
    @Import(StrangeCompScan.class)
    public static class G1 {
        @Autowired
        public Child childF;
        @Autowired
        public Child childC;

        @Bean
        public Parent parentG() {
            return new Parent(childF);
        }

        @Bean
        public Parent parentG2() {
            return new Parent(childC);
        }

        @Bean
        public Child childG() {
            return new Child("childG");
        }
    }

    @Configuration
    @EnableMBeanExport
    @ComponentScan(value = {"com.intellij.**.anno3", "com.intellij.treeConfigs.anno"})
    public static class G2 {
        @Bean
        public Child childG3() {
            return new Child("childG3");
        }
    }

    @Bean
    public Child childG_nonExistent() {
        return new Child("childG_nonExistent");
    }
}
