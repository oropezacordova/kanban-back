package com.project.kanban.repositories;

import com.project.kanban.models.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepository extends JpaRepository<Stage, String> {
}
