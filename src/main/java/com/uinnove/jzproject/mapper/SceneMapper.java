package com.uinnove.jzproject.mapper;

import com.uinnove.jzproject.domain.dto.Scene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SceneMapper extends JpaRepository<Scene,String> {
}
