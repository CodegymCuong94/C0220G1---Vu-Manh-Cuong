package collections;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private E data;

        public Node(E data){
            this.data = data;
        }

        public E getData(){
            return this.data;
        }
    }

    private Node head;
    public int numNodes = 0;

    public MyLinkedList(){

    }


    public int size(){
        return this.numNodes;
    }

    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public void add(int index , E e){
        Node temp = head;
        Node holder;

        for (int i = 0 ; i< index -1 && temp.next != null ; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }



    public E remove(int index){
        if(index < 0 || index > numNodes){
            throw new IllegalArgumentException("Error index : " + index);
        }else {
            Node temp = head;
            E data;
            if(index == 0){
                data = temp.data;
                head = head.next;
                numNodes--;
            }else {
                for (int i = 0 ; i< index -1 && temp.next != null ; i++){
                    temp = temp.next;
                }
                data = temp.next.data;
                temp.next = temp.next.next;
                numNodes--;
            }
            return (E) data;

        }

    }


    public boolean remove(E e){
        if(head.data.equals(e)){
            remove(0);
            return true;
        }else {
            Node temp = head;
            while (temp.next != null){
                if(temp.next.data.equals(e)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }
    public MyLinkedList<E> clone(){
        if(numNodes == 0){
            throw new NullPointerException("LinkedList này null");
        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp = head;
        returnLinkedList.addFirst((E)temp.data);
        temp = temp.next;
        while (temp != null){
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean contains(E e){
        Node temp = head;
        for (int i = 0 ; i < numNodes ; i++){
            if(temp.data.equals(e)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public int indexOf(E e){
        Node temp = head;
        for (int i = 0 ; i < numNodes; i ++){
            if(temp.getData().equals(e)){
                return i;
            }
            temp =temp.next;
        }
        return -1;
    }
    public E get(int index){
        Node temp = head;
        for (int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp.data;
    }


    public E getFirst(){
        Node temp = head;
        return temp.data;
    }

    public E getLast(){
        Node temp = head;
        int j = numNodes;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void clear(){
        for (int i = 0 ; i < numNodes ; i++){
            remove(i);
            numNodes--;
        }

    }



}
