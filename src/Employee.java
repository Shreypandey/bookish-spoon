/*
 * Please note that in one Java file there can be only one public class.
 * Also the name of class that is made public must match with the name of file.
 * Here in our case Test is the public class used for testing purposes (Note name of file is Test.java)
 * Also Employee is the class that is encaspulating the functionality of a Employee
 */

public class Employee
{
    private static int nextId = 0;

    // Always remember make Instance variables (Object Variables) private and provide Accessor and Mutator Methods.

    private int id;
    private String name = ""; // Instance field initialization
    private double salary;

    // Three overloaded constructors
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        this.id = nextId;
        Employee.nextId ++;
    }

    public Employee(double salary)
    {
        // Calls the Employee(String, double) constructor
        // Remember call to another constructor via this keyword should be made in the very first line.
        this("Employee #" + nextId, salary);
    }

    // The default constructor
    public Employee()
    {
        // name initialized to "" --see above
        // salary not explicitly set--initialized to 0
        this.id = nextId;
        Employee.nextId ++;
    }

    // Accessor Methods (Or Getter Methods)
    public String getName()
    {
        return this.name;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public int getId()
    {
        return this.id;
    }

    // Mutator Methods (Or Setter Methods)
    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        // Check to see if someone is not setting negative salary
        if(salary > 0)
            this.salary = salary;
    }

    // See not all insatnce members require Mutator Method, here we don't want to change ID so we don't have a mutator for it.

    public static int getNextId()
    {
        return nextId; // returns static field
    }

    // Look each class can have it's own main method. (Here this one is for testing purposes)
    public static void main(String[] args)
    {
        Employee e = new Employee("Shrey", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}