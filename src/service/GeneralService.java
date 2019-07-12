package service;

public interface GeneralService <T> {
    T[] showList();

    int size();

    void add(int index, T element);


    T edit(int index);

    T delete(int index);

    int findName(String elementName);

    void sort();

}
