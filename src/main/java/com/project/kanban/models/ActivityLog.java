package com.project.kanban.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ActivityLog {
    private String id;
    private Board board;
    private User user;
    private String action;
    private LocalDateTime  createAt;
}
