package in.Vishal.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee worker = new Employee("vishal" , 21 , 15000);
        worker.setName("Kushwaha Vishal");
        worker.setSalary(50000);
        worker.setAge(34);
        worker.displayEmployeeDetails();
    }
}
