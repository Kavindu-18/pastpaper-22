abstract class Employee {
    protected int id;
    protected String name;
    protected double basicsal;
    protected double commission;





    //implement a construtor to get two properties a parameters and initialize them
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //implement a method called display two properies
    public void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    //define an abstract method called calculatenetsalary
    public abstract void calculatenetsalary();
}

//implementing a subclass called PermanentEmployee

class PermanentEmp extends Employee{
    public PermanentEmp(int id, String name, double basicsal, double commission) {
        super(id, name);
        this.basicsal = basicsal;
        this.commission = commission;
    }
    @Override
    public void calculatenetsalary() {
        double netsalary = basicsal + commission;
        System.out.println("Net Salary: " + netsalary);
    }

    public void display() {
        super.display();
    }
}

//implementing a subclass called TemporaryEmployee
class TemporaryEmp extends Employee{
    private int OtHrs;
    private double OtRate;
    private double minWage;


    public TemporaryEmp(int id, String name, double basicsal, double commission, int otHrs, double otRate, double minWage) {
        super(id, name);
        this.basicsal = basicsal;
        this.commission = commission;
        OtHrs = otHrs;
        OtRate = otRate;
        this.minWage = minWage;
    }

    @Override
    public void calculatenetsalary(){
        double otAmount = OtHrs * OtRate;
        double netsalary = minWage +otAmount;
        System.out.println("Net Salary: " + netsalary);
    }
}

