package com.example.test.ceti;

import java.util.HashMap;

/**
 * @author yd
 * @date 2021/2/20 14:23
 */
public class LRU<K,V> {

    private int currentSize;
    private int capcity;
    private HashMap<K,Node> caches;

    private Node first;
    private Node last;

    public LRU(int size){
        currentSize=0;
        this.capcity=size;
        caches=new HashMap<K,Node>(size);
    }

    public void put(K key,V value){
        Node node =caches.get(key);

        if (node==null){

            if(caches.size()>=capcity){
                caches.remove(last.key);
                removetLast();
            }
            node=new Node(key,value);
        }
            node.value=value;
            moveToHead(node);
            caches.put(key,node);
    }

    private void moveToHead(Node node) {

    }

    private void removetLast() {
    }

    public Object get(K key){
        Node node=caches.get(key);
        if (node==null){
            return null;
        }
        moveToHead(node);
        return node.value;
    }
}
