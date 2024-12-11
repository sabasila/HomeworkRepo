// Class Product
class Product {
    private double price;
    private String expiry;

    public Product(double price, String expiry)
    {
        this.price = price;
        this.expiry = expiry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}

class Milk extends Product
{
    private double volume;

    // Constructor
    public Milk(double price, String expiry, double volume)
    {
        super(price, expiry);
        this.volume = volume;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

class Cake extends Product {
    private double weight;

    public Cake(double price, String expiry, double weight)
    {
        super(price, expiry);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}

class Sandwich extends Product
{
    private double length;

    public Sandwich(double price, String expiry, double length)
    {
        super(price, expiry);
        this.length = length;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }
}


class Store
{
    private Product[] products;

    // Constructor
    public Store(Product[] products)
    {
        this.products = products;
    }

    // Getter and Setter for products
    public Product[] getProducts()
    {
        return products;
    }

    public void setProducts(Product[] products)
    {
        this.products = products;
    }
}
