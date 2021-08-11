package de.basf.office;

public interface YastAnOtherComparator<T> {

    boolean eq(T other);
    boolean lt(T other);
    default boolean ne(T other){
        return ! eq(other);
    }

    default boolean le(T other) {
        return eq(other) || lt(other);
    }
}
