import java.util.*;
public class aestorids {
    public static void main(String[] args) {
                int[] array={10,2,-5};
                Stack<Integer>stack=new Stack<>();
                for(int i=0;i<array.length;i++){
                    if(array[i]>0){
                        stack.push(array[i]);
                    }
                    else{
                        boolean destroyed=false;
                        while(!stack.isEmpty() && stack.peek() > 0){
                            if(stack.peek()<Math.abs(array[i])){
                                stack.pop();
                            }
                            else if(stack.peek()==Math.abs(array[i])){
                                stack.pop();
                                destroyed=true;
                                break;
                            }
                            else if(stack.peek()>Math.abs(array[i])){
                                destroyed=true;
                                break;
                            }
                        }
                        if(destroyed==false){
                            stack.push(array[i]);
                        }
                    }
                }
                System.out.print(stack);
    }
}
