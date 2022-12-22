import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<Integer> availableFields = new ArrayList<Integer>();
    public static void main(String[] args) {
        availableFields.add(0, 1);
        availableFields.add(1, 2);
        availableFields.add(2, 3);
        availableFields.add(3, 4);
        availableFields.add(4, 5);
        availableFields.add(5, 6);
        availableFields.add(6, 7);
        availableFields.add(7, 8);
        availableFields.add(8, 9);
        new GUI();
    }
    public static int enemyTurn() {
        int enemyIndex = new Random().nextInt(Main.availableFields.size() + 1);
        return Main.availableFields.get(enemyIndex);
    }
    public static void fieldChecker() {
        int enemyIndex = Main.enemyTurn();

        switch (enemyIndex) {

            case 1:
                GUI.label1.setText("O");
                GUI.btn1.setVisible(false);
                Main.availableFields.remove("1");

            case 2:
                GUI.label2.setText("O");
                GUI.btn2.setVisible(false);
                Main.availableFields.remove("2");


            case 3:
                GUI.label3.setText("O");
                GUI.btn3.setVisible(false);
                Main.availableFields.remove("3");

            case 4:
                GUI.label4.setText("O");
                GUI.btn4.setVisible(false);
                Main.availableFields.remove("4");

            case 5:
                GUI.label5.setText("O");
                GUI.btn5.setVisible(false);
                Main.availableFields.remove("5");

            case 6:
                GUI.label6.setText("O");
                GUI.btn6.setVisible(false);
                Main.availableFields.remove("6");

            case 7:
                GUI.label7.setText("O");
                GUI.btn7.setVisible(false);
                Main.availableFields.remove("7");

            case 8:
                GUI.label8.setText("O");
                GUI.btn8.setVisible(false);
                Main.availableFields.remove("8");

            case 9:
                GUI.label9.setText("O");
                GUI.btn9.setVisible(false);
                Main.availableFields.remove("9");
        }
    }
}