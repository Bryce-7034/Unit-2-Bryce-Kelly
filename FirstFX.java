import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application{

  public void start(Stage stage){
    Text start = new Text(30, 50, "Hello, how are you?");
    Text response = new Text(170, 50, "I'm good, how are you?");
    Rectangle box1 = new Rectangle(15, 20, 130, 60);
    Rectangle box2 = new Rectangle(150, 20, 170, 60);
    Ellipse ellipse1 = new Ellipse(75, 150, 75, 25);
    Circle circle2 = new Circle(50, 150, 15);
    Circle circle3 = new Circle(100, 150, 15);
    Polygon polygon1 = new Polygon(100, 170, 75, 175, 160, 200);

    box1.setStroke(Color.RED);
    box1.setFill(null);

    box2.setStroke(Color.GREEN);
    box2.setFill(null);

    ellipse1.setStroke(Color.BLACK);
    ellipse1.setFill(Color.RED);


    Group root = new Group(start, response, box1, box2, ellipse1, circle2);
    Group root2 = new Group(root, polygon1, circle3);
    Scene scene = new Scene(root2, 400, 250, Color.LIGHTBLUE);

    stage.setTitle("FXFirst");
    stage.setScene(scene);
    stage.show();
  }
}
