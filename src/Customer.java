import java.time.LocalDate;

public class Customer {
    String name;
    int time;
    LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer(String name, int time, LocalDate date) {
        this.name=name;
        this.time=time;
        this.date=date;
    }

    @Override
    public String toString(){
        return "顾客的名字为："+name+"，想要撸猫的次数："+time+"，进店的时间："+date.toString();
    }
}
