package com.dgw.project.service.adapter.in.rest.model;

import com.dgw.project.core.project.model.ChangeProjectDescriptionCommand;

public record ChangeProjectDescriptionPayload(
        String newDescription
) {

    public ChangeProjectDescriptionCommand toCommand(String projectId) {
        return new ChangeProjectDescriptionCommand(projectId, newDescription());
    }

}
