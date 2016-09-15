package com.intellij.treeConfigs.model;

public class Parent {
    public final Child child;

    public Parent(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "child=" + child +
                '}';
    }
}
