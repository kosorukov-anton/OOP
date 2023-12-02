public class vending {
    private List<Product> Productlist;
    public void addProduct(Product product){
        Productlist.add(product);
    }

    public void getByNames(String name){
        for (Product product:Productlist){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
