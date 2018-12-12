package com.ph.datastructure;

public class SingleLinkedList {
    private int size;//链表节点数量
    private Node headNode;//头节点

    public SingleLinkedList() {
        size=0;
        headNode=null;
    }

    public boolean addNode(Item item){
        Node pnew=null;
        Node preNode=null;
        pnew=new Node(item);
        pnew.next=null;
        if (size==0){
            headNode=pnew;
        }else {
            preNode=headNode;
            while (preNode.next!=null){
                preNode=preNode.next;
            }
            preNode.next=pnew;
        }
        size++;
        return headNode!=null?true:false;
    }


    public boolean deleteNode(Node node){
        Node preNode=headNode;
        boolean success=false;
        if (node==null){
            return false;
        }else {
            if (preNode==null){
                return false;
            }else {
                while (!preNode.item.equals(node.item)){
                    if (preNode.next==null){
                        return false;
                    }else {
                        preNode=preNode.next;
                    }
                }
            }
        }
        if (preNode.equals(headNode)){
            headNode=preNode.next;
            size--;
            success=true;
        }else {
            preNode.next=node.next;
            size--;
            success=true;
        }
        return success;
    }
    public Node findNode(Item item){
        Node scan=headNode;
        if (scan==null){
            return null;
        }else {
            while (!scan.item.equals(item)){
                scan=scan.next;
            }
        }
        return scan;
    }
    boolean isEmpty(){
        return size==0?true:false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
