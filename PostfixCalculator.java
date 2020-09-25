public class PostfixCalculator extends ArrayStack{
  private ArrayStack<Integer> numbers = new ArrayStack<Integer>();
public String operators = new String();

//This method works as a postfix calculator.
public int evaluate(String str){
  try{
int total = 0;
int currentMath = 0;
int exp;
if(isValid(str)){
	for(int i = 0; i < operators.length(); i++){
		String math = operators.substring(i, i+1);
		if(numbers.isEmpty()){
			return total;
		} else {
			if(math.equals("*")){
				currentMath = numbers.pop() * numbers.pop();
				total += currentMath;
			} else if(math.equals("+")){
				currentMath = numbers.pop() + numbers.pop();
				total += currentMath;
			} else if(math.equals("-")){
				currentMath = numbers.pop() - numbers.pop();
				total += currentMath;
			} else if(math.equals("/")){
				currentMath = numbers.pop() / numbers.pop();
				total += currentMath;
			} else if(math.equals("^")){
				int x = numbers.pop();
				for(int j = numbers.peekTop(); j>0; j--){
					if(j == numbers.pop()){
						currentMath = x*x;
					}
					exp = x*x;
					currentMath = currentMath + exp;
				}
			}
		}
	}
  return total;
}
  }
  catch(StackException e){
    System.out.println(e);
  }
	return 0;
}
//This checks to make sure that the string being used by the postfix calculator is valid.
public boolean isValid(String str){
char x;
int numb = 0;
int op = 0;
for(int i = 0; i < str.length(); i++){
	x = str.charAt(i);
	String oper = str.substring(i,i+1);
	if(Character.isDigit(x)){
		str = str.substring(1, str.length());
		numbers.push(new Integer(x-48));
		numb++;
	} else if(Character.isWhitespace(x)){
		str = str.substring(1, str.length());
	} else if(isOperator(oper)){
		operators = operators + oper;
		str = str.substring(1, str.length());
		op++;
	} else {
		return false;
	}
	}
	if(numb == (op + 1)){
		return true;
	}
	return false;
}
//This checks a string to see if it is any specific operator.
public boolean isOperator(String str){
	if(str.equals("*")){
		return true;
	} else if(str.equals("/")){
		return true;
	} else if(str.equals("-")){
		return true;
	} else if(str.equals("+")){
		return true;
	} else if(str.equals("^")){
		return true;
	} else {
		return false;
	}
}

}
