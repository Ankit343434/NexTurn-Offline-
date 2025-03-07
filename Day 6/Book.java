public class Book {
    String name;
    String author;
    double price;

    public Book (String name, String author, double price){
        this.name = name;
        this.author =author;
        this.price =price;
    }
    void show(){
        System.out.println("Book Details");
        System.out.println("Name:-" + name);
        System.out.println("Author:-" + author);
        System.out.println("Price:-" + price);
    }

    public static void main(String[] args) {
        Book obj = new Book ("I will do it", "Ankit",3200);
        System.out.println(obj);
        obj.show();
    }


}
