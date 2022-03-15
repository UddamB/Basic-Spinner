import javax.swing.SpinnerListModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SpinnerTest extends JFrame{
    SpinnerModel spinnerModel1, spinnerModel2, spinnerModel3;
    JLabel label = new JLabel();
    String [] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"};
    JSpinner spinner1, spinner2, spinner3;

    public SpinnerTest(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        String str = String.valueOf(java.time.Year.now());
        int year = Integer.parseInt(str);

        label.setBounds(300,600,250,90);
        add(label);
        spinnerModel1 = new SpinnerNumberModel(1, 1, 31, 1);
        spinner1 = new JSpinner(spinnerModel1);
        spinnerModel2 = new SpinnerListModel(months);
        add(spinner1);
        spinnerModel3 = new SpinnerNumberModel(year, year-100, year,1);
        spinner2 = new JSpinner(spinnerModel2);
        add(spinner2);
        spinner3 = new JSpinner(spinnerModel3);
        add(spinner3);


        spinner1.setBounds(200, 50,120,40);
        spinner3.setBounds(200, 210,120,40);
        spinner2.setBounds(200, 120,120,40);
        validate();
    }
}