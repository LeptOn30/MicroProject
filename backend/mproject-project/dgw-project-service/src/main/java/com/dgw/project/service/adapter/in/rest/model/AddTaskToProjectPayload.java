package com.dgw.project.service.adapter.in.rest.model;

import com.dgw.project.core.project.model.AddTaskToProjectCommand;
import com.dgw.project.core.project.model.ProjectMember;
import com.dgw.project.core.task.model.TaskOwner;

public record AddTaskToProjectPayload(
        String title,
        String description,
        String assignedToEmail
) {

    public AddTaskToProjectCommand toCommand(String projectId, String ownerEmail) {
        return new AddTaskToProjectCommand(projectId,
                title(),
                description(),
                new TaskOwner(ownerEmail),
                new ProjectMember(assignedToEmail()));
    }

}
