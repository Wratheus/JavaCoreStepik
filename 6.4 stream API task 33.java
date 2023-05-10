/* 

Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.

Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

minMaxConsumer.accept(min, max);
Если стрим не содержит элементов, то вызовите
minMaxConsumer.accept(null, null);

*/

public static <T> void findMinMax(
        Stream<? extends T> stream,
        Comparator<? super T> order,
        BiConsumer<? super T, ? super T> minMaxConsumer) {

    List<T> items = stream.sorted(order).collect(Collectors.toList());
    if (!items.isEmpty()) {
        minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));

    } else {
        minMaxConsumer.accept(null, null);
    }
}