import java.util.Vector;

public class OurGroup {

   private Vector<String> groupMembers;
   public OurGroup()
   {
     groupMembers = new Vector<String>();
     groupMembers.add("Stan Smith");
     groupMembers.add("Peter Griffin");
     groupMembers.add("Luara");
   }
   public Vector<String> getGroupMembers() {
     return groupMembers;
   }
}