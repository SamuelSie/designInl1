public class Main {
    public static void main(String[] args) {
        Role engineer = new Role("Engineer");
        Employee emp1 = new Employee("Stefan", "dept 2", engineer);

        System.out.println(emp1.toString());

        emp1.removeRole(engineer);
        System.out.println("role removed " + emp1.toString());

    }
}
