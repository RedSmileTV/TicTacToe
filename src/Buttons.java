import java.awt.event.ActionEvent;

public class Buttons {
    public static void btn1Clicked(ActionEvent event) {
        GUI.label1.setText("X");
        GUI.btn1.setVisible(false);
        Main.availableFields.remove("1");
        Main.fieldChecker();
    }
    public static void btn2Clicked(ActionEvent event) {
        GUI.label2.setText("X");
        GUI.btn2.setVisible(false);
        Main.availableFields.remove("2");
        Main.fieldChecker();
    }
    public static void btn3Clicked(ActionEvent event) {
        GUI.label3.setText("X");
        GUI.btn3.setVisible(false);
        Main.availableFields.remove("3");
        Main.fieldChecker();
    }
    public static void btn4Clicked(ActionEvent event) {
        GUI.label4.setText("X");
        GUI.btn4.setVisible(false);
        Main.availableFields.remove("4");
        Main.fieldChecker();
    }
    public static void btn5Clicked(ActionEvent event) {
        GUI.label5.setText("X");
        GUI.btn5.setVisible(false);
        Main.availableFields.remove("5");
        Main.fieldChecker();
    }
    public static void btn6Clicked(ActionEvent event) {
        GUI.label6.setText("X");
        GUI.btn6.setVisible(false);
        Main.availableFields.remove("6");
        Main.fieldChecker();
    }
    public static void btn7Clicked(ActionEvent event) {
        GUI.label7.setText("X");
        GUI.btn7.setVisible(false);
        Main.availableFields.remove("7");
        Main.fieldChecker();
    }
    public static void btn8Clicked(ActionEvent event) {
        GUI.label8.setText("X");
        GUI.btn8.setVisible(false);
        Main.availableFields.remove("8");
        Main.fieldChecker();
    }
    public static void btn9Clicked(ActionEvent event) {
        GUI.label9.setText("X");
        GUI.btn9.setVisible(false);
        Main.availableFields.remove("9");
        Main.fieldChecker();
    }
}
