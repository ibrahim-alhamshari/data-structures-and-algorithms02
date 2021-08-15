package codeChallenge12;

public class ValidateBrackets {

    public boolean bracketsCheck(String value){
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        char current, previous;
        for (int i = 0 ; i<value.length() ; i++){
            current = value.charAt(i);
            if(current == '(' || current=='[' || current=='{'){
                stack.push(current);
            }else if(current==')'|| current==']'|| current=='}'){
                if(stack.isEmpty()){
                    result=false;
                    System.out.println(result);
                    return result;
                }else {
                    previous= stack.peek();
                    if((current==')' && previous=='(') || (current==']' && previous=='[') ||(current=='}' && previous=='{')){
                        stack.pop();
                        result=true;
                    }else {
                        result =false;
                    }

                }
            }
            if (!stack.isEmpty()){
                result = false;
            }
        }
        System.out.println(result);
        return result;
    }
}
