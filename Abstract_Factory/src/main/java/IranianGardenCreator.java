public class IranianGardenCreator extends GardenCreator{
    @Override
    public Tree createTree() {
        return new ChenarTree();
    }

    @Override
    public Flower createFlower() {
        return new KhatmiFlower();
    }
}
