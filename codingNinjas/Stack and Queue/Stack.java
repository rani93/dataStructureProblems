public class Stack {
    static class Stack {
        private int top =-1;
        private int size = top+1;
        private int [] stack;

        
        Stack(int capacity) {
            // Write your code here.
            this.stack = new int[capacity];
        }
        public void push(int num) {
            // Write your code here.
            if(top == stack.length-1){
                return;
            }
            top++;            
            stack[top] = num;
        }
        public int pop() {
            // Write your code here.
            if(top== -1){
                return -1;
            }
            int element = stack[top];
            top--;
            return element;

        }
        public int top() {
            // Write your code here.
            if(top ==-1){
                return -1;
            }
                return stack[top];
        }
        public int isEmpty() {
            // Write your code here.
            if(top ==-1){
                return 1;
            }
            else{
                return 0;
            }
        }
        public int isFull() {
            // Write your code here.
            if(top == stack.length -1){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
