package sorenrahimi.g1s1m3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sorenrahimi.g1s1m3.entities.Beverage;
import sorenrahimi.g1s1m3.entities.Menu;
import sorenrahimi.g1s1m3.entities.Pizza;
import sorenrahimi.g1s1m3.entities.Topping;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean(name = "toppings_pomodoro")
    public Topping toppingPomodoroBean() {
        return new Topping("Pomodoro", 5 , 0);
    }
    @Bean(name = "toppings_mozzarella")
    public Topping toppingMozzarellaBean() {
        return new Topping("Mozzarella", 85, 0);
    }
    @Bean(name = "toppings_prosciutto")
    public Topping toppingProsciuttoBean() {
        return new Topping("Prosciutto", 45, 1.30);
    }
    @Bean(name = "toppings_ananas")
    public Topping toppingAnanasBean() {
        return new Topping("Ananas", 25, 1.30);
    }
    @Bean(name = "toppings_salame")
    public Topping toppingSalameBean() {
        return new Topping("Salame", 90, 2.00);
    }
    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
            List<Topping> tList = new ArrayList<>();
            tList.add(toppingPomodoroBean());
            tList.add(toppingMozzarellaBean());
            return new Pizza("Pizza Margherita",tList, false);
    }
    @Bean(name = "pizza_hawaiana")
    public Pizza pizzaHawaianaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingPomodoroBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingAnanasBean());
        tList.add(toppingProsciuttoBean());
        return new Pizza("Pizza Hawaiana",tList, false);
    }
    @Bean(name = "pizza_salame")
    public Pizza pizzaSalameBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingPomodoroBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingSalameBean());
        return new Pizza("Pizza Salame",tList, false);
    }

    @Bean(name = "pizza_salame_xl")
    public Pizza pizzaSalameXLBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingPomodoroBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingSalameBean());
        return new Pizza("Pizza Salame XL",tList, true);
    }

    @Bean(name = "limonata")
    public Beverage limonataBean() {
        return new Beverage("Limonata", 103, 2.50);
    }
    @Bean(name = "acqua")
    public Beverage acquaBean() {
        return new Beverage("Acqua", 5, 1.00);
    }

    @Bean(name = "birra")
    public Beverage birraBean() {
        return new Beverage("Birra", 280, 3.50);
    }

    @Bean(name = "menu")
    public Menu menuBean(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Beverage> drinkList = new ArrayList<>();
        List<Topping> toppingList = new ArrayList<>();

        pizzaList.add(pizzaMargheritaBean());
        pizzaList.add(pizzaHawaianaBean());
        pizzaList.add(pizzaSalameBean());
        pizzaList.add(pizzaSalameXLBean());

        drinkList.add(limonataBean());
        drinkList.add(acquaBean());
        drinkList.add(birraBean());

        toppingList.add(toppingPomodoroBean());
        toppingList.add(toppingMozzarellaBean());
        toppingList.add(toppingSalameBean());
        toppingList.add(toppingProsciuttoBean());
        toppingList.add(toppingAnanasBean());

        return new Menu(pizzaList, drinkList, toppingList);
    }
}







