package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GuestBook implements ActionListener {
	ArrayList<String> names = new ArrayList<String>();
	JButton button = new  JButton();
	JButton button2 = new JButton();
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		button.setText("Add Name");
		button2.setText("View Names");
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
	}
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.run();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String s = JOptionPane.showInputDialog("Enter a name:");
			names.add(s);
		}
		else {
			int num = 1;
			for (String name : names) {
				JOptionPane.showMessageDialog(null, "Guest #" + num + ": " + name);
				num++;
			}
		}
	}

	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
