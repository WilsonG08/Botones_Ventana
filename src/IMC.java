import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMC {
    private JPanel panel1;
    private JLabel Pesoo;
    private JTextField peso;
    private JLabel Alturaa;
    private JTextField alturaaa;
    private JButton CALCULARButton;
    private JLabel LabelTotal;


    public IMC() {
        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                double a = Double.parseDouble(peso.getText());
                double b = Double.parseDouble(alturaaa.getText());

                LabelTotal.setText("EL peso es:"+a*b);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("IMC");
        frame.setContentPane(new IMC().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
