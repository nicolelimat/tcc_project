package com.example.projeto_tcc.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
public class MethodElement extends AbstractElement{

    private String name;

    @ManyToOne
    private Activity parentActivity;

    @Override
    public boolean optional() {
        return false;
    }

    public MethodElement() {
    }

    public MethodElement(String name) {
        this.name = name;
    }

    public MethodElement(Long id, Integer index, ModelInfo modelInfo, ProcessType type, Long id1, String name) {
        super(id, index, modelInfo, type);
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Activity getParentActivity() {
        return parentActivity;
    }

    public void setParentActivity(Activity parentActivity) {
        this.parentActivity = parentActivity;
    }
}
