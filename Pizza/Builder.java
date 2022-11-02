package Pizza;

public interface Builder {
    public void reset();
    
    public void addCheese();

    public void addPepper();

    public Pizza getResult();

    public void addMeat();
}
