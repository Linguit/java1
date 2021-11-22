import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){

        int balance=1000;
        ArrayList<Cat> cats = new ArrayList<Cat>();
        ArrayList<Customer> customer= new ArrayList<Customer>();
        BlackCat cat3=new BlackCat("球球",1,"雌性");
        MyCatCafe catCafe=new MyCatCafe(cat3,balance);
        LocalDate date1=LocalDate.of(2021,11,19);


        BlackCat cat1=new BlackCat("小胖",2,"雌性");
        catCafe.buyCat(cat1, 10);
        catCafe.welcome("小红",5,date1);
        LocalDate date = LocalDate.now();
        catCafe.welcome("小明",10,date);

        BlackCat cat2=new BlackCat("小朱",3,"雌性");


        catCafe.close(balance);


    }
}
