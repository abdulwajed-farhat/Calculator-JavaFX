import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
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

        GridPane root = new GridPane();

        root.setHgap(10);
        root.setVgap(10);

        Label value1 = new Label("Value 1: ");
        Label value2 = new Label("Value 2: ");
        Label result = new Label("Result: ");
        Label resultBox = new Label();

        TextField value1Box = new TextField();
        TextField value2Box = new TextField();
        

        Button calButton = new Button("Calculate Sum");

        root.add(value1, 0, 0);
        root.add(value2, 0, 1);
        root.add(result, 0, 3);
        root.add(value1Box, 1, 0);
        root.add(value2Box, 1, 1);
        root.add(resultBox, 1, 3);
        root.add(calButton,1,2);

        calButton.setOnAction(e ->{
            int firstNumber = Integer.parseInt(value1Box.getText());
            int secondNumber = Integer.parseInt(value2Box.getText());
            int resultNumber = firstNumber + secondNumber;
            resultBox.setText(Integer.toString(resultNumber));

        });
        

        Scene scene = new Scene(root , 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

       
            
        
       
    }
    public static void main(String[] args) throws Exception {
        launch (args);
    }
}
