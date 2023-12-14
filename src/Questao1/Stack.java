package Questao1;

import java.util.EmptyStackException;

public interface Stack<E> {
    int size();
    boolean isEmpty();
    void push(E element) throws FullStackException;
    E top() throws EmptyStackException;
    E pop() throws EmptyStackException;
}

