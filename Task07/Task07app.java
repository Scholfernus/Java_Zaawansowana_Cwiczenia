package pl.sdajavapol141.Task07;

import java.util.ArrayList;
import java.util.List;

public class Task07app {
    public static void main(String[] args) {

        CartidgeBox box = new CartidgeBox(6);
        System.out.println(box.isLoaded());
        box.loadBullet("Load bullets 1");
        box.loadBullet("Load bullets 2");
        box.loadBullet("Load bullets 3");
        box.loadBullet("Load bullets 4");
        box.loadBullet("Load bullets 5");
        box.loadBullet("Load bullets 6");
        System.out.println(box.isLoaded());
        System.out.println(box);
        box.shot();
        box.shot();
        boolean loaded = box.isLoaded();
        System.out.println("Box is loaded ? " + loaded);
        box.shot();
    }
}
