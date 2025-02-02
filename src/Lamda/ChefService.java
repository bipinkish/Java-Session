package Lamda;

public class ChefService implements Chef{
    @Override
    public void cook(String dish) {
        System.out.println("Chef cooking.."+dish);
    }
}
