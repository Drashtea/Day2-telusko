import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();


        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));


        System.out.println("==============================================");
        System.out.println("a Particular text");

        List<Product> prods = service.getProductWithText("black");
        for(Product product : prods){
            System.out.println(product);
        }
        
        System.out.println("*********************************************************");

        List<Product> place=service.getProductWithPlace("Black Drawer");
        for(Product product : place) 
        {
        	System.out.println(product);
        }
        
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Products out of warranty  :");
        int year=LocalDate.now().getYear();
        List<Product> warranty=service.getProductOutofWarranty(year);
        for(Product product:warranty )
        {
        	System.out.println(product);
        }
        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println();
        
        List<Product> list=service.getAllProducts();
        Stream<Product> stream=list.stream();
        
        stream.forEach(s->System.out.println(s));
        
        
        	
    }
}
