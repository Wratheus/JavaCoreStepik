/* 

	9 из 9 шагов пройдено
	5 из 5 баллов  получено
	Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

	Решать можно разными способами:

	воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
	применив пару трюков из двоичной арифметики;
	написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
	Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

	Sample Input 1:

	0
	Sample Output 1:

	false
	Sample Input 2:

	1
	Sample Output 2:

	true
	Sample Input 3:

	-2
	Sample Output 3:

	true

*/

public static boolean isPowerOfTwo(int value) {
    return Integer.bitCount(Math.abs(value)) != 1 ? false : true;
}