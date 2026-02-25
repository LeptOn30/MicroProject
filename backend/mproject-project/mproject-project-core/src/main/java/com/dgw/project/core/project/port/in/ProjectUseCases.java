package com.dgw.project.core.project.port.in;

import com.dgw.project.core.project.model.*;

import java.util.List;

public interface ProjectUseCases {
    Project createProject(CreateProjectCommand command);

    List<Project> getAllProjects();

    Project getProjectById(String projectId);

    Project changeProjectName(ChangeProjectNameCommand command);

    Project changeProjectDescription(ChangeProjectDescriptionCommand command);

    void archiveProject(DeleteProjectCommand command);

    Project changeProjectMembers(ChangeProjectMembersCommand command);

    Project addTaskToProject(AddTaskToProjectCommand command);

    Project removeTaskFromProject(RemoveTaskCommand command);

    List<Project> getProjectsByOwnerEmail(String ownerEmail);
}
