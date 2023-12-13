package weekFourteen;

public class Main {
    public static void main(String[] args) {
        MyStack test = new MyStack();
        test.push(10);
        test.push(5);
        test.push(37);
        test.push(29);
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.isEmpty());
        System.out.println(test.pop());
        System.out.println(test.isEmpty());
    }
}

//a queue would be better in a lot of things, since
//first in, first out is useful in many things like
//lines or something like dates on produce

//the order of elements are completely flipped
//between queues and stacks because stacks put
//in an element and it's the first to come back out
//but queues added elements are the last to go
//LIFO (stack) vs FIFO (queue)
