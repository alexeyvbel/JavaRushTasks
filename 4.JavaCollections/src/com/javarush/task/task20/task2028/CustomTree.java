package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    private final Entry<String> root;

    public CustomTree(Entry<String> root) {
        this.root = root;
    }

    @Override
    public String get(int index) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element){
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean add(String element){

        if (root.availableToAddLeftChildren){
            add(indexOf(root),element);
        } else {

        }
        return true;
    }

    @Override
    public String remove(int index) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex){
        throw  new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return 0;
    }

    public String getParent(String s) {

        return null;
    }

    static class Entry<T> implements Serializable{
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        void checkChildren() {
            if (leftChild != null)
                availableToAddLeftChildren = false;
            if (rightChild != null)
                availableToAddRightChildren = false;
        }

        boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }

    }
}
