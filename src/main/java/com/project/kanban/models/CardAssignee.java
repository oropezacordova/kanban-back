package com.project.kanban.models;

import lombok.Data;

@Data
public class CardAssignee {
    private String id;
    private Card card;
    private User user;
}
