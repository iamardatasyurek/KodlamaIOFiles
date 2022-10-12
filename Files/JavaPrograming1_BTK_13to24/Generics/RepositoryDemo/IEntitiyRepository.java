package Generics.RepositoryDemo;

public interface IEntitiyRepository<T extends IEntity> {
    void add(T t);

    void delete(T t);

    void update(T t);
}
