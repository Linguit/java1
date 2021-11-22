import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
public class MyCatCafe implements CatCafe {
    double surplus;
    String name;
    int age;
    String gender;
    double price;
    int n;               //买猫的数量
    int balance;         //店里余额
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Cat> cats = new ArrayList<Cat>();
    Cat cat=new OrangeCat(name,age,gender,price);


    @Override
    public void buyCat(Cat cat,int price) {

          cats.add(cat);
          balance=balance-price;
        if(balance<=0){

            throw new InsufficientBalanceException("余额不足，不能买猫");
        }

    }

    @Override
    public void welcome(String name, int time, LocalDate date) {
        int i;     //随机产生的数字
        Customer customer1=new Customer(name,time,date);
        customers.add(customer1);
        OrangeCat orangeCat=new OrangeCat(name,age,gender,price);
        System.out.println(customer1.toString());
        balance=balance+time*15;
        for(int j=0;j<time;j++){
        Random random=new Random();
        i=random.nextInt(cats.size());
        System.out.println("顾客抽到的");
        System.out.println(cats.get(i));
        }if(cats.size()<=0){
            throw new CatNotFoundException("没有猫可rua了");
        }

    }

    @Override
    public void close(int money) {
        LocalDate date = LocalDate.now();
     for(int i = 0; i< customers.size(); i++){
         if(customers.get(i).getDate().isEqual(date)){
         System.out.println(customers.get(i));
         }

     }

        System.out.println("店里余额为："+(balance+money));


}
    public MyCatCafe(Cat cat,int balance){
        cats.add(cat);
        this.balance=balance;

    }

}
