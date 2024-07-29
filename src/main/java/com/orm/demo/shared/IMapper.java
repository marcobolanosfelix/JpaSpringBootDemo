package com.orm.demo.shared;

import java.util.List;

public interface IMapper<M, E> {
    List<M> toModelList(List<E> entities);
    M toModel(E entity);
    E toEntity(M model);
}
