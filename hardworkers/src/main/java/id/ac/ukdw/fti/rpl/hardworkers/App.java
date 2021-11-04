package id.ac.ukdw.fti.rpl.hardworkers;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Event & people of Bible engine search");
        stage.setScene(scene);
        stage.show();
    }

    public static void main( String[] args )
    {
        launch(args);
    }
}
