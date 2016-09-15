package com.intellij.treeConfigs.model;

public class GreatParent extends Parent {

    public final Parent subParent;

    public GreatParent(Parent subParent) {
        super(null);
        this.subParent = subParent;
    }

    @Override
    public String toString() {
        return "GreatParent{" +
                "subParent=" + subParent +
                '}';
    }
}
