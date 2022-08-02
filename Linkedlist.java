import java.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.insertFirst(val:68);
        list.insertFirst(val:13);
        list.insertFirst(val:90);
        list.insertFirst(val:45);
        list.insertFirst(val:34);
    }
}


public class Linkedlist
{
    private Node head;
    private Node tail;
    private int size;
    public Linkedlist()
    {
        this.size=0;
    }

    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next = head;
        head=node;

        if(tail==null)
        {
            tail=head;
        }
        size +=1;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value +"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node
    {
        private int value;
        private int next;
    }

    public Node(int value)
    {
        this.value=value;
    }

    public Node(int value, Node next)
    {
        this.value=value;
        this.next=next;
    }
}
