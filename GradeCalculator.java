import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;

public class GradeCalculator {
    private JButton calculateButton;
    private JTextField textStudentName;
    private JTextField textMilestone1;
    private JTextField textMilestone2;
    private JTextField textTermAs;
    private JTextField textTotal;
    private JTextField textAve;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GradeCalculator");
        frame.setContentPane(new GradeCalculator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public GradeCalculator() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1, m2,ta,total;
                double avg;

                m1=Integer.parseInt(textMilestone1.getText());
                m2=Integer.parseInt(textMilestone2.getText());
                ta=Integer.parseInt(textTermAs.getText());

                total=m1+m2+ta;

                textTotal.setText(String.valueOf(total));

                avg = total/3;
                textAve.setText(String.valueOf(avg));

            }
        });
    }
}



