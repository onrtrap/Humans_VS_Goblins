import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

public class TopLevelWindow {
    public static void createWindow() throws BadLocationException {
        JFrame frame = new JFrame("Humans Vs Goblins");
        frame.setBounds(100,100, 500,500);
        String map = "";
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        Scanner in = new Scanner(System.in);
        boolean end = false;
        int xPos = 7;
        int yPos = 7;
        String grid[][] = new String[14][28];
        for (int j = 0; j < 28; j++) {
            for (int i = 0; i < 14; i++) {
                    grid[i][j] = "~";
                }
            }
        //grid[7][7] = "A";
        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");
        for (int k = 0; k < 14; k++) {
            map = "";
            for (int g = 0; g < 28; g++) {
                map += (grid[k][g]);
            }
            appendString("\n" + map, textPane);
        }
        //JLabel textLabel = new JLabel(map, SwingConstants.CENTER);
        //textLabel.setPreferredSize(new Dimension(800,800));

        //textPane.setText(map);
        frame.getContentPane().add(textPane, BorderLayout.CENTER);
        //frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        /**
        while (!end) {
            String input = in.next();
            grid[xPos][yPos] = "-";
            switch (input) {
                case "W":
                    xPos--;
                    break;
                case "A":
                    yPos--;
                    break;
                case "S":
                    xPos++;
                    break;
                case "D":
                    yPos++;
                    break;
                case "Q":
                    end = true;
                    break;
            }
            //grid[xPos][yPos] = "A";
            // System.out.print("\033[H\033[2J");
            //System.out.flush();
            for (int u = 0; u < 14; u++) {
                System.out.print("\n");
                for (int q = 0; q < 14; q++) {
                    System.out.print(grid[u][q]);
                }
            }
        }
        in.close();**/

    }
    public static void appendString(String str, JTextPane jTextPane) throws BadLocationException
    {
        StyledDocument document = (StyledDocument) jTextPane.getDocument();
        document.insertString(document.getLength(), str, null);
        // ^ or your style attribute
    }
}
