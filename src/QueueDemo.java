public class QueueDemo {
    public static void main(String[] args) {

        // Создание наших очередей
        QueueByRecord queue1 = new QueueByRecord("Сергей","Петр","Максим","Артём","Николай");
        RegularQueue queue2 = new RegularQueue("Анна","Инна","Ольга","Карина","Василиса");

        System.out.println("Доктор начал приём пациентов: "); // Сообщение из главного потока программы
        queue1.start();    // Запускаем одну очередь (дочерний поток)
        queue2.start();    // и вторую (дочерний поток)
    }
}
