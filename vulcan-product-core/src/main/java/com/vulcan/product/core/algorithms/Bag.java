/*
package com.vulcan.product.core.algorithms;

import java.util.Iterator;

*/
/**
 * 2018/2/1
 * 使用java实现bag
 * @author: likaisheng
 *//*


public class Bag<Item> implements Iterable<Item> {
    private Node<Item> first;   // beginning of bag
    private int n;  // number of elements in bag

    // Helper linked list class
    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }
    // Initializes an empty bag
    public Bag(){
        first = null;
        n = 0;
    }

    */
/**
     * Returns true if this bag is empty
     * @return {@code true} if this bag is empty
     *          {@code false} otherwise
     *//*

    public boolean isEmpty(){
        return  first == null;
    }

    */
/**
     * Adds the item to this bag
     * @param item the item to add to this bag
     *//*

    public void add(Item item){
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    */
/**
     * Returns an iterator that iterates over the items in this bag in arbitrary order
     * @return an iterator that iterates over the items in this bag in arbitrary order
     *//*

    public Iterator<Item> iterator(){
        return new ListIterator<Item>(first);
    }
    // An iterator,doesn't implements removef() since it's optional
    private class ListIterator<Item> implements Iterator<Item>{
        private Node<Item> current;
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }

}
*/
