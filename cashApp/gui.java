import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class gui extends Application{
    Button button;
    public static void main(String[] args) {
     launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("CashApp");
        button=new Button();
        button=setText("Start here");

        StackPane layouStackPane=new StackPane();
        Parent layout;
        layout.getChildren().add(button);

        Scene scene= new Scene(layout, 250, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button setText(String string) {
        return null;
    }
}