public class StackOfIntegers {

    private int[] elements;
    private int size;
    //private int top = -1;

    public StackOfIntegers() {
        this.size = 16;
        this.elements = new int[this.size];
        for (int i = 0; i < this.size; i++){
            this.elements[i] = -10;
        }
    }

    public StackOfIntegers(int capacity) {
        this.size = capacity;
        this.elements = new int[capacity];
        for (int i = 0; i < this.size; i++){
            this.elements[i] = -10;
        }
    }

    public boolean empty(){
        /*for (int i = 0; i < this.size; i++){
            if(this.elements[i] != -10){
                return false;
            }else{
                return true;
            }
        }
        return false;*/
        if(this.elements[0] != -10){
            return false;
        }else{
            return true;
        }
    }
    
    public int peek(){
        //return this.elements[this.top];
        int top = -1;
        for (int i = 0; i < this.size; i++){
            if(this.elements[i] != -10){
                top = this.elements[i];
            }
        }
        return top;
    }

    public void push(int value){
        //this.top++;
        //this.elements[top] = value;
        for (int i = 0; i < this.size; i++){
            if(this.elements[i] == -10){
                this.elements[i] = value;
                break;
            }
        }
        
    }

    public int pop(){
        //int temp = this.elements[top];
        //this.elements[top] = 0;
        //return temp;
        int top = -1;
        for (int i = 0; i < this.size; i++){
            if(this.elements[i] != -10){
                top = i;
            }
        }
        int temp = this.elements[top];
        this.elements[top] = -10;
        return temp;
    }

    public int getSize(){
        /*
        int count = 0;
        for (int i = 0; i < this.top; i++){
            count++;
        }
        return count;
        */
        int count = 0;
        for (int i = 0; i < this.size; i++){
            if(this.elements[i] != -10){
                count++;
            }
        }
        return count;
    }

    public void getElements(){
        for (int i = 0; i < this.elements.length; i++){
            System.out.println(this.elements[i]);
        }
    }

    
}
