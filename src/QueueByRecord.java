import static java.lang.Thread.sleep;

public class QueueByRecord extends Thread {
    private String[] namesRec;

    // Конструктор c аргументом из массива имен
    QueueByRecord(String... names) {
        this.namesRec = names;
    }

    // Переопределённый метод, который будет вызван при старте потока
    @Override
    public void run() { // Этот метод будет вызван при старте потока
        for (int i = 0; i < namesRec.length; i++) { // // Вывод в цикле с паузой 0.5 сек очередного пациента
            System.out.println("Обработаны документы: " + namesRec[i]);
            try {
                sleep(1000); // Задержка в 1.0 сек
            } catch (Exception e) {}
        }
    }
}
