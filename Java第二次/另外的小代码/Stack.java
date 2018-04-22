package Stack;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {
     static int e,x,y=1;
    int[] data;
    int maxSize;
    int top;
    public Stack(int maxSize){   //在执行构造方法是创建栈
        this.maxSize=maxSize;
        data=new int[maxSize];
        top=-1;
    }
    public boolean push(int data){    //入栈方法,并判断是否入栈成功
        if(top+1==maxSize){
            System.out.println("栈满！");
            return false;
        }
        else{
            this.data[++top]=data;
            return true;

        }
    }
    public boolean pop(){   //出栈方法,并将出栈值赋给e
        if(top==-1){
            System.out.println("栈空，无法出战！");
            return false;
        }
        else {
            this.e=this.data[top];
            top--;
            return true;

        }
    }

    public static void main(String[] args){
        Stack stack = new Stack(100);
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入入栈元素：");
             x = input.nextInt();
            stack.push(x);
            System.out.println("是否继续入栈：1 继续;0 结束");
            y=input.nextInt();
            if(y==0){
                break;
            }


        }
        System.out.print("全部出栈：");
        while (stack.top>=0){
            stack.pop();
            System.out.print(Stack.e+"   ");
        }
    }

}
