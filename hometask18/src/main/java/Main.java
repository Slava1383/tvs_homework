import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Factory 2", "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Factory 12", "France");
        Manufacturer manufacturer3 = new Manufacturer("Factory 4", "Italy");
        Store store1 = new Store("123", "Minsk", "Stroiteli 14", "1234560987");
        Store store2  = new Store("345", "Rome", "Roter 34", "467933");
        Store store3 = new Store("678", "Prage", "Post 16", "9044777");

        Product product1 = new Product("TV", 13200, Category.ELECTRONICS,
                true, List.of(store1), manufacturer1);
        Product product2 = new Product("Book", 380, Category.BOOKS,
                true, List.of(store2), manufacturer2);
        Product product3 = new Product("Parfim", 1000, Category.BEAUTY,
                false, List.of(store3), manufacturer3);
        Product product4 = new Product("Smartphone", 3490, Category.ELECTRONICS,
                true, List.of(store1), manufacturer1);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        System.out.println("Task 1");
        Product max = products.get(0);
        Product min = products.get(0);
        for(var product : products) {
            if(product.getPrice() > max.getPrice()) {
                max = product;
            } else if (product.getPrice() < min.getPrice()) {
                min = product;
            }
        }
        System.out.println("Product max price: "+max.getName() + "\nProduct min price: "+min.getName());

        System.out.println("Task 2");
        List<String> delivTo = new ArrayList<>();
        for(var product : products) {
            if(product.isDelivery()){
                delivTo.add(product.getName());
            }
        }
        System.out.println("Possibility of delivery to the client :"+delivTo);

        System.out.println("Task 3");
        double totalPrice = 0;
        int counter = 0;
        for (var product : products) {
            if(product.getCategory().equals(Category.ELECTRONICS)){
                totalPrice += product.getPrice();
                counter++;
            }
        }
        System.out.println("Average price: " + totalPrice / counter);

        System.out.println("task 4");
        List<String> productManufacturer = new ArrayList<>();
        for(var product : products) {
            if(product.getManufacturer().equals(manufacturer1)){
                productManufacturer.add(product.getName());
            }
        }
        System.out.println("Products of "+manufacturer1.getName()+" :"+productManufacturer);

        System.out.println("task 5");
        List<String> filterByCountry = new ArrayList<>();
        for(var product : products) {
            if(product.getManufacturer().getCountry().equals("France")){
                filterByCountry.add(product.getManufacturer().getName());
            }
        }
        System.out.println(filterByCountry.size());

        System.out.println("task 6");
        List<Store> filterByCity = new ArrayList<>();
        for(var product : products) {
            for(var toStor : product.getStoreList()){
                if(toStor.getCity().equals("Minsk") && !filterByCity.contains(toStor)){
                    filterByCity.add(toStor);
                }
            }
        }
        System.out.println(filterByCity);

        System.out.println("task 7");
        for (var product : products) {
            for(var toStorTel : product.getStoreList()){
                if(toStorTel.getTelephoneNumber().equals("467933")){
                    System.out.println("Address : " + toStorTel.getAddress());
                    break;
                }
            }
        }

        System.out.println("task 8");
        List<Product> filterByNum = new ArrayList<>();
        for (var product : products) {
            for(var storeNum : product.getStoreList()){
                if(storeNum.getStoreNumber().equals("123")){
                    filterByNum.add(product);
                }
            }
        }
        System.out.println(filterByNum);

        System.out.println("task 9");
        Map<String, String> mapStor = new HashMap<>();
        for(var product : products) {
            for(var storeNum : product.getStoreList()){
                if(!mapStor.containsKey(storeNum.getStoreNumber())){
                    mapStor.put(storeNum.getStoreNumber(), storeNum.getTelephoneNumber());
                }
            }
        }
        System.out.println(mapStor);

        System.out.println("task 10");
        boolean deliver = true;
        for(var product : products) {
            if(product.getCategory() == Category.ELECTRONICS && !product.isDelivery()){
                deliver = false;
                break;
            }
        }
        System.out.println(deliver);

        System.out.println("task 11");
        List<Store> storeCou = new ArrayList<>();
        int counter2 = 0;
        for(var product : products) {
            for(var store : product.getStoreList()){
                if(!storeCou.contains(store)){
                    storeCou.add(store);
                    counter2++;
                }
            }
        }
        System.out.println(counter2);

        System.out.println("Task 12");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
        System.out.println(products);

        System.out.println("Stream>>>>>>");
        IntStream num = IntStream.iterate(1, n -> n+1);
        IntStream num2 = IntStream.iterate(1, n -> n+1);
        double average = num.limit(10).average().orElse(0);
        System.out.println(average);
        num2.skip(5).filter(n -> n%3 == 0).limit(10).forEach(System.out::println);
        num = IntStream.iterate(1, n -> n+1);
        int sumStream = num.limit(20).sum();
        System.out.println(sumStream);
    }
}
