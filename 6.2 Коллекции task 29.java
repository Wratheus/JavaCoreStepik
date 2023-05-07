/*

Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример

Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.

*/

public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    HashSet<T> h1 = new HashSet<>(set1);
    HashSet<T> h2 = new HashSet<>(set2);
    HashSet<T> mutual = new HashSet<>(h1);
    mutual.retainAll(h2);
    h2.removeAll(mutual);
    h1.removeAll(mutual);
    h1.addAll(h2);
    return h1;
}

