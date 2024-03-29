package lesson_07;

public class WhileLoop {


   /* Циклы
    Циклы позволяют выполнить некий код несколько раз подряд Каждый такой повтор называется итерацией

    Циклы "while" / "do … while"
    Цикл while выполняется до тех пор, пока заданное условие является верным (имеет значение true):

            while (condition) {
        // body
    ...
    }
    Предикат — условие, которое указывается в скобках после ключевого слова while и вычисляется на каждой итерации

    Тело цикла — блок кода в фигурных скобках, аналогичный блоку кода в методе. Все константы или переменные, определенные внутри этого блока, будут видны только внутри этого блока

    Цикл while - цикл с предусловием

    цикл do-while - цикл с постусловием

    Цикл "do … while" похож, но он всегда выполняет блок кода хотя бы один раз, независимо от того, истинно условие или ложно:

            do {
    ...
    ...
    } while (condition)

    */

    public static void main(String[] args) {

        /*
        while (condition) {
            //тело цикла
        }
       */

//        while (true) { // бесконечный цикл
//            System.out.println("Hello");
//        }

        // Вывести на экран цифры от 0 до 10


        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++; // увеличиваться на 1
        }

        System.out.println("Конец цикла while");

        String str = "Петя, привет";
        int idx = 0;

        while (idx < str.length()) {
            System.out.print(str.charAt(idx) + " ");
            idx++;
        }
        System.out.println();

        // распечатать все четные числа от 0 до 21:

        // 1. Перебрать числа от 1 до 21 с шагом 1
        // 2. Является ли текущее число четным. Если да - распечатать

        int i1 = 1;
        while (i1 <= 21) {
            if (i1 % 2 == 0) {
                System.out.println(i1);
            }
            i1++;
        }

    }
}
