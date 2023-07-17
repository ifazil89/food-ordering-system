package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public class BaseId<T> {

    private final T id;

    public BaseId(T id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseId<?> baseId = (BaseId<?>) o;
        return id.equals(baseId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
