import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {
    private JPanel panel1;
    private JPanel nav;
    private JPanel nav2;
    private JButton manprof;
    private JButton inbox;
    private JButton verify;
    private JButton privacy;
    private JButton settings;
    private JButton logout;
    private JPanel nav1;
    private JPanel panel2;
    private JPanel board;
    private JPanel main;
    private JPanel withdraw;
    private JButton button1;

    public Home() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setContentPane(panel1);
        this.setSize(710,450);
        final Boolean[] active = {true};
        manprof.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(active[0]) {
                    manprof.setForeground(new Color(0x42e9ff));
                    active[0] = false;
                }
            }
        });
        inbox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(active[0]) {
                    inbox.setForeground(new Color(0x42e9ff));
                    active[0] = false;
                }
            }
        });
        verify.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(active[0]) {
                    verify.setForeground(new Color(0x42e9ff));
                    active[0] = false;
                }
            }
        });
        privacy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(active[0]) {
                    privacy.setForeground(new Color(0x42e9ff));
                    active[0] = false;
                }
            }
        });
        settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(active[0]) {
                    settings.setForeground(new Color(0x42e9ff));
                    active[0] = false;
                }
            }
        });
        logout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(active[0]) {
                    logout.setForeground(new Color(0x42e9ff));
                    active[0] = false;
                }
            }
        });
        manprof.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.remove(board);
                panel2.remove(main);
            }
        });
    }
}

