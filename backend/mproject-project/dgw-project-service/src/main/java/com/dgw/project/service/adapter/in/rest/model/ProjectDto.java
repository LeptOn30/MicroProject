package com.dgw.project.service.adapter.in.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.dgw.project.core.project.model.Project;
import com.dgw.project.core.project.model.ProjectMember;
import com.dgw.project.core.project.model.ProjectTask;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ProjectDto(
        String id,
        String name,
        String description,
        String owner, // owner email
        List<String> members, // members emails
        List<TaskDto> tasks,
        LocalDateTime createdAt
) {

    public static List<ProjectDto> toDtoList(List<Project> domains) {
        return CollectionUtils.isEmpty(domains) ? List.of() : domains.stream()
                .map(ProjectDto::from)
                .toList();
    }

    public static ProjectDto from(Project domain) {
        return new ProjectDto(
                domain.id(),
                domain.name(),
                domain.description(),
                domain.owner().userEmail(),
                domain.members().stream().map(ProjectMember::getUserEmail).toList(),
                domain.tasks().stream().map((ProjectTask task) -> TaskDto.from(task, domain.id())).toList(),
                domain.createdAt()
        );
    }
}
