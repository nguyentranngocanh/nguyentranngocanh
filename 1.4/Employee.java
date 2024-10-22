public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalry(){
        return salary*12;
    }
    public int raiseSalary(){
        return salary+getAnnualSalry();
    }
    public String toString(){
        return "Employee[id ="+ id +"name ="+ firstName +"lastName ="+ lastName +"salary = "+salary +"]";
    }
}
