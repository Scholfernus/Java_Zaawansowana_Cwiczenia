package pl.sdajavapol141.Task07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CartidgeBox {
    private int capacity;
    private List<String> bullets;

    public CartidgeBox(int capacity) {
        this.capacity = capacity;
        this.bullets = new ArrayList<>(capacity);
    }

    void loadBullet(String bullet) {
        if (bullets.size() < capacity) {
            bullets.add(bullet);
        } else {
            System.out.println("No more space for bullets");
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
        }

    @Override
    public String toString() {
        return "CartidgeBox{" +
                "capacity=" + capacity +
                ", bullets=" + bullets +
                '}';
    }

    public void shot () {
            if (isLoaded()) {
                System.out.println(bullets.get(0));
                bullets.remove(0);
                System.out.println("Pozostało " + bullets.size() + " kul");
            } else {
                System.out.println("No bullets loaded");
            }
        }
    }
