interface a
{
  public void display();
}

interface x
{
  public void getData();
 }


interface c extends a,x
{
  public void dis();
}

public class B  implements c
{
  public void display()
  {
     System.out.println("Hi This is display () of interface a");
  }
  public void dis()
  {
    System.out.println("Hi This is dis() method of interface c");
  }

  public void getData()
  {

  }


    public static void main(String arg[])
    {
      B obj=new B();

      obj.display();
      obj.dis();
      //obj.getData();
    }
}
