/* 

Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.

Пример

InputStream последовательно возвращает четыре байта: 48 49 50 51.

Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".

*/

public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    Reader reader = new InputStreamReader(inputStream, charset);
    StringBuilder sb = new StringBuilder();
    int cbyte = reader.read();
    for (;cbyte >= 0;) {
        sb.append((char)cbyte);
        cbyte = reader.read();
    }
    return sb.toString();
}