public class PetSold extends ItemSold
{
    private boolean Vaccinated;
    private boolean Neutered;
    private boolean Housebroken;

    public void setVaccinated(boolean V) {
        Vaccinated = V;
    }

    public void setNeutered(boolean N) {
        Neutered = N;
    }

    public void setHousebroken(boolean H) {
        Housebroken = H;
    }

    public boolean getVaccinated() {
        return Vaccinated;
    }

    public boolean getNeutered() {
        return Neutered;
    }

    public boolean getHousebroken() {
        return Housebroken;
    }
}