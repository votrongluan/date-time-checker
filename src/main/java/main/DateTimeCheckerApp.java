package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DateTimeCheckerApp extends JFrame {
    private JTextField dayEntry;
    private JTextField monthEntry;
    private JTextField yearEntry;

    public DateTimeCheckerApp() {
        setTitle("Date Time Checker");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Set to DO_NOTHING_ON_CLOSE

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                        DateTimeCheckerApp.this,
                        "Are you sure to exit?",
                        "Confirm Exit",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {
                    dispose();
                }
                // Do nothing if "No" is selected.
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel dayLabel = new JLabel("Day:");
        dayEntry = new JTextField();
        JLabel monthLabel = new JLabel("Month:");
        monthEntry = new JTextField();
        JLabel yearLabel = new JLabel("Year:");
        yearEntry = new JTextField();

        JButton checkButton = new JButton("Check Date");
        JButton clearButton = new JButton("Clear");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkButtonClicked();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearButtonClicked();
            }
        });

        panel.add(dayLabel);
        panel.add(dayEntry);
        panel.add(monthLabel);
        panel.add(monthEntry);
        panel.add(yearLabel);
        panel.add(yearEntry);

        add(panel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(clearButton);
        buttonPanel.add(checkButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DateTimeCheckerApp app = new DateTimeCheckerApp();
                app.setVisible(true);
            }
        });
    }

    private void checkButtonClicked() {
        String dayStr = dayEntry.getText();
        String monthStr = monthEntry.getText();
        String yearStr = yearEntry.getText();

        if (DateTimeChecker.checkDate(dayStr, monthStr, yearStr)) {
            JOptionPane.showMessageDialog(
                    this,
                    DateTimeChecker.message,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    DateTimeChecker.message,
                    "Message",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void clearButtonClicked() {
        dayEntry.setText("");
        monthEntry.setText("");
        yearEntry.setText("");
    }

    private boolean checkDate(String day, String month, String year) {
        return DateTimeChecker.checkDate(day, month, year);
    }
}
