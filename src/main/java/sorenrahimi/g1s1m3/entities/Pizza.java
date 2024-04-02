package sorenrahimi.g1s1m3.entities;


import java.util.List;

public class Pizza extends MenuItem {
    private String name;
    private List<Topping> toppingList;
    private boolean isXL = false;


    public Pizza(String name, List<Topping> toppingList, boolean isXL) {
        super(980, 4.5);
        this.name = name;
        this.toppingList = toppingList;
        this.isXL = isXL;
        this.calories = setCalories(toppingList, isXL);
        this.price = setPrice(toppingList, isXL);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    public boolean isXL() {
        return isXL;
    }

    public void setXL(boolean XL) {
        isXL = XL;
    }

    public int setCalories(List<Topping> toppingList, boolean isXL){
        int tot = 980;
        if (toppingList != null) {
            for (int i = 0; i < toppingList.size(); i++){
                tot += toppingList.get(i).getCalories();
            }
        }
        if (isXL) return (tot += (tot * 5) / 100);
        else return tot;
    }

    public double setPrice(List<Topping> t, boolean isXL) {
        double tot = 4.5;
        if (t != null){
            for (int i = 0; i < t.size(); i++) {
                tot += t.get(i).getPrice();
            }
        }
        if (isXL) return (tot += (tot * 10) / 100);
        else return tot;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppingList=" + toppingList +
                ", isXL=" + isXL +
                '}';
    }
}
