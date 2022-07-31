package encapsulation;

public class Test {
    public static void main(String[] args) {
        Encapsulation_Demo demo = new Encapsulation_Demo();

        demo.setEmp_id(1005);
        demo.setEmp_name("Codebuster Tester");
        demo.setSalary(45000);

        System.out.println(demo.getEmp_id());
        System.out.println(demo.getEmp_name());
        System.out.println(demo.getSalary());
    }
}
