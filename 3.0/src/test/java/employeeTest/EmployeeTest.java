package employeeTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import employee.Employee;
public class EmployeeTest {
    
    @Test
    void calPayTest() {
            Employee obj=new Employee(101,25000.00,"Ashish",4.0);
             assertEquals(25000.00,obj.calNetPay());   
             Employee obj1=new Employee(101,25000.00,"Ashish",6.0);
             assertEquals(25000.00-25000.00*(6.0/100),obj1.calNetPay());   
    }

}
