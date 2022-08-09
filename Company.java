import java.lang.reflect.Array;
import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<PayAble> list;



    public Company(String name){

        this.name=name;
        this.list=new ArrayList<>();
    }
    public boolean add(PayAble p){
        this.list=new ArrayList<>();
        return ();


    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}


