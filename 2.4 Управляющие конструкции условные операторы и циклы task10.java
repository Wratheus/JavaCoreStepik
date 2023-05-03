/*

	Реализуйте метод, вычисляющий факториал заданного натурального числа.
	Поскольку это очень быстро растущая функция, то даже для небольших N
	N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.

	Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

	Sample Input 1:

	1
	Sample Output 1:

	1
	Sample Input 2:

	3
	Sample Output 2:

	6

*/


public static BigInteger factorial(int value) {
    BigInteger r = new BigInteger("1");
    for(int i = 1; i <= value; i++){
        r = r.multiply(new BigInteger(String.valueOf(i)));
    }
    return r;
}