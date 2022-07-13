public class Ale implements Beer{

    @Override
    public String drink() {
       return "Beba uma Ale";
    }

    @Override
    public String label() {
        return "Ale";
    }

}