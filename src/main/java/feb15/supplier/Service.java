package feb15.supplier;

import feb15.Employee;

import java.util.function.Supplier;

public class Service {

    public Employee showData(Supplier<Employee> supplier){
        return supplier.get();
    }
}
