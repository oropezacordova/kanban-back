package com.project.kanban.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String name;
    private Board board;
    @Column
    private int position;
    @CreationTimestamp
    @Column
    private LocalDateTime createAt;
    @UpdateTimestamp
    @Column
    private LocalDateTime updateAt;
}
