

public class ll {
    public Node head;
    public Node tail;
    public int size;
    public ll(){
        this.size=0;
    }

    public class Node{
        public int value;
        public Node next;

        public Node(int value)
    {
        this.value =value;
    }

      public Node(int value,Node next){
             this.value =value;
             this.next=next;                                     
      }
}
    
    

    public static void main (String[] args){
        ll list =new ll();
       // list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
      list.addMiddle(69,3);
        list.addLast(12);
       // System.err.println(list.deleteFirst());
        list.display();
        //System.err.println(list.deleteLast());
        //list.display();
        list.find(69);
      // System.err.println(list.delete(2));
        //list.display();

    } 

    public Node find(int value)
{
    Node newNode = head;
    while (newNode != null){
        if(newNode.value == value){
            return newNode;
        }
        newNode = newNode.next;
    }
    return null;
}
      public int deleteFirst(){
        int val = head.value;
        head =head.next;
        if(head == null){
            tail =null;
        }
        size--;
        return val;
        }
     
         public int deleteLast(){
           if(size <=1){
                return deleteFirst();
           }  
        Node secondlast = get(size-1);
        int val = tail.value;
        tail = secondlast;
        tail.next =null;
        size--;
        return val;
    
    }

       public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
      return val;   
    }
       
   public Node get (int index)
{
    Node newNode = head;
    for(int i =0;i<index;i++){
        newNode =newNode.next;
    }
    return newNode;
}


public void add(int val){
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;

    if(tail== null){
        tail = head;
    }
    size+=1;
}

/*add */
public void addLast(int val){
    if(tail == null){
        add(val);
        return;
    }
    Node newNode = new Node(val);
    tail.next =newNode;
    tail =newNode;
    size++;
}


/* insert in middle */

public void addMiddle(int val,int index)
{
    if(index==0)
    {
        add(val);
        return;
    }
    if(index==size){
        addLast(val);
        return;

    }
    Node temp =head;
    for(int i =1;i<index; i++){
        temp = temp.next;
    }
    Node newNode = new Node(val,temp.next);
    temp.next =newNode;
    size++;
}

/*display linkedlist */
public void display(){

    Node temp =head;
    while(temp!=null){
        System.err.print(temp.value+"->");
        temp=temp.next;
    
    }

    System.out.println("END");
}

}