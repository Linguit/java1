public class OrangeCat extends Cat{
    boolean isFat;
    public OrangeCat(String name, int age, String gender, double price) {
        super(name, age, gender, 200);
    }
    @Override
    public String toString(){
       return "这只猫的名字是："+name+"，年龄是："+age+"，性别是："+gender+"，价格是："+price+"，胖不胖："+isFat;
    }


}
