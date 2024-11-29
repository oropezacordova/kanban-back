package com.project.kanban.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private String id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private LocalDate dueDate;
    @Column
    private Stage stage;
    @Column
    private int position;
    @CreationTimestamp
    @Column
    private LocalDateTime createAt;
    @UpdateTimestamp
    @Column
    private LocalDateTime updateAt;
}
