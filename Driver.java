/*
Jemma Tiongson
Section #16031
App: Driver.java (Stack App)
Purpose: Demonstrate Stack
-------------------------------------------------------------------------

Terminal:
   Compile: javac Driver.java Stack.java
   Run: java Driver
_________________________________________________________________________
*/
class Driver{
   public static void main (String [] args){
      Stack stack = new Stack();
      System.out.print("\nStack empty? " +stack.isEmpty());
      System.out.print("\n______________________");
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      stack.push(6);
      stack.push(7);
      stack.push(8);
      stack.push(9);
      stack.push(10);
      stack.push(11);
      stack.push(12);
      stack.push(13);
      System.out.print("\n______________________");
      stack.search(0);
      stack.search(6);
      stack.search(13);
      System.out.print("\n______________________");
      stack.pop();
      stack.peek();
      System.out.print("\nStack empty? " +stack.isEmpty());
      System.out.print("\n______________________");
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
   }
}