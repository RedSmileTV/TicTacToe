import java.awt.event.ActionEvent;

public class Buttons {
    public static void btn1Clicked(ActionEvent event) {
        GUI.label1.setText("X");
        GUI.btn1.setVisible(false);
        Main.availableFields.remove("1");
        Main.fieldChecker();
    }
}
