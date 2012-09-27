package com.ssem.app.ui;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ssem.app.db.Database;

public class UI {

	private List<String> users;
	private JFrame frame;

	public void init() {
		users = Database.load("users");
		frame = new JFrame();
	}

	
	public void showLogin() {
		JComboBox combo = new JComboBox(users.toArray());

		frame.setLayout(new GridBagLayout());
		frame.add(combo);
		JPanel buttons = new JPanel(new FlowLayout());
		buttons.add(actionButton(exitAction("Cancel")));
		buttons.add(actionButton(getLoginAction("Login")));
		frame.add(buttons);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}

	private AbstractAction exitAction(String label) {
		return new AbstractAction(label) {
			private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}};
	}

	private JButton actionButton(AbstractAction action) {
		return new JButton(action);
	}

	private AbstractAction getLoginAction(String label) {
		return new AbstractAction(label) {
			private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent e) {
				System.out.println("Logging in");;
			}};
	}
}
