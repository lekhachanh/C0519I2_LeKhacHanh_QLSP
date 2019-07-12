package repository;

public interface GeneralRepository<T> {
    int SIZE = 10;

    T[] showList();

    int size();

    void add(int index, T element);


    T edit(int index);

    T delete(int index);

    int findName(String elementName);

    void sort();

}
