package com.orm.demo.shared;

import org.springframework.beans.BeanUtils;

public abstract class Mapper<M, E> {

    /**
     * Convierte entidad en modelo
     */
    public M mapperEntityToModel(E entity, M model) {
        BeanUtils.copyProperties(entity, model);
        return model;
    }

    /**
     * Convierte modelo a entidad
     */
    public E mapperModelToEntity(M model, E entity) {
        BeanUtils.copyProperties(model, entity);
        return entity;
    }

}
