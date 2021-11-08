import java.util.ArrayList;

public abstract class Tree {
    public int age;
    private final ArrayList<String> gardeners;

    public Tree(int age, ArrayList<String> gardeners){
        this.age = age;
        this.gardeners = gardeners;
    }

    public void add_gardener(String name){
        gardeners.add(name);
    }

    public ArrayList<String> get_gardeners(){
        return gardeners;
    }

    public abstract Tree copy();
}