package Stack.lesson3;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(7);
        stack.push(14);
        stack.push(21);
        stack.push(28);
        stack.push(35);
        stack.push(42);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        Expression expression = new Expression("(5+2) - []");
//        System.out.println(expression.checkBracket());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.insert(3);
        queue.insert(13);
        queue.insert(23);
        queue.insert(33);
        queue.insert(43);
        queue.insert(53);

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue);



        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
        mpq.insert(6);
        mpq.insert(16);
        mpq.insert(2);
        mpq.insert(3);
        mpq.insert(7);
        mpq.insert(5);
        mpq.insert(9);
        System.out.println(mpq);

        System.out.println(mpq.remove());
        System.out.println(mpq.remove());
        System.out.println(mpq.remove());
        System.out.println(mpq.remove());
        System.out.println(mpq);

        StringBuilder sb = new StringBuilder("qwerty");
        System.out.println(sb.reverse());

    }
}
