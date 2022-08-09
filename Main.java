public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee(1,"Saleh",100);
        FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee(2,"Ali",50);
        PartTimeEmploee  partTimeEmployee1=new PartTimeEmploee (1,"Khalid",8,100);
        PartTimeEmploee partTimeEmployee2=new PartTimeEmploee(2,"Noura",5,3);
        Company company=new Company("Tuwaiq");
        company.add(fullTimeEmployee1);
        company.add(fullTimeEmployee2);
        company.add(partTimeEmployee1);
        company.add(partTimeEmployee2);
        System.out.println(company);
        System.out.println(Company.computeAmount());
    }
}