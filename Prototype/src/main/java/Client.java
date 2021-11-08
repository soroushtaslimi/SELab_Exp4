import java.util.ArrayList;

public class Client {

    public Client(){}

    public Tree makeChenar(int age, ArrayList<String> gardeners){
        return new Chenar(age, gardeners);
    }

    public Tree makeSarv(int age, ArrayList<String> gardeners){
        return new Sarv(age, gardeners);
    }

}
