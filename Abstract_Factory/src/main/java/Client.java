public class Client {
    GardenCreator gardenCreator;

    public Client(GardenCreator gardenCreator){
        this.gardenCreator = gardenCreator;
    }

    public Tree makeTree(int length){
        Tree tree = gardenCreator.createTree();
        tree.setLength(length);
        return tree;
    }

    public Flower makeFlower(int length){
        Flower flower = gardenCreator.createFlower();
        flower.setLength(length);
        return flower;
    }
}
