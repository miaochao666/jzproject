package com.uinnove.jzproject.service;

import com.uinnove.jzproject.domain.entity.Model;

import java.util.List;

public interface ModelService {

    List<Model> modelList(Integer sceneId);
}
