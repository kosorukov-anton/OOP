public class Main {
    public static void main(String[] args) {
        int id=0;
        Product prod1=new Product(id++,"twix",90);
        Product prod2=new Product(id++,"coca",120);
        Product prod3=new Product(id++,"lays",100);
        System.out.println(prod1);

    }
}