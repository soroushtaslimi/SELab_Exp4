import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ClientTest {

    @Test
    public void testMakeTree_WHEN_JapaneseFactory_length12(){
        GardenCreator gardenCreator = new JapaneseGardenCreator();
        Client client = new Client(gardenCreator);
        Tree tree = client.makeTree(12);

        Assert.assertTrue(tree instanceof JapaneseTree);
        int length = tree.getLength();
        Assert.assertEquals(12, length);
    }

    @Test
    public void testMakeFlower_WHEN_JapaneseFactory_length5(){
        GardenCreator gardenCreator = new JapaneseGardenCreator();
        Client client = new Client(gardenCreator);
        Flower flower = client.makeFlower(5);

        Assert.assertTrue(flower instanceof JapaneseFlower);
        int length = flower.getLength();
        Assert.assertEquals(5, length);
    }

    @Test
    public void testMakeTree_WHEN_IranianFactory_length30(){
        GardenCreator gardenCreator = new IranianGardenCreator();
        Client client = new Client(gardenCreator);
        Tree tree = client.makeTree(30);

        Assert.assertTrue(tree instanceof ChenarTree);
        int length = tree.getLength();
        Assert.assertEquals(30, length);
    }

    @Test
    public void testMakeFlower_WHEN_IranianFactory_length4(){
        GardenCreator gardenCreator = new IranianGardenCreator();
        Client client = new Client(gardenCreator);
        Flower flower = client.makeFlower(4);

        Assert.assertTrue(flower instanceof KhatmiFlower);
        int length = flower.getLength();
        Assert.assertEquals(4, length);
    }
}
