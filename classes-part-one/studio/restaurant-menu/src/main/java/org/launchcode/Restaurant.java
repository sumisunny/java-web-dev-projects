public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem item1 = new MenuItem("Appetizer", "Salad", 8.99, true);
        MenuItem item2 = new MenuItem("Main Course", "Pasta", 12.99, false);

        menu.addItem(item1);
        menu.addItem(item2);

        menu.printMenu();

        item1.printMenuItem();

        menu.removeItem(item2);

        menu.printMenu();
    }
}
