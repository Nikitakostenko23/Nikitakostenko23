public class HiLoPriority {
    public static void main(String [] agrs){
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY-2);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY+2);
        lo.start();
        hi.start();
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Прерывание главного потока");
        }
        lo.stop();
        hi.stop();
        try{
            lo.t.join();
            hi.t.join();
        }
        catch (InterruptedException e){
            System.out.println("...");
        }
        System.out.println("Низкий приоритет" + lo.click);
        System.out.println("Высокий приоритет" + hi.click);
    }
}
