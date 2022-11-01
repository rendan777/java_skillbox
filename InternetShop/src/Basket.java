public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public Basket(){
        items = "Спиcок товаров:";
        this.limit = 10000;
    }

    public Basket(int limit){
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice){
        this();
        this.items = this.limit + items;
        this.totalPrice = totalPrice;
    }
    public void add(String name, int price) {
        if(contains(name)){
            return;
        }
        if (totalPrice + price >= limit){
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrice = totalPrice + price;
    }

    public void clear(){
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }
    public void print(String title) {
        System.out.println(title);
        if(items.isEmpty()){
            System.out.println("Корзина пуста!");
        } else System.out.println(items);
    }
}
