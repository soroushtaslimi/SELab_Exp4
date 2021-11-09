import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class ClientTest {

    @Test
    public void testCopyChenar_WHEN_noChange(){
        Client client = new Client();
        ArrayList<String> gardeners = new ArrayList<>();
        gardeners.add("ahmad");
        gardeners.add("ali");
        Tree first_chenar = client.makeChenar(10, gardeners);
        Tree second_chenar = first_chenar.copy();
        Assert.assertEquals(second_chenar.age, first_chenar.age);
        Assert.assertEquals(second_chenar.get_gardeners(), first_chenar.get_gardeners());
    }

    @Test
    public void testCopySarv_WHEN_noChange(){
        Client client = new Client();
        ArrayList<String> gardeners = new ArrayList<>();
        gardeners.add("ahmad");
        gardeners.add("ali");
        Tree first_sarv = client.makeSarv(10, gardeners);
        Tree second_sarv = first_sarv.copy();
        Assert.assertEquals(first_sarv.age, second_sarv.age);
        Assert.assertEquals(first_sarv.get_gardeners(), second_sarv.get_gardeners());
    }

    @Test
    public void testCopyChenar_WHEN_addingGardener_toFirst(){
        Client client = new Client();
        ArrayList<String> gardeners = new ArrayList<>();
        gardeners.add("ahmad");
        gardeners.add("ali");
        Tree first_chenar = client.makeChenar(10, gardeners);
        Tree second_chenar = first_chenar.copy();
        first_chenar.add_gardener("mohammad");
        Assert.assertEquals(second_chenar.age, first_chenar.age);
        Assert.assertNotEquals(second_chenar.get_gardeners(), first_chenar.get_gardeners());
        Assert.assertEquals(first_chenar.get_gardeners(), gardeners);
        gardeners = new ArrayList<>();
        gardeners.add("ahmad");
        gardeners.add("ali");
        Assert.assertEquals(second_chenar.get_gardeners(), gardeners);
    }

    @Test
    public void testCopySarv_WHEN_addingGardener_toFirst(){
        Client client = new Client();
        ArrayList<String> gardeners = new ArrayList<>();
        gardeners.add("ahmad");
        gardeners.add("ali");
        Tree first_sarv = client.makeSarv(10, gardeners);
        Tree second_sarv = first_sarv.copy();
        first_sarv.add_gardener("mohammad");
        Assert.assertEquals(second_sarv.age, first_sarv.age);
        Assert.assertNotEquals(second_sarv.get_gardeners(), first_sarv.get_gardeners());
        Assert.assertEquals(first_sarv.get_gardeners(), gardeners);
        gardeners = new ArrayList<>();
        gardeners.add("ahmad");
        gardeners.add("ali");
        Assert.assertEquals(second_sarv.get_gardeners(), gardeners);
    }

    @Test
    public void testCopyChenar_WHEN_addingGardener_toSecond(){
        Client client = new Client();
        ArrayList<String> gardeners = new ArrayList<>();
        gardeners.add("ahmad");
        gardeners.add("ali");
        Tree first_chenar = client.makeChenar(10, gardeners);
        Tree second_chenar = first_chenar.copy();
        second_chenar.add_gardener("mohammad");
        Assert.assertEquals(second_chenar.age, first_chenar.age);
        Assert.assertNotEquals(second_chenar.get_gardeners(), first_chenar.get_gardeners());
        Assert.assertEquals(first_chenar.get_gardeners(), gardeners);
        gardeners.add("mohammad");
        Assert.assertEquals(second_chenar.get_gardeners(), gardeners);
    }

    @Test
    public void testCopySarv_WHEN_addingGardener_toSecond(){
        Client client = new Client();
        ArrayList<String> gardeners = new ArrayList<>();
        gardeners.add("ahmad");
        gardeners.add("ali");
        Tree first_sarv = client.makeSarv(10, gardeners);
        Tree second_sarv = first_sarv.copy();
        second_sarv.add_gardener("mohammad");
        Assert.assertEquals(second_sarv.age, first_sarv.age);
        Assert.assertNotEquals(second_sarv.get_gardeners(), first_sarv.get_gardeners());
        Assert.assertEquals(first_sarv.get_gardeners(), gardeners);
        gardeners.add("mohammad");
        Assert.assertEquals(second_sarv.get_gardeners(), gardeners);
    }

}
