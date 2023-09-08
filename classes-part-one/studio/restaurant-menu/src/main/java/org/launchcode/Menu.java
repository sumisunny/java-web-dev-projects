import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private List<MenuItem> items;
    private Date lastUpdateDate;

    public Menu() {
        items = new ArrayList<>();
        lastUpdateDate = new Date();
    }

    public void addItem(MenuItem item) {
        if (!items.contains(item)) {
            items.add(item);
            lastUpdateDate = new Date();
            System.out.println("Item added to the menu.");
        } else {
            System.out.println("Warning: Item already exists on the menu.");
        }
    }

    public void removeItem(MenuItem item) {
        if (items.contains(item)) {
            items.remove(item);
            lastUpdateDate = new Date();
            System.out.println("Item removed from the menu.");
        } else {
            System.out.println("Item not found on the menu.");
        }
    }

    public boolean isNewItem(MenuItem item) {
        return item.isNew();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void printMenu() {
        if (items.isEmpty()) {
            System.out.println("The menu is empty.");
        } else {
            System.out.println("Menu (Last Updated: " + lastUpdateDate + ")");
            for (MenuItem item : items) {
                item.printMenuItem();
            }
        }
    }
}