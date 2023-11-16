import javax.swing.*;

public class App extends JFrame {

    public App() {
        Home home = new Home();
        this.add(home);
        this.setTitle("Name of the App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
