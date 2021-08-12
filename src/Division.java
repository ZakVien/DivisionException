
import javax.swing.JOptionPane;

/**
 *
 * @author Zach
 */

public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerator = 0;
        int divisor = 0;
        int result = 0;

        try {
            numerator = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number to be divided."));
            divisor = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number to divide into " + numerator));
            result = numerator / divisor;
        } catch (ArithmeticException error) {
            JOptionPane.showMessageDialog(null, "Division cannot be performed. Cannot divide by " + divisor);
            result = 0;
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Invalid entry. Entry must be a number.");
            result = 0;
        }
        JOptionPane.showMessageDialog(null, "Your result is " + result);
    }

}
