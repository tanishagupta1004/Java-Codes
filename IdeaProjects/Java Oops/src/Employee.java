class Employee1{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){ // Won't Return Anything
        name=n;

    }
}
public class Employee {

    public static void main(String[] args) {
     Employee1 e=new Employee1();
     e.setName("Tanisha");
        System.out.println(e.getName()); // If u won't write the first line it will give null
        e.salary=891;
        System.out.println(e.getSalary());


    }
}
