import javax.swing.JFrame;

/**
 * Swing
 */
public class Swing {

    public static void main(String[] args) {
        
        // JFrame = a GUI window to add components to
        
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Jrame title goes here"); // sets title of frame
        frame.setVisible(false); // prevent frame from being resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setSize(420, 420); // sets the x-dimension and y-dimension of frame
        frame.setVisible(true); // make frame visible
    }
}
