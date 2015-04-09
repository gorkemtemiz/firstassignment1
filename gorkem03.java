package cmpe272;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class gorkem03 extends JFrame {

	private JLabel FirstLabel, SecondLabel, ThirdLabel, FourthLabel,
			FifthLabel, Select;

	private JButton Preview, Reset, Save, Exit;

	private JRadioButton UPPERCASE, lowercase;

	private ButtonGroup group;

	private JTextField area1, area2, area3, area4, area5;

	public gorkem03() {

		setSize(400, 500);

		setLayout(new GridLayout(8, 2));

		FirstLabel = new JLabel("University");

		SecondLabel = new JLabel("Department");

		ThirdLabel = new JLabel("Name");

		FourthLabel = new JLabel("Last Name");

		FifthLabel = new JLabel("Student ID");

		Select = new JLabel("Select");

		Preview = new JButton("Preview");

		Preview.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (lowercase.isSelected())
					JOptionPane.showMessageDialog(null, "University: "
							+ area1.getText().toLowerCase() + "\nDepartment: "
							+ area2.getText().toLowerCase() + "\nName: "
							+ area3.getText().toLowerCase() + "\nLast Name: "
							+ area4.getText().toLowerCase() + "\nStudent ID: " 
							+ area5.getText().toLowerCase());
				 else {
				     JOptionPane.showMessageDialog(null, "University: "
						+ area1.getText().toUpperCase() + "\nDepartment: "
						+ area2.getText().toUpperCase() + "\nName: "
						+ area3.getText().toUpperCase() + "\nLast Name: "
						+ area4.getText().toUpperCase() + "\nStudent ID: " 
						+ area5.getText().toUpperCase());
			}

			}});

		Reset = new JButton("Reset");

		Save = new JButton("Save");

		Exit = new JButton("Exit");

		area1 = new JTextField();

		area2 = new JTextField();

		area3 = new JTextField();

		area4 = new JTextField();

		area5 = new JTextField();

		UPPERCASE = new JRadioButton("UPPERCASE");

		lowercase = new JRadioButton("lowercase");

		JPanel p = new JPanel(new GridLayout(1, 2));

		p.add(UPPERCASE);

		p.add(lowercase);

		group = new ButtonGroup();

		group.add(UPPERCASE);

		group.add(lowercase);

		add(FirstLabel);

		add(area1);

		add(SecondLabel);

		add(area2);

		add(ThirdLabel);

		add(area3);

		add(FourthLabel);

		add(area4);

		add(FifthLabel);

		add(area5);

		add(Select);

		add(p);

		add(Preview);

		add(Reset);

		add(Save);

		Save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter("log.txt", true);
						fw.write (area1.getText() + "\n" + area2.getText() + "\n" + area3.getText() + "\n" +area4.getText() + "\n" + area5.getText());
						fw.flush();
						fw.close(); }
				catch (Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		
	
			
					
		
		
		add(Exit);

		setVisible(true);

	}

	private FileWriter FileWriter(String string, boolean b) {
		
		return null;
	}

	public static void main(String[] args) {

		new gorkem03();

	}

}