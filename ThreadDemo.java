public class ThreadDemo {
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток:" +t);
        t.setName("DemoThread");
        System.out.println("После изменения"+t);
        try{
            for (int n=5; n>0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Главный поток завершён");
        }
    }
}
