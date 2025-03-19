import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;



public class Main extends Application {
    int firstNumber = 0;
    int secondNumber = 0;

    @Override
    public void start (Stage primaryStage){
        FlowPane root = new FlowPane();

        
        
        Button button1 = new Button("1");
        button1.setPrefSize(40, 40);

        Button button2 = new Button("2");
        button1.setPrefSize(40, 40);

        Button calButton = new Button(" + ");
        calButton.setPrefSize(80, 80);

        Label label = new Label();
        label.setText("Result");

        button1.setOnAction(e -> firstNumber = 1);
        button1.setOnAction(e -> secondNumber = 2);

        calButton.setOnAction(e -> {
            int resultNumber = firstNumber + secondNumber;
            label.setText(Integer.toString(resultNumber));
        });
    
        
        root.getChildren().addAll(button1, button2, calButton, label);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

       
            
        
       
    }
    public static void main(String[] args) throws Exception {
        launch (args);
    }
}
