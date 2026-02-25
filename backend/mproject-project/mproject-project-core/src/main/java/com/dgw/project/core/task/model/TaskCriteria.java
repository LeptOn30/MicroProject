package com.dgw.project.core.task.model;

import java.time.LocalDateTime;

public record TaskCriteria(String projectId, TaskStatus status, LocalDateTime from, LocalDateTime to) {

}
