public class Linkedlist {
    Element head;
    
    public Element search(int key) {
        //the search element takes in an int and key and sees if ____ has them
        Element x = head;
        while(x != null && x.getkey() != key) {
            x = x.getnext();
            //while the key isnt the key set the key to the key.
        }
        return x;

    }
    public void insert(Element a) {
    //creating the insert element to insert elements into the list.
        a.setnext(head);
        //the next element after the element given becomes the head
        if(head != null) {
            head.setprev(a);
        }
        head = a;
        a.setprev(null);
    }
    public void delete(Element a) {
        //code to remove elements from the list
        if(a.getprev() != null) {
            a.getprev().setnext(a.getnext());
            //set prev value to next value once deleted.
        }
        else {
            head = a.getnext();
            //if prev is null then set a to next
            //assuming head is at start of list
        }
        if(a.getnext() != null) {
            a.getnext().setprev(a.getprev());
            //set element value after deleted element to the previous value, its moving down the list.
        }
    }
}