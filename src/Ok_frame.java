import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Госпожа Пресс-Служба on 12.02.2016.
 */
public class Ok_frame {
    public Ok_frame(){

    }

    public void start() {
        JFrame secondFrame = new JFrame("No more shit!");
        secondFrame.setBounds(500, 200, 300, 150);

        JLabel labelok = new JLabel("<html>"+"Это дерьмо уничтожено,<br>"+ "можешь забыть про него!"+"</html>");
        JPanel lableb = new JPanel();
        labelok.setHorizontalAlignment(JLabel.CENTER);
        labelok.setVerticalAlignment(JLabel.CENTER);
        BorderLayout border = new BorderLayout();
        secondFrame.setLayout(border);

        JButton ok = new JButton("ОК");
        JButton more = new JButton("У меня есть еще кое-что");
        more.addActionListener(e -> secondFrame.dispose());
        ok.addActionListener(e -> System.exit(0));
        lableb.add(ok);
        lableb.add(more);

        secondFrame.add(labelok,BorderLayout.NORTH);
        secondFrame.add(lableb,BorderLayout.SOUTH);

        secondFrame.setVisible(true);
    }
}
