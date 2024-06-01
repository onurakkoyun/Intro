public class MySqlCustomerDAL implements ICustomerDAL, IRepository{
    @Override
    public void add() {
        System.out.println("Added to MySql database.");
    }
}
