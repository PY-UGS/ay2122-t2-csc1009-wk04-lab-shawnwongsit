public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        /*
        stack.push(0);
        stack.push(15);
        stack.push(20);

        stack.getElements();
        System.out.println(stack.peek());
        System.out.println("Ive popped" + stack.pop());
        stack.getElements();
        System.out.println(stack.getSize());
        */
        for (int i = 0; i < 10; i++){
            stack.push(i);
        }

        /*
        System.out.println("The top is: " + stack.peek());
        System.out.println("The size is: " + stack.getSize());
        System.out.println("Issit empty? " + stack.empty());
        */

        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
