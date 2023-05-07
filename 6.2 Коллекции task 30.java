/*

Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.

Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.

Sample Input:

1 2 3 4 5 6 7
Sample Output:

6 4 2

*/

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deq = new LinkedList<Integer>();
        for (int i = 0; sc.hasNextInt(); i++) {
            if (i % 2 != 0) {
                deq.add(Integer.valueOf(sc.nextInt()));
            } else sc.nextInt();
        }
        Iterator<Integer> x = deq.descendingIterator();
        while (x.hasNext()) {
            System.out.print(x.next() + " ");
        }
    }
}

