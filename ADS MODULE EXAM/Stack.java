class TwoStacks{
	
	 int arr[];
	 int size;
	int index1;
	 int index2;
	
	public TwoStacks(int size){
		this.size = size;
		arr = new int[size];
		index1 = -1;
		index2 = size;
       }
	   
	  public void push1(int element){
	  if(isFull()){
		  System.out.println("TwoStacks is full");
		  return;
	  }
	  arr[++index1]=element;
      }
	  public void push2(int element){
		  if(isFull()){
			  System.out.println("TwoStacks is full");
			  return;
		  }
		  arr[--index2]=element;
	  }
	  public int pop1(){
		  if(isEmpty1())
		  {System.out.println("Stack is empty");
	      }
		  int element=arr[index1];
		  System.out.println("Popped element from stack1 is "+element);
		  index1--;
		  return element;
	  }
	  public int pop2(){
		   if(isEmpty2())
		  {System.out.println("Stack is empty");
	      }
		  int element=arr[index2];
		  System.out.println("Popped element from stack1 is "+element);
		  index2++;
		  return element;
	  }
	  public boolean isEmpty1(){
		  if(index1 == -1){
			  return true;
		  }
		  return false;
	}
	public boolean isFull(){
		if(index1 == index2){
			return true;
		}
		return false;
	}
	public boolean isEmpty2(){
		  if(index2 == size){
			  return true;
		  }
		  return false;
	}
	  
} 
class Stack{
	public static void main(String args[]){
		
		TwoStacks stack = new TwoStacks(6);
		stack.push1(5);
		stack.push2(10);
		stack.push2(15);
		stack.push1(11);
		stack.push2(7);
		stack.push2(40);
		
		stack.pop1();
		stack.pop2();
		
	}
}