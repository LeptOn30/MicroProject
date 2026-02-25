package com.dgw.project.service.adapter.out.persistence.task;

import com.dgw.project.core.task.model.TaskStatus;

public enum TaskStatusEntity {
    TODO,
    IN_PROGRESS,
    DONE;

    public static TaskStatusEntity from(TaskStatus status) {
        return switch (status) {
            case TODO -> TODO;
            case IN_PROGRESS -> IN_PROGRESS;
            case DONE -> DONE;
        };
    }

    public TaskStatus toDomain() {
        return switch (this) {
            case TODO -> TaskStatus.TODO;
            case IN_PROGRESS -> TaskStatus.IN_PROGRESS;
            case DONE -> TaskStatus.DONE;
        };
    }
}
