package org.mreposa.baggen.view;

import org.mreposa.baggen.GiantBagGenerator;
import org.mreposa.baggen.bagitem.GiantBagItem;

import javax.swing.*;
import java.awt.*;
import java.util.Set;
import java.awt.event.*;

public class BagGenFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    private static final String APP_TITLE = "AD&D G1-2-3 Giant Bag Generator";
    private static final String APP_VERSION = "1.0.0";
    private static final String ABOUT_MESSAGE = APP_TITLE + "\n" + "Version " + APP_VERSION + "\n" + "Michael Reposa\n" + "07-JUN-2024";

    private static final int PANEL_WIDTH = 800;
    private static final int PANEL_HEIGHT = 400;

    private final JMenuBar menuBar;
    private final JFrame frame;
    private final JEditorPane displayArea;

    public BagGenFrame() {
        super();

        JPanel basePanel;
        JPanel buttonPanel;
        JButton generateButton;

        this.frame = this;

        this.setTitle(APP_TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.menuBar = new JMenuBar();
        createFileMenu();
        createHelpMenu();
        this.setJMenuBar(this.menuBar);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                exitApp();
            }
        });

        basePanel = new JPanel();
        basePanel.setLayout(new BorderLayout());
        Dimension d = new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
        basePanel.setSize(d);
        basePanel.setPreferredSize(d);
        add(basePanel);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        generateButton = new JButton("Generate Giant Bag");
        Dimension bd = new Dimension(150, 20);
        generateButton.setSize(bd);
        generateButton.setPreferredSize(bd);
        generateButton.setMaximumSize(bd);

        generateButton.addActionListener(e -> displayBag());
        buttonPanel.add(generateButton);
        basePanel.add(buttonPanel, BorderLayout.NORTH);

        displayArea = new JEditorPane();
        displayArea.setSize(d);
        displayArea.setPreferredSize(d);
        basePanel.add(displayArea, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }

    private void displayBag() {
        GiantBagGenerator gen = new GiantBagGenerator();
        Set<GiantBagItem> bag = gen.generate();

        this.displayArea.setText("");

        StringBuilder output = new StringBuilder();
        output.append("This bag contains ");
        output.append(bag.size());
        output.append(" items:\n");
        for (GiantBagItem giantBagItem : bag) {
            output.append("     ");
            output.append(giantBagItem.toString());
            output.append("\n");
        }

        this.displayArea.setText(output.toString());
    }

    /*
     * Shut down the application
     */
    private void exitApp() {
        this.frame.dispose();
        System.exit(0);
    }

    private void createFileMenu() {
        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        // File -> Exit
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.addActionListener(e -> exitApp());
        menu.add(exitMenuItem);
    }

    private void createHelpMenu() {
        JMenu menu = new JMenu("Help");
        menuBar.add(menu);

        // Help -> About...
        JMenuItem menuItem = new JMenuItem("About...");
        menuItem.addActionListener(arg0 -> showAbout());
        menu.add(menuItem);
    }

    private void showAbout() {
        JOptionPane.showMessageDialog(this.frame, ABOUT_MESSAGE, "About", JOptionPane.PLAIN_MESSAGE);
    }
}
