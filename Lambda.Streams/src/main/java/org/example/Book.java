package org.example;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomStringUtils;

//Task2

public class Book implements Comparable<Book> {
    String name;
    float price;

    public Book(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static LinkedList<Book> createLibrary (int quantity) {
        LinkedList<Book> result = new LinkedList<>();
        for (int i = 0; i < quantity ; i++) {
            result.add(new Book(RandomStringUtils.randomAlphabetic(3,10),Float.parseFloat(RandomStringUtils.randomNumeric(1,3))));
        }
        return result;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", price: " + this.getPrice();
    }

    @Override
    public int compareTo(Book book) {
        if(book.getName().compareTo(name) == 0){
            return Float.compare(book.getPrice(),price);
        }
        return book.getName().compareTo(name);
    }



    public static void main(String[] args) {
        LinkedList<Book> library = new LinkedList<>(createLibrary(10));
        System.out.println("\n Sub-task 1:");
        System.out.println("\n Print all books using method toString (information should be consistent, e.g. “name: Book1, price: 10”):");

        List<String> listOfBooks = library
                .stream()
                        .map(Book::toString)
                                .collect(Collectors.toList());
        System.out.println(listOfBooks);


        System.out.println("\n Get List<String> of all book names and print them");
        library
                .stream()
                .map(Book::getName)
                .forEach(System.out::println);

        System.out.println("\n Get total price of all books and print it");
        BinaryOperator<Float> sumOfPrices = (acc,x) -> {
            return (Float) (acc + x);
        };

        float total = library
                .stream()
                .map(Book::getPrice)
                .reduce(0f,sumOfPrices);

        System.out.println(total);

        System.out.println("\n Get any book with “A” or “a” character in name and print its name");
        Predicate<String> containsA = (x) -> x.toLowerCase().contains("a");

        library
                .stream()
                .map(Book::getName)
                .filter(containsA)
                .forEach(System.out::println);


        System.out.println("\n Print book name with highest price");

        Float max = library
                .stream()
                .map(Book::getPrice)
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(max);

        System.out.println("\n Get number of books where name consists of 5 letters");

        Predicate<String> consist5letters = (x) -> x.length() == 5;

        Long numberOfBooks = library
                .stream()
                .map(Book::getName)
                .filter(consist5letters).count();

        System.out.println(numberOfBooks);

        System.out.println("\n Get all books except books with price higher then 30");

        Predicate<Book> priceMoreThan30 = (x) -> x.getPrice() > 30f;

        List<Book> booksWithPriceMoreThan30 = library
                .stream()
                .filter(priceMoreThan30)
                .collect(Collectors.toList());

        System.out.println(booksWithPriceMoreThan30);

        System.out.println("\n Sort books by name in desc order, if name equals then sort by price");

        List<Book> sortedLibrary = library
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedLibrary);

        System.out.println("\n Sub-task 2:");
//        - create object Book book1(name myBook, price 5)
//        - create object Book book2(name myBook, price 5)
//        - add Book1 to map Map<Book, String> mapWithBook -> key = Book1, value - some library name
//        - get library name using book2 object


        Book book1 = new Book( "myBook",  5);
        Book book2 = new Book( "myBook2",  10);

        Map<Book,String> mapWithBooks = new HashMap<>();
        mapWithBooks.put(book1, "Soledar library");
        mapWithBooks.put(book2, "Soledar library");

        System.out.println(mapWithBooks.get(book2));
    }


}
