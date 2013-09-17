import java.util.Iterator;

public class ShowOurGroup {

   private static void main (String[] args) {
       OurGroup us;
       us = new OurGroup();
       Iterator itr = us.getGroupMembers().iterator();
       while (itr.hasNext()) {
          System.out.println(itr.next());
       }
   }
}