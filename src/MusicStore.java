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
            System.out.println("Titel: " + item.title);
            System.out.println("Voorraad: " + item.stock);
            System.out.println("Totale waarde: " + item.calculateTotalValue());
            System.out.println("-----------------------------");
        }
    }


    public static void main(String[] args) {
        MusicStore store = new MusicStore();


        CD cd1 = new CD("Best of 90s", 15.99, 50, 12);
        CD cd2 = new CD("Pop Hits", 12.50, 30, 15);
        DVD dvd1 = new DVD("Action Movie", 19.99, 20);


        store.addItem(cd1);
        store.addItem(cd2);
        store.addItem(dvd1);


        store.sellItem("Best of 90s", 10);
        store.sellItem("Action Movie", 5);

        store.displayInventory();
    }
}

