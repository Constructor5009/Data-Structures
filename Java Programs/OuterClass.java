public class OuterClass {
   static class Nested_Demo {
      public void my_method() {
         System.out.println("This is my nested class");
      }
   }
   
   public static void main(String args[]) {
      OuterClass.Nested_Demo nested = new OuterClass.Nested_Demo();	 
      nested.my_method();
   }
}
