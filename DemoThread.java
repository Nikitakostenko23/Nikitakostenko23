public class DemoThread {
    public static void main(String [] args){
        NewThread obj1 = new NewThread("Первый");
        NewThread obj2 = new NewThread("Второй");
        NewThread obj3 = new NewThread("Третий");
        System.out.println("Первый поток выполнен"+obj1.t.isAlive());
        System.out.println("Второй поток выполнен"+obj2.t.isAlive());
        System.out.println("Третий поток выполнен"+obj3.t.isAlive());
        try {
            System.out.println("Ждите завершения потоков");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Прерывание главного потока");
        }
        System.out.println("Завершение главного потока");
    }
}
