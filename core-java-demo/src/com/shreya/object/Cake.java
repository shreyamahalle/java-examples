package src.com.shreya.object;
class Recipe{
    String base;
    void show(){
        System.out.println("base is for cake.!!");
    }

}
public class Cake {
    public static void main(String[] args) {
    Recipe r = new Recipe();
    r.base = "red";
    r.show();
    }
}
