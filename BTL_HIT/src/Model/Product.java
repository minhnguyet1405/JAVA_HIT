package Model;

public class Product implements Comparable<Product>{
    protected static long id=1000;
    protected long idPro;
    protected String nameProduct;
    protected int quality;
    protected int price;

    public Product() {
    }

    public Product(long idPro, String nameProduct, int quality, int price) {
        if(idPro==0){
            this.idPro=id++;
        }else
            this.idPro = idPro;
        this.nameProduct = nameProduct;
        this.quality = quality;
        this.price = price;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Product.id = id;
    }

    public long getIdPro() {
        return idPro;
    }

    public void setIdPro(long idPro) {
        this.idPro = idPro;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void output(){
        System.out.printf("%-15S %-15S %-15S %-15S\n",idPro,nameProduct,quality,price);
    }


    @Override
    public int compareTo(Product o) {
        return getPrice()-o.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "idPro=" + idPro +
                ", nameProduct='" + nameProduct + '\'' +
                ", quality=" + quality +
                ", price=" + price +
                '}';
    }
}
