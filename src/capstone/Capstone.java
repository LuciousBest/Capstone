package capstone;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Marvin
 */
public class Capstone {
    
    public Capstone() {
        
        Gui gui = new Gui();
        
        JFrame window = new JFrame("Rune Calculator");
        window.setContentPane(gui);
        window.pack(); 
        
        int width = 420;
        int height = 550;
        int x = (int) ((window.getWidth())/2 + 300);
        int y = (int) ((window.getHeight())/2 - 100);

        Dimension alteredScreenSize = new Dimension(width, height);
        window.setLocation(x,y);
        window.setSize(alteredScreenSize);
        window.setResizable(false); 
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setVisible(true);
}
    
    private int level; //X is level
    private int runes; //y is runes
    
        
    public void runeCalc(int level) {
        this.level = level;
        runes = (int) ((0.02 * Math.pow(level, 3)) + (3.06 * Math.pow(level, 2)) + ((105.6 * level) - 895));
        System.out.println("Level: " + --level + "= " + runes);
    }

    public int getRunes() {
        return runes;
    }

    public void setRunes(int runes) {
        this.runes = runes;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        
        Capstone test = new Capstone();
         test.runeCalc(2);
         test.runeCalc(3);
//         test.runeCalc(4);
//         test.runeCalc(5);
//         test.runeCalc(6);
//         test.runeCalc(7);
//         test.runeCalc(8);
//         test.runeCalc(9);
//         test.runeCalc(10);
//         test.runeCalc(11);
         test.runeCalc(12);
//         test.runeCalc(13);
//         test.runeCalc(14);
//         test.runeCalc(15);
//         test.runeCalc(16);
//         test.runeCalc(17);
//         test.runeCalc(18);
         test.runeCalc(19);
         test.runeCalc(20);
      
    }

}
