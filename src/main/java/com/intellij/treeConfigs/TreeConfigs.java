package com.intellij.treeConfigs;

import com.intellij.treeConfigs.anno2.ConfigG;
import com.intellij.treeConfigs.model.Child;
import com.intellij.treeConfigs.model.Parent;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TreeConfigs {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
      				new ClassPathXmlApplicationContext("META-INF/main.xml"
//                    );
                            ,"META-INF/a.xml", "META-INF/b.xml");

        Child childA = context.getBean("childA", Child.class);
        Child childB = context.getBean("childB", Child.class);
        Child childC = context.getBean("childC", Child.class);
        Child childD = context.getBean("childD", Child.class);
        Child childG = context.getBean("childG", Child.class);
        Child childF = context.getBean("childF", Child.class);
        Parent parentA = context.getBean("parentA", Parent.class);
        Parent parentB = context.getBean("parentB", Parent.class);
        Parent parentC1 = context.getBean("parentC1", Parent.class);
        Parent parentC2 = context.getBean("parentC2", Parent.class);
        Parent parentC3 = context.getBean("parentC3", Parent.class);
        Parent parentD1 = context.getBean("parentD1", Parent.class);
        Parent parentD2 = context.getBean("parentD2", Parent.class);
        Parent parentE1 = context.getBean("parentE1", Parent.class);
        Parent parentF = context.getBean("parentF", Parent.class);
        Parent parentG = context.getBean("parentG", Parent.class);
        Parent parentG2 = context.getBean("parentG2", Parent.class);
        Parent greatParentA = context.getBean("greatParentA", Parent.class);
        Parent greatParentA2 = context.getBean("greatParentA2", Parent.class);
        Parent greatParentB1 = context.getBean("greatParentB1", Parent.class);
        Parent greatParentD1 = context.getBean("greatParentD1", Parent.class);
        Parent greatParentD2 = context.getBean("greatParentD2", Parent.class);

        try {
            Child childG_nonExistent = context.getBean("childG_nonExistent", Child.class);
            System.out.println(childG_nonExistent);
            throw new IllegalStateException();
        } catch (NoSuchBeanDefinitionException e) {

        }

        try {
            Child childG_nonExistent = context.getBean("childD_2", Child.class);
            System.out.println(childG_nonExistent);
//            throw new IllegalStateException();
        } catch (NoSuchBeanDefinitionException e) {

        }


        System.out.println(childA);
        System.out.println(childB);
        System.out.println(childC);
        System.out.println(childD);
        System.out.println(childF);
        System.out.println(childG);
        System.out.println(parentA);
        System.out.println(parentB);
        System.out.println(parentC1);
        System.out.println(parentC2);
        System.out.println(parentC3);
        System.out.println(parentD1);
        System.out.println(parentD2);
        System.out.println(parentE1);
        System.out.println(parentF);
        System.out.println(parentG);
        System.out.println(parentG2);
        System.out.println(greatParentA);
        System.out.println(greatParentA2);
        System.out.println(greatParentB1);
        System.out.println(greatParentD1);
        System.out.println(greatParentD2);

        ConfigG.G1 g1 = new ConfigG.G1();
    }

}
