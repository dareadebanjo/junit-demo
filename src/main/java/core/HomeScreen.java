package core;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HomeScreen extends Application {
	Button solutionBtn;
	TextField leftOpBox;
	TextField rightOpBox;
	TextField answerBox;
	ComboBox<String> operatorDropdown;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		initUI(primaryStage);
	}

	private void initUI(Stage primaryStage) {
		Pane canvas = new Pane();
		//canvas.setStyle("-fx-background-color: black");
		
		addControlsToCanvas(canvas);
		
		Scene scene = new Scene(canvas, 320, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Simple Calculator App");
		primaryStage.show();
	}

	private void addControlsToCanvas(Pane canvas) {
		int row1 = 20;
		int row2 = 60;
		int maxWidth = 60;
		
		Label label = new Label("Simple Calculator Using JavaFX");
		label.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
		label.relocate(20, row1);
		
		leftOpBox = new TextField();
		leftOpBox.setMaxWidth(maxWidth);
		leftOpBox.relocate(20, row2);
		
		operatorDropdown = new ComboBox<String>();
		operatorDropdown.getItems().addAll("+","-","x","/","%");
		operatorDropdown.setValue("+");
		operatorDropdown.relocate(80, row2);
		
		rightOpBox = new TextField();
		rightOpBox.setMaxWidth(maxWidth);
		rightOpBox.relocate(140, row2);
		
		solutionBtn = new Button("=");
		solutionBtn.relocate(200, row2);
		
		answerBox = new TextField();
		answerBox.setMaxWidth(maxWidth);
		answerBox.setEditable(false);
		answerBox.relocate(220, row2);
		
		setSolutionButtonClickHandler();
		
		canvas.getChildren().addAll(label, leftOpBox, rightOpBox, operatorDropdown, solutionBtn, answerBox);
		
	}

	private void setSolutionButtonClickHandler() {
		solutionBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Double leftOp = Double.valueOf(leftOpBox.getText());
				Double rightOp = Double.valueOf(rightOpBox.getText());
				String operator = operatorDropdown.getValue();
				
				ArithmeticSolver solver = new ArithmeticSolver();
				String answer =  String.valueOf(solver.solve(operator, leftOp, rightOp));
				
				answerBox.setText(answer);
			}
			
		});
	}
	
}