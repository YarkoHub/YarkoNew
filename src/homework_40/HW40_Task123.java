package homework_40;
/*
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
Используйте несколько предикатов для фильтрации списка чисел, где числа должны быть четными, больше 10 и меньше 100
 */

/*
Создайте цепочку функций, которая сначала удаляет пробелы из строки, затем преобразует её в верхний регистр,
и в конце считает количество символов в измененной строке
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

/*
Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
 */
public class HW40_Task123 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task3() {
/*
Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
 */
        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println(key + " = " + value);
        biConsumer.accept(1, "TEST");

        //BiPredicate<T,U> принимает два аргумента, возвращает логическое значение (boolean)
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a + b > 20;
        System.out.println(biPredicate.test(10, 20));

        //BiFunction<T,U,R> принимает два аргумента типов T,U и возвращает объект типа R
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction.apply("Hello", "World"));


    }

    public static void task2() {
        /*
Создайте цепочку функций, которая сначала удаляет пробелы из строки, затем преобразует её в верхний регистр,
и в конце считает количество символов в измененной строке
 */
        String test = "Yaroslav Hrytsenko";

        Function<String, String> function = string -> string.replaceAll(" ", "");
        Function<String, String> function1 = String::toUpperCase;
        Function<String, Integer> function2 = String::length;

        Function<String, Integer> combinedFunction = function.andThen(function1).andThen(function2);
        System.out.println(combinedFunction.apply(test));
        System.out.println((test));

    }
/*
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
Используйте несколько предикатов для фильтрации списка чисел, где числа должны быть четными, больше 10 и меньше 100
 */

    public static void task1() {
        Predicate<Integer> predicate1 = integer -> integer % 2 == 0;
        Predicate<Integer> predicate2 = integer -> integer > 10;
        Predicate<Integer> predicate3 = integer -> integer < 100;

        Predicate<Integer> combinedPredicate = predicate1.and(predicate2).and(predicate3);

        List<Integer> integers = List.of(5, 12, 65, 102, 34, 9, 8, 76, 200, 122, 53, 14, 44);

        System.out.println(filterByPredicate(integers, combinedPredicate));

        List<Integer> list = integers.stream().filter(combinedPredicate).collect(Collectors.toList());
        System.out.println(list);

        System.out.println(integers
                .stream()
                .filter(predicate1)
                .filter(predicate2)
                .filter(predicate3)
                .collect(Collectors.toList())

        );

    }

    private static List<Integer> filterByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : integers) {
            if (predicate.test(i)) result.add(i);
        }
        return result;
    }


}
