package com.dgw.project.core.report.model;

import com.dgw.project.core.project.model.ProjectOwner;
import com.dgw.project.core.task.model.Task;

import java.util.List;

public record ProjectSummary(
        String projectName,
        String projectDescription,
        ProjectOwner owner,
        List<Task> tasks
) {

}
