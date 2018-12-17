package com.uinnove.jzproject.mapper;


import com.uinnove.jzproject.domain.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelMapper extends JpaRepository<Model,String> {
}
