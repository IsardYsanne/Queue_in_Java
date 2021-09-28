public class Queue {
    char q[]; // массив для хранения элементов очереди
    int mass[];
    double massd[];
    int putstack, getstack; // индексы для вставки и извлечения элементов очереди

    //Конструктор класса Queue создает очередь заданного размера
    Queue (int size) {
        q = new char[size + 1]; // выделить память для очереди (создаем массив)
        mass = new int[size + 1];
        massd = new double[size + 1];
        putstack = getstack = 0;
    }

    //Метод put (), помещающий элемент в очередь, имеет следующий вид:
    void put(char ch) {
        if (putstack == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putstack++; // 1
        q[putstack] = ch; // q[1] = ch; - символ ch будет первым
    }

    void put_int(int x) {
        if (putstack == mass.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putstack++; // 1
        mass[putstack] = x;
    }

    void put_double(double y) {
        if (putstack == massd.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putstack++; // 1
        massd[putstack] = y;
    }

    //Для извлечения элементов из очереди служит метод get ()
    // Извлечь символ из очереди
    char get () {
        if(getstack == putstack) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getstack++; // 1
        return q[getstack]; // q[1] извлекается
    }

    int get_int () {
        if(getstack == putstack) {
            System.out.println(" - Очередь пуста");
            return (int) 0;
        }
        getstack++; // 1
        return mass[getstack];
    }

    double get_double () {
        if(getstack == putstack) {
            System.out.println(" - Очередь пуста");
            return (double) 0;
        }
        getstack++; // 1
        return massd[getstack];
    }
}

