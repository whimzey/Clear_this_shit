import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ������� �����-������ on 21.04.2015.
 */
public class GUI {
    private JTextArea textArea;
    public void buildGUI() {
        JFrame mainFrame = new JFrame("Clear this shit!");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(500, 200, 350, 500);
BorderLayout border = new BorderLayout();
        mainFrame.setLayout(border);
        textArea = new JTextArea();
        JButton clearbutton = new JButton("Уничтожить это дерьмо!");

        JLabel label = new JLabel("Напиши все, что накипело. А потом уничтожь это!");
label.setPreferredSize(new Dimension(350,50));
        label.setHorizontalAlignment(JLabel.CENTER);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        mainFrame.add(label, BorderLayout.NORTH);
        mainFrame.add(textArea, BorderLayout.CENTER);
        mainFrame.add(clearbutton, BorderLayout.SOUTH);
        clearbutton.addActionListener(new ClearButtonActionListener());
        mainFrame.setVisible(true);
            }
    public class ClearButtonActionListener implements ActionListener{
@Override
        public void actionPerformed (ActionEvent e){
    textArea.setText("");
    Ok_frame ok = new Ok_frame();
    ok.start();
}
    }
        }
