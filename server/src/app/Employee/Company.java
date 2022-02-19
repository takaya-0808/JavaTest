
public class Company {
    public static void main(String[] args) {
        
        Employee emp = new Employee();

        PartTime ptm = new PartTime();

        emp.setPosition("一般社員");
        ptm.setShift("アルバイト");

        emp.work();
        ptm.work();
        ptm.empWork();
    }
}