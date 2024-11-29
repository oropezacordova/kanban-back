package com.project.kanban.models;

import lombok.Data;

@Data
public class CardLabel {
    private String id;
    private Card card;
    private Label label;
}
