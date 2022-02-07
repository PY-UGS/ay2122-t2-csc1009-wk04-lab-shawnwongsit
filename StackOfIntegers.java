public class StackOfIntegers {

    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public boolean empty(){
        
        if(this.size == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public int peek(){
        return this.elements[this.size-1];
    }

    public void push(int value){
        this.elements[this.size] = value;
        this.size++;
        
    }

    public int pop(){
        int temp = this.elements[this.size-1];
        this.elements[this.size-1] = 0;
        this.size--;
        return temp;
    }

    public int getSize(){
        return this.size;
    }

    public void getElements(){
        for (int i = 0; i < this.elements.length; i++){
            System.out.println(this.elements[i]);
        }
    }


    
}
