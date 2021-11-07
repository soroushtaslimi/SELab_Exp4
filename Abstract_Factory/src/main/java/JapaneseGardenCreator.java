public class JapaneseGardenCreator extends GardenCreator{
    @Override
    public Tree createTree() {
        return new JapaneseTree();
    }

    @Override
    public Flower createFlower() {
        return new JapaneseFlower();
    }
}
