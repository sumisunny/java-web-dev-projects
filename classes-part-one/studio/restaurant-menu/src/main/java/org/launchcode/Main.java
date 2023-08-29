public class Main {
    public static void main(String[] args) {
        // Create menu items
        MenuItem item1 = new MenuItem("Chicken Sandwich", 9.99, "Grilled chicken with veggies", "Main Course", true);
        MenuItem item2 = new MenuItem("Chocolate Cake", 5.99, "Rich chocolate dessert", "Dessert", false);

        // Create menu and add menu items
        Menu menu = new Menu();
        menu.getMenuItems().add(item1);
        menu.getMenuItems().add(item2);

        // Display menu items and last updated date
        for (MenuItem menuItem : menu.getMenuItems()) {
            System.out.println(menuItem.getName() + " - $" + menuItem.getPrice());
        }
        System.out.println("Last Updated: " + menu.getLastUpdated());
    }
}
