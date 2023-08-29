import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu() {
        menuItems = new ArrayList<>();
        lastUpdated = new Date(); // Initialize with the current date
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
