public class DemoItemsAndPets
{
    public static void main(String[] args) {

        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();

        item1.setInvoiceNumber(0);
        item1.setDescription("bird cage");
        item1.setPrice(42);

        item2.setInvoiceNumber(1);
        item2.setDescription("chew toy");
        item2.setPrice(4.20);

        pet1.setInvoiceNumber(2);
        pet1.setDescription("bird");
        pet1.setPrice(420);
        pet1.setVaccinated(true);
        pet1.setNeutered(true);
        pet1.setHousebroken(false);

        pet2.setInvoiceNumber(3);
        pet2.setDescription("dog");
        pet2.setPrice(4200);
        pet2.setVaccinated(true);
        pet2.setNeutered(false);
        pet2.setHousebroken(true);

        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }
    public static void displayPetData(PetSold item)
    {
        System.out.println("     Vaccinated is " + item.getVaccinated());
        System.out.println("     Neutered is " + item.getNeutered());
        System.out.println("     Housebroken is " + item.getHousebroken());
    }
    public static void display(ItemSold item)
    {
        System.out.println("Invoice #" + item.getInvoiceNumber());
        System.out.println("     Description: " + item.getDescription());
        System.out.println("     Price: $" + item.getPrice());
    }
}