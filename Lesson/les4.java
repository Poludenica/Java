package Lesson;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.EmptyStackException;


// Коллекции. Хранение и обработка данных
/*  Зачем разные коллекции? 
1. способ обработки данных
2. Решаемые задачи

-----------
LinkedList
это двусвязный список
Список -гибкая структура данных, позволяющая легко менять свой размер. Элементы доступны для вставки или удаления в любой позиции.

как массив хранится в памяти:
есть stack 
есть heap - куча - 
Связный список - - это динамическая структура данных, которая может содержать любое количество элементов,
 если доступно достаточно памяти
 Односвязные списки – такие объекты, которые включают в себя «маркеры»-указатели на следующий узел. 
 Из точки А можно попасть лишь в точку Б. 
 Двусвязный список хранит адрес как предыдущего узла, так и следующего узла. 
 Garbage collector -почитать
 Считывать данный  - выгоднее массив.
 Изменять данные - лучше список.

 LinkedList нужен для небольшого количества элементов, в которых операции добавления\удаления встречаются чаще операций чтения.
 LinkedList<Integer> ll = new LinkedList<integer>();
 ll.add(1);
 ll.add(2);
  ---------------------

  коллекция Queue
  тот кто первый пришел, тот и будет обработан.
  Queue<Integer> queue = new LinkedList<Integer>();
  queue.add(4);
  int item = queue.remove(); будет удален тот элемент, который был первый добавлен

  иерархия коллекций Queue на слайде

  PriorityQueue - наивысший элемент имеет "наименьший элемент"

// public class les4 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//         pq.add(123);
//         pq.add(3);
//         pq.add(13); 
//         System.out.println(pq);
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());   
//         System.out.println(pq.poll());   
//     }
    
// }
---------------------------
Коллекция Deque - double ended queue - линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах.

// public class les4 {
//     public static void main(String[] args) {
//         Deque<Integer> deque = new ArrayDeque<>();
//         Deque<Integer> deque = new ArrayDeque<>();
//         deque.addFirst(1);
//         deque.addLast(2);
//         deque.removeLast();
//         deque.removeFirst();
//         deque.offerFirst(1);
//         deque.offerLast(2);
//         deque.pollFirst();
//         deque.pollLast();
//         deque.getFirst();
//         deque.getLast();
//         deque.peekFirst();
//         deque.peekLast();

//     }
// }
-----------------
Stack
то что пришло в первую очередь будет обработано в последнюю очередь
Расширяет Vector пятью операциями, которые позволяют рассматривать вектор, как стек.
push(E item)
pop()

Задача. Вычислить значение выражения в постфиксной форме записи.


*/
public class les4 {
    
        private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {

        var exp = "1 2 3 * +".split(" "); //1+2*3
        int res = 0;
        System.out.println(exp);
    
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++){

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } 
            else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/": 
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
             }
        }
        System.out.printf("%d\n", st.pop());
    }

}

    
