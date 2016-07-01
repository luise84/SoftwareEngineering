package game;

import gameConfigurations.Attribute;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Luise on 23.06.2016.
 */
public class View extends JFrame implements MouseListener,MouseMotionListener {
	private Field fieldattr;
	private Attribute fieldAttribute;
	private Stone[][] field;
	JLayeredPane layeredPane;
	JPanel chessBoard;
	JLabel chessPiece;
	int field_count = 81;
	int xAdjustment;
	int yAdjustment;
	Point old_loc;

	public View(){
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
		chessBoard.setLayout( new GridLayout(9, 9) );
		chessBoard.setPreferredSize( boardSize );
		chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);

		for (int i = 0; i < field_count; i++) {
			JPanel square = new JPanel( new BorderLayout() );
			square.setBorder(BorderFactory.createLineBorder(Color.black));
			chessBoard.add( square );

			int row = (i / 8) % 2;
			square.setBackground(Color.ORANGE);
			/*if (row == 0)
				square.setBackground( i % 2 == 0 ? Color.YELLOW : Color.ORANGE);
			else
				square.setBackground( i % 2 == 0 ? Color.ORANGE: Color.YELLOW);
				*/
		}

		//Add a few pieces to the board

		//@todo at this point the own stone class might be needed

		BufferedImage img_b = null;
		BufferedImage img_w = null;

		try {
			img_b = ImageIO.read(new File("img/black.png"));
			img_w = ImageIO.read(new File("img/white.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image dimg_b = img_b.getScaledInstance(36, -1, Image.SCALE_SMOOTH);
		Image dimg_w = img_w.getScaledInstance(36, -1, Image.SCALE_SMOOTH);
		//JLabel piece = new JLabel(new ImageIcon("img/black.png"));
		ImageIcon icon_b = new ImageIcon(dimg_b);
		ImageIcon icon_w = new ImageIcon(dimg_w);


		//number of stones must be dependend on board type
		for(int i = 0; i<18; i++){
			JLabel piece_b = new JLabel(icon_b);
			JPanel panel_b = (JPanel)chessBoard.getComponent(i);
			panel_b.add(piece_b);

			JLabel piece_w = new JLabel(icon_w);
			JPanel panel_w = (JPanel)chessBoard.getComponent(field_count -1 - i);
			panel_w.add(piece_w);
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

	private void showField(){

	}






	private boolean setPosition(Stone stone, int x, int y){
		return true;
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

		View frame = new View();
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
		chessPiece = null;
		Component c =  chessBoard.findComponentAt(e.getX(), e.getY());


		if (c instanceof JPanel)
			return;

		Point parentLocation = c.getParent().getLocation();
		// save the initial position in order to reset if necessary
		old_loc = parentLocation;
		xAdjustment = parentLocation.x - e.getX();
		yAdjustment = parentLocation.y - e.getY();
		chessPiece = (JLabel)c;
		chessPiece.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);
		chessPiece.setSize(chessPiece.getWidth(), chessPiece.getHeight());
		layeredPane.add(chessPiece, JLayeredPane.DRAG_LAYER);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(chessPiece == null){
			return;
		}

		chessPiece.setVisible(false);
		Component c =  chessBoard.findComponentAt(e.getX(), e.getY());

		//if there is another stone return the dragged stone to its initial place
		if (c instanceof JLabel){
			System.out.println(old_loc);
			JPanel old_panel = (JPanel)chessBoard.findComponentAt(old_loc);
			System.out.println(old_panel);
			old_panel.add(chessPiece);
		}
		else {
			Container parent = (Container)c;
			parent.add( chessPiece );
		}
		chessPiece.setVisible(true);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		if (chessPiece == null){
			return;
		}
		chessPiece.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);

	}
	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}



	@Override
	public void mouseMoved(MouseEvent e) {

	}
}
