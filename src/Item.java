import java.util.HashMap;
import java.util.Map;

class Item {
    protected String title;
    protected double price;
    protected int stock;

    public Item(String title, double price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int quantity) {
        if (quantity > stock) {
            System.out.println("Niet genoeg voorraad beschikbaar voor " + title);
        } else {
            stock -= quantity;
            System.out.println(quantity + " " + title + "(s) verkocht.");
        }
    }

    public double calculateTotalValue() {
        return price * stock;
    }
}

class CD extends Item {
    private int numberOfSongs;

    public CD(String title, double price, int stock, int numberOfSongs) {
        super(title, price, stock);
        this.numberOfSongs = numberOfSongs;
    }
    public double calculateTotalValue() {
        return price * stock * numberOfSongs;
    }
}

class DVD extends Item {
    public DVD(String title, double price, int stock) {
        super(title, price, stock);
    }
}

class Game extends Item {
    private String platform;
    private String genre;

    public Game(String title, double price, int stock, String platform, String genre) {
        super(title, price, stock);
        this.platform = platform;
        this.genre = genre;
    }

    public String toString() {
        return "Game [title=" + title + ", price=" + price + ", stock=" + stock +
                ", platform=" + platform + ", genre=" + genre + "]";
    }
}

class MusicStore {
    private Map<String, Item> inventory = new HashMap<>();

    public void addItem(Item item) {
        inventory.put(item.title, item);
    }

    public void sellItem(String title, int quantity) {
        Item item = inventory.get(title);
        if (item != null) {
            item.sell(quantity);
        } else {
            System.out.println("Item met de titel " + title + " niet gevonden in voorraad.");
        }
    }

    public void displayInventory() {
        System.out.println("Voorraadoverzicht:");
        for (Item item : inventory.values()) {
            System.out.println(item);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        MusicStore store = new MusicStore();

        CD cd1 = new CD("Best of 90s", 15.99, 50, 12);
        CD cd2 = new CD("Pop Hits", 12.50, 30, 15);
        DVD dvd1 = new DVD("Action Movie", 19.99, 20);
        Game game1 = new Game("Fantasy Adventure", 29.99, 40, "PC", "RPG");
        Game game2 = new Game("Racing Champion", 39.99, 25, "PS5", "Racing");

        store.addItem(cd1);
        store.addItem(cd2);
        store.addItem(dvd1);
        store.addItem(game1);
        store.addItem(game2);

        store.sellItem("Best of 90s", 10);
        store.sellItem("Action Movie", 5);
        store.sellItem("Fantasy Adventure", 5);

        store.displayInventory();
    }
}
