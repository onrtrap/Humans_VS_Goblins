import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;


public class TopLevelWindow {
    static JFrame frame = new JFrame();
    static String grid[][] = new String[0][0];
    static JTextPane textPane = new JTextPane();
    static String map;
    public TopLevelWindow() throws BadLocationException {
        JFrame frame = new JFrame("Humans Vs Goblins");
        frame.setBounds(100,100, 500,500);
        String map = "";
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

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
    }
    public static void createWindow() throws BadLocationException {




    }
    public static void appendString(String str, JTextPane jTextPane) throws BadLocationException
    {
        StyledDocument document = (StyledDocument) jTextPane.getDocument();
        document.insertString(document.getLength(), str, null);
        // ^ or your style attribute
    }
    public static void navigation() throws IOException, BadLocationException {
        boolean end = false;
        String t;
        int xPos = 7;
        int yPos = 7;
         while (!end) {
             t = (String) JOptionPane.showInputDialog("");
         grid[xPos][yPos] = "@";
         switch (t) {
         case "w":
         xPos--;
             textPane.setText("");
             for (int k = 0; k < 14; k++) {
                 map = "";
                 for (int g = 0; g < 28; g++) {
                     map += (grid[k][g]);
                 }
                 appendString("\n" + map, textPane);
             }
         break;
         case "a":
         yPos--;
             textPane.setText("");
             for (int k = 0; k < 14; k++) {
                 map = "";
                 for (int g = 0; g < 28; g++) {
                     map += (grid[k][g]);
                 }
                 appendString("\n" + map, textPane);
             }
         break;
         case "s":
         xPos++;
             textPane.setText("");
             for (int k = 0; k < 14; k++) {
                 map = "";
                 for (int g = 0; g < 28; g++) {
                     map += (grid[k][g]);
                 }
                 appendString("\n" + map, textPane);
             }
         break;
         case "d":
         yPos++;
             textPane.setText("");
             for (int k = 0; k < 14; k++) {
                 map = "";
                 for (int g = 0; g < 28; g++) {
                     map += (grid[k][g]);
                 }
                 appendString("\n" + map, textPane);
             }
         break;
         case "Q":
         end = true;
         break;
         }

         }
    }
}
