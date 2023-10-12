package flower.store;

import java.util.ArrayList;

public class Store {
    private ArrayList<Flower> flowerList;
    private ArrayList<FlowerPack> flowerPackList;
    private ArrayList<FlowerBucket> flowerBucketList;

    private ArrayList<Flower> flowerPurchase;
    private ArrayList<FlowerPack> flowerPackPurchase;
    private ArrayList<FlowerBucket> flowerBucketPurchase;

    public Store() {
        this.flowerPurchase = new ArrayList<Flower>();
        this.flowerPackPurchase = new ArrayList<FlowerPack>();
        this.flowerBucketPurchase = new ArrayList<FlowerBucket>();

        this.flowerList = new ArrayList<Flower>();
        this.flowerPackList = new ArrayList<FlowerPack>();
        this.flowerBucketList = new ArrayList<FlowerBucket>();

    }

    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPackList.add(flowerPack);
    }

    public void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBucketList.add(flowerBucket);
    }

    public ArrayList<Flower> makeFlowerPurchase(
            int minPrice, int maxPrice) {
        if (!this.flowerList.isEmpty()) {
            this.flowerList.clear();
        }
        for (Flower flower: flowerList) {
            if (flower.getPrice() >= minPrice
                    && flower.getPrice() <= maxPrice) {
                this.flowerList.add(flower);
            }
        }
        return this.flowerList;
    }

    public ArrayList<FlowerPack> makeFlowerPackPurchase(
            int minPrice, int maxPrice) {
        if (!this.flowerPackList.isEmpty()) {
            this.flowerPackList.clear();
        }
        for (FlowerPack flowerPack: flowerPackList) {
            if (flowerPack.getPrice() >= minPrice
                    && flowerPack.getPrice() <= maxPrice) {
                this.flowerPackList.add(flowerPack);
            }
        }
        return this.flowerPackList;
    }

    public ArrayList<FlowerBucket> makeFlowerBucketPurchase(
            int minPrice, int maxPrice) {
        if (!this.flowerBucketList.isEmpty()) {
            this.flowerBucketList.clear();
        }
        for (FlowerBucket flowerBucket: flowerBucketList) {
            if (flowerBucket.getPrice() >= minPrice
                    && flowerBucket.getPrice() <= maxPrice) {
                this.flowerBucketList.add(flowerBucket);
            }
        }
        return this.flowerBucketList;
    }
}
