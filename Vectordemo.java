import java.util.*;
public class Vectordemo
{
 public static void main(String args[])
{
 Vector v=new Vector();
  v.add(10);
  v.add(20);
  v.add(30);
  v.add(40);
  v.add(50);
  System.out.println(v);
  System.out.println(v.size());
 System.out.println(v.removeElement(40));
  System.out.println(v);

 Vector v1=new Vector(v);
  System.out.println(v1);
  System.out.println(v1.size()); 
  System.out.println(v1.removeElement(10));
 Vector v2=new Vector(v1);
  System.out.println(v2);
}
}


  
