package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> bucketOfFlowers;
    private double bucketPrice;
    public FlowerBucket(ArrayList<FlowerPack> packOfFlowers) {
        // when we already have a pack
        this.bucketOfFlowers = packOfFlowers;
    }
    public FlowerBucket() {
        // empty flower bucket
        this.bucketOfFlowers = new ArrayList<FlowerPack>();
    }
    public void add(FlowerPack flowerPack) {
        bucketOfFlowers.add(flowerPack);
        bucketPrice += flowerPack.getPrice();
    }

    public double getPrice() {
        return bucketPrice;
    }


}
