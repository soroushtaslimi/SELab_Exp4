import java.util.ArrayList;

public class Chenar extends Tree{
    public Chenar(int age, ArrayList<String> gardeners) {
        super(age, gardeners);
    }

    @Override
    public Tree copy() {
        ArrayList<String> gardeners_copy = new ArrayList<>(get_gardeners());
        return new Sarv(this.age, gardeners_copy);
    }
}
