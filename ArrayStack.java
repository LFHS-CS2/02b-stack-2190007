/**
 * @author Jonathon Snellback
 */
public class ArrayStack<E> implements Stack<E>
{
	Object[] stack = new Object[100];
	    public boolean isEmpty(){
				for(int i = 0; i < stack.length; i++){
					if(stack[i] != null)
					return false;
				}
				return true;
			}
			    public E peekTop() throws StackException{
            if(isEmpty()){
							throw new StackException();
						}
						for(int i = stack.length - 1; i>= 0; i--){
							if(stack[i]!= null){
								return (E)stack[i];
							}
						}
						return null;
          }
				   public E pop() throws StackException{
						 E value;

						 if(isEmpty()){
							 throw new StackException();
						 }
						 for(int i = stack.length; i >= 0; i--){
							 if(stack[i] != null){
								value = stack[i];
                stack[i] = null;
                break;
							 }
						 }
          
						 return value;
           }
					 
          public void push (E ob){
          int index = -1;

						for(int i = 0; i < stack.length; i++){
							if(stack[i] = null){
								index = i;
							}
						}
            if(index = -1){
							 Object [] newStack = new Object[stack.length*2];
               for(int i = 0; i<stack.length; i++){
                newStack[i] = stack[i];
            }
            newStack[stack.length] = ob;
            stack = newStack;
						}
            else {
             stack[index] = ob;

          	}
}   
  
