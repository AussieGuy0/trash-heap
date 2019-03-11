import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anthony on 16/07/16.
 */
public class Director extends JFrame implements ActionListener{

    private final JPanel containerFrame;
    private final JPanel eastPanel;
    private Board board;
    private final JButton rotateBoardBtn;
    private final JButton resetBtn;

    public Director() {
        containerFrame = new JPanel();
        add(containerFrame);
        containerFrame.setLayout(new BorderLayout());
        board = new Board();
        containerFrame.add(board, BorderLayout.CENTER);

        eastPanel = new JPanel();
        eastPanel.setLayout(new BoxLayout(eastPanel,BoxLayout.Y_AXIS));
        rotateBoardBtn = new JButton("Rotate Board");
        rotateBoardBtn.addActionListener(this);
        eastPanel.add(rotateBoardBtn);


        resetBtn = new JButton("Reset");
        resetBtn .addActionListener(this);
        eastPanel.add(resetBtn ,BorderLayout.EAST);

        containerFrame.add(eastPanel, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Rotate Board"))  {
            board.rotateBoard();
        } else if (e.getActionCommand().equals("Reset"))  {
            System.out.println("ran");
            containerFrame.remove(board);
            board = null;
            repaint();
            revalidate();
            board = new Board();
            containerFrame.add(board);
            repaint();
            revalidate();
        }
    }
}
