package com.dgw.project.service.adapter.in.rest.model;

import com.dgw.project.core.task.model.TaskStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskHistoryDto {
    private Long id;
    private TaskStatus status;
    private LocalDateTime timestamp;
}
