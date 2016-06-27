package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Thundersama on 23.06.2016.
 */
public class Field extends JFrame implements MouseListener,MouseMotionListener{

	private Stone[][] field;
    JLayeredPane layeredPane;
    JPanel chessBoard;
    JLabel chessPiece;
    int xAdjustment;
    int yAdjustment;

    public Field(){
        Dimension boardSize = new Dimension(600, 600);

        //  Use a Layered Pane for this this application
        layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);
        layeredPane.setPreferredSize(boardSize);
        layeredPane.addMouseListener(this);
        layeredPane.addMouseMotionListener(this);

        //Add a chess board to the Layered Pane

        chessBoard = new JPanel();
        layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
        chessBoard.setLayout( new GridLayout(8, 8) );
        chessBoard.setPreferredSize( boardSize );
        chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);

        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel( new BorderLayout() );
            chessBoard.add( square );

            int row = (i / 8) % 2;
            if (row == 0)
                square.setBackground( i % 2 == 0 ? Color.YELLOW : Color.ORANGE);
            else
                square.setBackground( i % 2 == 0 ? Color.ORANGE: Color.YELLOW);
        }

        //Add a few pieces to the board

        //@todo at this point the own stone class might be needed
        System.out.println(new File("img/black.png").exists());
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("img/black.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }





        Image dimg = img.getScaledInstance(36, -1, Image.SCALE_SMOOTH);
        //JLabel piece = new JLabel(new ImageIcon("img/black.png"));
        ImageIcon icon = new ImageIcon(dimg);
        JLabel piece = new JLabel(icon);

        for(int i = 0; i<16; i++){
            System.out.println(i);
            JPanel panel = (JPanel)chessBoard.getComponent(i);
            panel.add(piece);
        }

        /*
        piece = new JLabel(new ImageIcon("/home/vinod/amarexamples/chess1.jpg"));
        panel = (JPanel)chessBoard.getComponent(15);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("/home/vinod/amarexamples/king.jpg"));
        panel = (JPanel)chessBoard.getComponent(16);
        panel.add(piece);
        piece = new JLabel(new ImageIcon("/home/vinod/amarexamples/camel.jpg"));
        panel = (JPanel)chessBoard.getComponent(20);
        panel.add(piece);
        */
    }

    private boolean setPosition(Stone stone, int x, int y){
		return true;
	}


	private void notifyView(){

	}

	private boolean endGame(){
		return false;
	}



    public static void main(String[] args){
        /*JFrame frame = new JFrame();
        JPanel field = new JPanel(new GridLayout());
        frame.add(field);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 800));
        //frame.pack();
        //frame.setVisible(true);
        */
        JFrame frame = new Field();
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
        frame.pack();
        frame.setResizable(true);
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
