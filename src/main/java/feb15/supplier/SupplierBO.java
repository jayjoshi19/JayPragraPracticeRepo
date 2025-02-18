package feb15.supplier;

import feb15.Employee;

public class SupplierBO {
    public void process(){
        Service service = new Service();
        Employee employee = service.showData(() -> Employee.builder()
                .fName("Jay")
                .lName("Joshi")
                .salary(9999)
                .build());
//        System.out.println(employee.getFName() + ", " + employee.getLName() + ", "+employee.getSalary());
        System.out.println(employee);
    }
}
