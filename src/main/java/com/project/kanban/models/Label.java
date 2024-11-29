package com.project.kanban.models;

import lombok.Data;

@Data
public class Label {
    private String id;
    private String name;
    private String color;
    private Board board;
}
