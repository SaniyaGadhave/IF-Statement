interface first
{
 void mtd1();
}
interface second
{
 void mtd2();
}
class Inherit implements first,second
{
 public void mtd1()
{
 System.out.println("This is the first interface class");
}
 public void mtd2()
{
 System.out.println("This is the second interface class");
}
 public static void main(String args[])
{
 Inherit a1=new Inherit();
 a1.mtd1();
 a1.mtd2();
}
}