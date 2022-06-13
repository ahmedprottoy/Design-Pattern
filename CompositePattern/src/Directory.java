import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee{

    private List<Employee> empList = new ArrayList<Employee>();

    public void add(Employee e){
        empList.add(e);
    }
    public void remove(Employee e){
        empList.remove(e);
    }
    @Override
    public void showEmployeeDetails() {
    for(Employee em:empList){
        em.showEmployeeDetails();
    }
    }
}
