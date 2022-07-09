import java.util.Scanner;
public class Array
{
 public static void main(String args[])
{
 int len;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Array length:");
 len=sc.nextInt();
 int a[]=new int[len];
 System.out.println("Enter the Element store in an array:");
 for(int i=0;i<len;i++)
 {
 a[i]=sc.nextInt();
}
 System.out.println("Elements in an array are");
 for(int i=0;i<len;i++)
{
 System.out.println(a[i]);
}
}
}
 