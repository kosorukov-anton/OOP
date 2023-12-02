public class Product {
    private String name;
    private double price;
    private int id;

    //Конструктор
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //Получить присвоить
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //вывод

    @Override
    public String toString() {
        return "id:"+id+" name: "+name+" price: "+price ;
    }
}
