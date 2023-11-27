package src.main.pz6;

public class Laptop {

    String label;
    String series;
    String model;
    int wokingMemory;
    int hardDisk;
    String operationSystem;
    String colour;

    int price;

    @Override
    public String toString()
    {
        return "\n" + label + " " + model + " цена: " + price + " жесткий диск: " + hardDisk + " оперативная память: " + wokingMemory + " ОС: " + operationSystem + " цвет: " + colour;
    }

    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true;
        }
        if(!(object instanceof Laptop))
        {
            return false;
        }
        Laptop laptop = (Laptop) object;
        return label.equals(laptop.label) && wokingMemory == laptop.wokingMemory && hardDisk == laptop.hardDisk && colour.equals(laptop.colour) && operationSystem.equals(laptop.operationSystem);
    }

}
