package pl.sdajavapol141.Task09;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;


public class Task09app extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        MyCircle circle = new MyCircle(new Point2D(100,100), new Point2D(100,50));
        circle.setFill(Color.BLUE);
        circle.setStrokeWidth(3);
        circle.setStroke(Color.RED);
        AtomicReference<String> info = new AtomicReference<>("Obwód =" + circle.getPerimeter() + ", Pole =" + circle.getArea());
        Text text = new Text(10,20, info.get());
        root.getChildren().addAll(circle,text);
        Scene scene = new Scene(root,400,600);
        scene.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()){
                case RIGHT :
                    circle.getTransforms().add(Transform.translate(10,0));
                    break;
                case LEFT:
                    circle.getTransforms().add(Transform.translate(-10,0));
                    break;
                case DOWN:
                    circle.getTransforms().add(Transform.translate(0,10));
                    break;
                case UP:
                    circle.getTransforms().add(Transform.scale(2.2,2.2));
                    info.set("Obwód =" + circle.getPerimeter() + ", Pole =" + circle.getArea());
                    text.setText(info.get());
                case DELETE:
                    circle.getTransforms().clear();
                    break;
            }
        });
        stage.setScene(scene);
        stage.show();
    }
}
