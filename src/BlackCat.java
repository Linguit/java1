public class BlackCat extends Cat{
    public BlackCat(String name, int age, String gender){
        super(name, age, gender, 350);

    }
    @Override
    public String toString(){
        return "这只猫的名字是："+name+"，年龄是："+age+"，性别是："+gender+"，价格是："+price;
    }
}
