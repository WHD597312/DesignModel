package com.ph.datastructure;

public class Test {

    public static void main(String[] args){
        Item item1=new Item("王艳",28);
        Item item2=new Item("王海霞",23);
        SingleLinkedList list=new SingleLinkedList();
        list.addNode(item1);
        list.addNode(new Item("王海东",25));
        list.addNode(item2);
        list.addNode(new Item("王海峰",21));

        Node node = list.findNode(item2);
        Item item=node.item;
        System.out.println(item);

        list.deleteNode(node);
    }
}
