import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swingTax {
    private JTextField price;
    private JTextField tax;
    private JTextField total;
    private JButton calculate;
    private JPanel taxPanel;

//    public ActionListener botonPulsado() {
//        return actionPerfomed(ActionEvent e) {
//
//        }
//    }
    public swingTax() {

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float precio = Float.parseFloat(price.getText());
                float iva = Float.parseFloat(tax.getText());
                iva = iva / 100;
                float precioAdicional = precio * iva;
                total.setText(Float.toString(precio + precioAdicional));
            }
        });
        price.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
//                price.setText(price.getText() + 'ñ');
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setContentPane(new swingTax().taxPanel);
        frame.setVisible(true);
    }
}
