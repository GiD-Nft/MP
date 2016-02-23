package DataStructures;

/**
 * Created by trefi
 * Мультисписки удобны для хранения графов.
 * Если односвязный список организован на динамической памяти, то все достаточно просто: создадим массив списков.
 * Однако при использовании, списков организованных на массивах, нужно учитывать,
 * что простое создание массива списков ничего не даст в плане экономии памяти по сравнению с двумерным массивом.
 * На самом деле для хранения данных достаточно одного массива, размер которого равен максимальному суммарному размеру списков.
 * Затем заведем а массив указателей на голову, и будем работать с ним.
 */
public class MultyLinkedList {
    int[] head; // массив указателей на голову
    int[] next; // массив ссылок на следующий элемент
    int[] data; // массив с данными
    int cnt = 1; // позиция для добавления нового элемента
    /* Конструктор */
    MultyLinkedList(int hNum, int size) {
    head = new int [hNum];
    next = new int [size + 1];
    data = new int [size + 1];
    }

    /* Добавление элемента */
    void add(int h, int v) {
    next[cnt] = head[h]; // устанавливаем указатель на следующий элемент
    data[cnt] = v; // записываем значение
    head[h] = cnt++; // обновляем указатель на голову
    }
}
