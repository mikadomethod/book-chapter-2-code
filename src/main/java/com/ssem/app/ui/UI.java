package com.ssem.app.ui;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI {

    private final JFrame frame;

    public UI() {
        frame = new JFrame();
    }

    public void showLogin(FileDbUserRepo repo) {
        List<String> roles = repo.fetchAll();
        addLoginSelector(roles);
        addButtons();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private void addLoginSelector(List<String> users) {
        JComboBox combo = new JComboBox(users.toArray());
        frame.setLayout(new GridBagLayout());
        frame.add(combo);
    }

    private void addButtons() {
        JPanel buttons = new JPanel(new FlowLayout());
        buttons.add(actionButton(exitAction("Cancel")));
        buttons.add(actionButton(getLoginAction("Login")));
        frame.add(buttons);
    }

    private AbstractAction exitAction(String label) {
        return new AbstractAction(label) {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
    }

    private JButton actionButton(AbstractAction action) {
        return new JButton(action);
    }

    private AbstractAction getLoginAction(String label) {
        return new AbstractAction(label) {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Logging in");
                ;
            }
        };
    }
}
