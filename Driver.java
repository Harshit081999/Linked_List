public class Driver
{
    public static void main(String[] args)
    {
        Linked_List obj = new Linked_List();


       obj.add_node(23);
       obj.add_node(76);
       obj.add_node(76);
       obj.add_node(6);
       obj.add_node(243);
       //obj.reverse();
      // obj.last_node_to_start();
        //obj.pairwise_swap();
        //obj.remove_duplicate_sort();
        //obj.insert_at_position(3,2);
        //obj.insert_at_start(11);
        //obj.del_key(24);
        //obj.remove_duplicate_unsorted();

        obj.display();
        /*int result = obj.nth_node(4);
        if (result==0) {
            System.out.println("Searched node is not present");
        }
        else {
            System.out.println("Searched node is " + " " + result );
        }
        obj.middle();
        boolean res = obj.detect_loop();
        if (res)
        {
            System.out.println("There is a loop");
        }
        else
        {
            System.out.println("No loop");
        }*/
    }
}
