public class Queue_class {
    public static void main(String args[]){
        Queue bigS = new Queue(100);
        Queue smallS = new Queue(5);
        Queue intS = new Queue(10);
        Queue doubleS = new Queue(25);

        char ch;
        int i;
        int x2;
        double y2;

        System.out.println("Иcпoльзoвaниe очереди ЬigS для сохранения алфавита");

        //Помещаем буквенные символы в очередь bigS
        for(i=0; i < 26; i++) //буквы англ алфавита
            bigS.put((char) ('A' + i));

        // Извлечь буквенные символы из очереди ЬigS и отобразить
        System.out.print("Coдepжимoe очереди ЬigS: ");
        for (i=0; i < 26; i++) {
            ch = bigS.get(); //извлеченный q[1], q[2] и т д
            if (ch != (char) 0) System.out.print(ch); // АВС...YZ
        }

        System.out.println("\n");

        System.out.println("Иcпoльзoвaниe очереди srnallS для генерации ошибок");

        // Использовать очередь smallS для генерации ошибок
        for(i=0; i < 6; i++) {
            System.out.print("Пoпыткa сохранения " + (char) ('z' - i));
            smallS.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки при обращении к очереди smallS
        System.out.print("Coдepжимoe smallS: ");
        for(i=0; i < 6; i++) {
            ch = smallS.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        //int
        for(i=0; i < 10; i++)
            intS.put_int((int) (i));
        System.out.print("Coдepжимoe очереди intS: ");
        for (i=0; i < 10; i++) {
            x2 = intS.get_int();
            if (x2 != (int)0) System.out.print(x2);
        }
        System.out.println("\n");
/*
        for(i=0; i < 10; i++) {
            System.out.print("Пoпыткa сохранения " + (int) (i));
            intS.put_int((int) (i));
            System.out.println();
        }
        System.out.println();

        System.out.print("Coдepжимoe intS: ");
        for(i=0; i < 10; i++) {
            x2 = intS.get_int();
            if (x2 != 0) System.out.print(x2);
        }
*/
        System.out.println("\n");

        //double
        for(i=0; i < 25; i++)
            doubleS.put_double((double) (i));
        System.out.print("Coдepжимoe очереди doubleS: ");
        for (i=0; i < 25; i++) {
            y2 = doubleS.get_double();
            if (y2 != (double) 0) System.out.print(y2);
        }
    }
}