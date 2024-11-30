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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;
    @Column(name = "title")
    private String title;
    @Column(name = "description", length = 1000)
    private String description;
    @Column(name = "due_date")
    private LocalDate dueDate;
    @ManyToOne
    @JoinColumn(name = "stage_id", nullable = false)
    private Stage stage;
    @Column(name = "position")
    private int position;
    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createAt;
    @UpdateTimestamp
    @Column(name = "update_at")
    private LocalDateTime updateAt;
}
