interface interf1
{
  public void display();   // abstract method by default
}

interface interf2 
{
  public void getdata();     // abstract method by default
}

class A
{
  // nothing inside class A. We are doing dummy inheritance of class A
}

public class MultiInterface  extends A implements interf1, interf2
{
  public void display()
  {
     System.out.println("Hi This is my first inetrface program");
  }
  
  public void getdata()
  {
     System.out.println("Hi This is my getdata method");
  }
  
  public static void main(String arg[])
  {
      MultiInterface obj = new MultiInterface();
      obj.display();
      obj.getdata();
  }
  
}
