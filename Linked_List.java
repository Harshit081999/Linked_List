public class Linked_List
{
    public Object node;

    static class node
    {
        int data;
        node next;
        public node(int data)
        {
            this.data = data;
            this.next = null;
        }


    }
     public node head = null;
     public node tail = null;

     public void add_node(int data)
     {
         node new_node = new node(data);
         if(head == null)
         {
             head = new_node;
             new_node.next = null;
         }
         else
         {
             tail.next = new_node;
         }
         tail = new_node;
     }
     public void display()
     {
         node current = head;
         if(head == null)
         {
             System.out.println("Empty");
         }
         else
             while(current!=null)
         {
             System.out.println(current.data);
             current = current.next;
         }
     }


        public void insert_at_start(int data)
        {
            node new_node = new node(data);
            new_node.next = head;
            head = new_node;
        }
        public void insert_at_position(int data, int pos)
        {
            node current = head;
            for (int i =0;i<pos-1;i++)
            {
                current=current.next;
            }
            node new_node = new node(data);
            new_node.next =current.next;
            current.next=new_node;
        }
        public void insert_at_last (int data)
        {    node current = head;
            while (current!=null&&current.next!=null)
            {
                current=current.next;
            }
            node new_node = new node(data);
            current.next=new_node;
            tail = new_node;
        }
    public void del_pos(int pos)
    {

        if (head==null)
        {
            return;
        }
        node current =head ;
        if (pos==0)
        {
            head=current.next;
        }
        for (int i=0;current!=null&&i<pos-1;i++)
        {
            current=current.next;
        }
        if (current==null||current.next==null)
        {
            return;
        }
        else
        {
            node current1;
            current1=current.next.next;
            current.next=current1;
        }
    }
    public  void del_key(int key)
    {
        node current = head;
        node prev = null;
        if (current.next != null && current.data == key)
        {
            head = current.next;
        }
        while (current.next!=null&&current.data!=key)
        {
            prev = current;
            current=current.next;
        }
        if (current.next==null)
        {
            return;
        }
        prev.next=current.next;


    }
    public int nth_node(int findnode)
    {
        node current = head;
        int count = 0;
       while (current!=null)
       {
            if (findnode == count)
            {
                return current.data;
            }

                count++;
                current = current.next;

        }
       assert false;
       return 0;

    }
    public void middle()
    {
        node slow_ptr = head;
        node fast_ptr = head;
        while (slow_ptr!=null&&fast_ptr!=null)
        {
            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;
        }
        System.out.println("Middele = "+" "+ slow_ptr.data);
    }
    public boolean detect_loop()
    {

        node slow_ptr = head;
        node fast_ptr = head;
        while (slow_ptr!=null&&fast_ptr!=null&&fast_ptr.next!=null)
        {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
            if (slow_ptr==fast_ptr)
            {
                return true;
            }
        }
        return false;

    }
    public void remove_duplicate_sort()
    {
        node current = head;
        node temp = null;
        while (current!=null&&current.next!=null)
        {
            if (current.data==current.next.data)
            {
                temp = current.next;
                current.next=current.next.next;

            }
            current=current.next;

        }

    }
    public void remove_duplicate_unsorted()
    {
        node ptr1 = null, ptr2=null;
        //node temp = null;
        ptr1 = head;
        while (ptr1!=null&&ptr1.next!=null)
        {
            ptr2=ptr1;
            while (ptr2!=null&&ptr2.next!=null)
            {
                if (ptr2.data==ptr2.next.data)
                {
                    //temp=ptr2.next;
                    ptr2.next=ptr2.next.next;
                }
                else
                {
                    ptr2=ptr2.next;
                }
            }
            ptr1=ptr1.next;
        }

    }


    public void pairwise_swap()
    {
        node current = head;
        while (current.next!=null&&current.next.next!=null)
        {
            int temp;
            temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;
            current = current.next;
        }

    }
    public void last_node_to_start()
    {
        node current = head;
        node previous = null;
        if (current==null||current.next==null)
        {
            return;
        }
        while (current.next!=null)
        {
            previous = current;
            current=current.next;
        }
        previous.next = null;
        current.next = head;
        head = current;

    }
    public void reverse()
    {
        node prev = null;
        node current = head;
        node Next = null;
        while (current!=null)
        {
            Next = current.next;
            current.next = prev;
            prev = current;
            current=Next;

        }
        head = prev;


    }



}
