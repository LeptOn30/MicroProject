package com.dgw.project.service.adapter.in.rest.model;

import com.dgw.project.core.project.model.ChangeProjectNameCommand;

public record ChangeProjectNamePayload(
        String newName
) {

    public ChangeProjectNameCommand toCommand(String projectId) {
        return new ChangeProjectNameCommand(projectId, newName());
    }
}
