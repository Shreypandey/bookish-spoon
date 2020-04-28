
public class FourthExample
{
    public static void main(String[] args)
    {
        // Fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Shrey Pandey", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        // Print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                    + e.getSalary());

        // If above loop doesn't seem familar then google it. You will learn a new thing.

        int n = Employee.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }
}
