import static java.lang.Thread.sleep;

public class RegularQueue extends Thread {
    private String[] namesReg;

    // Конструктор c аргументом из массива имен
    RegularQueue(String... names) {
        this.namesReg = names;
    }

    // Переопределённый метод, который будет вызван при старте потока
    @Override
    public void run() {
        for (int i = 0; i < namesReg.length; i++) { // Вывод в цикле с паузой 1 сек очередного пациента
            System.out.println("Обработаны документы: " + namesReg[i]);
            try {
                sleep(500); // Задержка в 0.5 сек
            } catch (Exception e) {}
        }
    }
}
