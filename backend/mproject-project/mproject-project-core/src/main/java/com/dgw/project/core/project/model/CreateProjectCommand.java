package com.dgw.project.core.project.model;

public record CreateProjectCommand(String name, String description, String ownerEmail) {
}
