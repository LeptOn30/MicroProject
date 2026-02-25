package com.dgw.project.core.project.model;

public record ProjectCriteria(boolean archived, String ownerEmail) {

    public ProjectCriteria(boolean archived) {
        this(archived, null);
    }
}
