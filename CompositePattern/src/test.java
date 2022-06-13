public class test {
    public static void main(String[] args) {
        Developer dev1 = new Developer("john","developer",444);
        Developer dev2 = new Developer("mike","developer",876876);

        Manager man1 = new Manager("alex","maanger",868768);
        Manager man2 = new Manager("molly","maanger",111);

        Directory manDirec = new Directory();
        manDirec.add(man1);
        manDirec.add(man2);

//        manDirec.showEmployeeDetails();

        Directory devDirec = new Directory();
        devDirec.add(dev1);
        devDirec.add(dev2);


//        devDirec.showEmployeeDetails();

        Directory dir = new Directory();
        dir.add(manDirec);
        dir.add(devDirec);

        dir.showEmployeeDetails();



    }
}
