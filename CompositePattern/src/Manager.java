public class Manager implements Employee{
    private String name;
    private String position;
    private long empID;

    public Manager(String name,String position,long empID){
        this.empID=empID;
        this.name=name;
        this.position=position;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println(name +" "+ position +" "+ empID);
    }
}
