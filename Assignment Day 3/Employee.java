public class Employee {
    String name;
    String jobtitle;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
public void updateSalary(double percentage){
        salary += (salary * percentage / 100);
}
    public Employee(String name, String jobtitle, double salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;

    }
    public void employeeDetails(){
        System.out.println("Employee details are given below");
        System.out.println("Name :" + name);
        System.out.println("Jobtitle :" + jobtitle);
        System.out.println("Salary :" + salary);
    }
    public static void main(String[] args){
        Employee employee1 = new Employee("yoga","SSE", 80000.50);

System.out.println("Employee details before updating salary");
employee1.employeeDetails();

employee1.updateSalary(15);

System.out.println("\nEmployee details after updating");
employee1.employeeDetails();
    }
}
