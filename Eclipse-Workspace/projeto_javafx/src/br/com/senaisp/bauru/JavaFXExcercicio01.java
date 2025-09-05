package br.com.senaisp.bauru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class JavaFXExcercicio01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group noRoot = new Group();
		criarComponentes(noRoot);
		
		Scene cena = new Scene(noRoot,800,600,Color.DARKMAGENTA);
		primaryStage.setTitle("Itens JavaFX");
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}

	private void criarComponentes(Group noRoot) {
		HBox cmp01 = new HBox();
		Rectangle cmp02 = new Rectangle(100,100,Color.AQUA);
		Text cmp03 = new Text("Dorm 6:\n200");
		ImageView cmp04 = new ImageView();
		cmp04.setFitWidth(100);
		cmp04.setPreserveRatio(true);
		Button btn01 = new Button("Say 'Hello World'");
		Button btn02 = new Button("222");
		Button btn03 = new Button("33333");
		noRoot.getChildren().addAll(cmp01,cmp02,cmp03,cmp04);
		cmp01.getChildren().addAll(btn01,btn02,btn03);
		cmp01.setLayoutY(300);
		cmp01.setPrefWidth(600);
		cmp04.setLayoutX(290);
		cmp04.setLayoutY(10);
		//https://docs.oracle.com/javafx/2/text/jfxpub-text.htm
		
		cmp03.setLayoutX(150);
		cmp03.setLayoutY(200);
		cmp03.setFont(Font.font("Verdana",FontWeight.BOLD,30));
		cmp03.setFill(Color.RED);
		cmp03.setTextAlignment(TextAlignment.CENTER);
		cmp03.setStroke(Color.BLACK);
		cmp03.setStrokeWidth(5);
		cmp03.setStrokeType(StrokeType.OUTSIDE);
		cmp03.setStrokeLineCap(StrokeLineCap.ROUND);
		cmp03.setStrokeLineJoin(StrokeLineJoin.ROUND);
		DropShadow ds = new DropShadow();
		ds.setColor(Color.BLACK);
		cmp03.setEffect(ds);
		
		cmp02.setLayoutX(10);
		cmp02.setLayoutY(10);
		cmp02.setStroke(Color.ORANGE);
		cmp02.setStrokeWidth(10);
		
		HBox.setHgrow(btn01, Priority.ALWAYS);
		HBox.setHgrow(btn02, Priority.ALWAYS);
		HBox.setHgrow(btn03, Priority.ALWAYS);
		
		btn01.setMaxWidth(Double.MAX_VALUE);
		btn02.setMaxWidth(Double.MAX_VALUE);
		btn03.setMaxWidth(Double.MAX_VALUE);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
