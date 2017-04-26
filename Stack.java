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
class Stack{
   int MAX_SIZE;
   int top;
   int [] num;

   //constructor
   public Stack(){
      MAX_SIZE = 10;
      num = new int[10];
      top = -1;
   }
   //adds item into stack
   public void push(int item){
      if(top == MAX_SIZE-1){
         System.out.print("\nStack is full.");
      }
      else{
         top++;
         num[top] = item;
         System.out.print("\nItem: " +num[top]+ ". Push process completed.");
      }
   }
   //removes last added item
   public void pop(){
      if(isEmpty()) {
         System.out.print("\nStack is empty");
      }
      else{
         int temp = num[top];
         top--;
         System.out.print("\nTop number was: "+temp);
      }
   }
   //looks at the item on top
   public void peek(){
      System.out.print("\nTop item is: " +num[top]);
   }
   //checks if stack is empty
   public boolean isEmpty(){
      return top == -1;
   }
   //looks for a particular item starting from the top of the stack and then prints index.
   public void search(int item){
      for(int i = top; i >= 0; i--){
         if(num[i] == item){
            System.out.print("\nItem found at index: " + i);
            return;
         }
      }
      System.out.print("\nItem not found.");
      return;
   }
}