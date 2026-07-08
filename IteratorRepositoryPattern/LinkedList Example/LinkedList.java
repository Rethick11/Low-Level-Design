



interface Iterator<T> {
    public boolean hasNext();
    public T next();

}



interface Iterable {
    public Iterator getIterator();
}




public class LinkedList implements Iterable {

    private Node head , tail;
    static class Node <T> {
        Node next;
        T data;
        Node(T data){
            this.data = data;
        }
    }

    public void add(int i){
        Node newNode = new Node<>(i);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }


    class Iter implements Iterator<Integer>{

        Node curr;
        Iter(){
            this.curr = head;
        }
        @Override
        public boolean hasNext() {
            if (curr != null){
                return true;
            }
            return false;
        }

        @Override
        public Integer next() {
            int data = (int) curr.data;
            curr = curr.next;
            return (int)data;
        }
    }


    @Override
    public  Iterator<Integer> getIterator (){

        return new Iter();
    }

}





//LinkedList implements iterator

// list = new Likedlist()
//list.add(1)
//list.add(2)

//iterator it = list.getIterator();


