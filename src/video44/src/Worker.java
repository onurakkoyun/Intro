public class Worker implements IWorkable, IEatable, IPayable{
    @Override
    public void work() {
        System.out.println("Worker is working.");
    }

    @Override
    public void eat() {
        System.out.println("Worker is eating.");
    }

    @Override
    public void pay() {
        System.out.println("Worker is getting paid.");
    }
}
