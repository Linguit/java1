import java.time.LocalDate;

public interface CatCafe {

    void buyCat(Cat cat,int price);
    void welcome(String name, int time, LocalDate date);
    void close(int money);
}
