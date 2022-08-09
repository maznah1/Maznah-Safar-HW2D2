public class PartTimeEmploee extends Employee{


    private int workHours;
    private int wage;


    public PartTimeEmploee(String name ,int id ,int workHours,int wage){
        super(name,id);
        this.workHours=workHours;
        this.wage=wage;

    }


    public double computeAmount() {
        return workHours*wage;

    }



}
