public class MenuItem {
    private String category;
    private String description;
    private double price;
    private boolean isNew;

    public MenuItem(String category, String description, double price, boolean isNew) {
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
    }

    // Getters and setters for category, description, price, and isNew

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        return description.equals(menuItem.description);
    }

    public void printMenuItem() {
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("New Item: " + isNew);
        System.out.println("-----");
    }

    public boolean isNew() {
        return isNew;
    }
}