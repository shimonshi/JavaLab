
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class lab5 extends JFrame{
    JLabel pic;
    Timer tm;
    int x = 0;

    String[] list = {
            "C://Users//User//Desktop//gif//1.png",//0
            "C://Users//User//Desktop//gif//2.png",//1
            "C://Users//User//Desktop//gif//3.png",//2
            "C://Users//User//Desktop//gif//4.png",//3
            "C://Users//User//Desktop//3.png",//4
            "C://Users//User//Desktop//2.png",//5
            "C://Users//User//Desktop//1.png",//6
    };

    public lab5(){
        super("Чимидов Э.Э ИКБО-16-17");
        pic = new JLabel();
        pic.setBounds(40, 30, 400, 400);
        SetImageSize(6);
        tm = new Timer(50, e -> {
            SetImageSize(x);
            x += 1;
            if(x >= list.length )
                x = 0;
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(800, 400);
        getContentPane().setBackground(Color.decode("#FFFFFF"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

    public static void main(String[] args){
        new lab5();
    }
}
