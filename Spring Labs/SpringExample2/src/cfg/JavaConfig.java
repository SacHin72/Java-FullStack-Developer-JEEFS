package cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.Department;
import com.Employee;

@Configuration
@ComponentScan(basePackages="com")
@PropertySource(value= {"classpath:resources/test.properties"})
public class JavaConfig {
//	@Bean(name="dept")
//	public Department getDepartmentBean()
//	{
//		
//		Department dep=new Department();
//		dep.setDid("D101");
//		dep.setDname("HR");
//		dep.setDepSize(12);
//		return dep;
//	}
//	@Bean(name="emp")
//	public Employee getEmployeeBean()
//	{
//		Employee e=new Employee();
//		return e;
//	}


}
