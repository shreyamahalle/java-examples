package src.com.shreya.object;

public class Practice {
    int number;
    String name;
    void show(){
        System.out.println("name is " + name + " number is " + number);
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.number = 1;
        p.name = "sh";
        p.show();

    }
}
