package game;

import gameConfigurations.Attribute;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Luise on 23.06.2016.
 */
public class View extends JFrame implements MouseListener,MouseMotionListener {
	private Field playField;
	private Attribute fieldAttribute;
	JLayeredPane layeredPane;
	JPanel halmaBoard;
	JLabel chessPiece;
	String movement_mode = "free";
	String field_mode ="classic";

	int field_count;
	int xAdjustment;
	int yAdjustment;
	Point old_loc;
	Color fieldColor;
	ArrayList<JPanel> allowed_fields = new ArrayList<>();

	public View(Field playField){
		this.playField = playField;
		this.fieldAttribute = new Attribute();
		this.fieldColor = fieldAttribute.fieldColor;
		setupView();
	}
	private void setupView(){
		Dimension boardSize = new Dimension(600, 600);

		layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane);
		layeredPane.setPreferredSize(boardSize);
		layeredPane.addMouseListener(this);
		layeredPane.addMouseMotionListener(this);

		//Add a chess board to the Layered Pane
		halmaBoard = new JPanel();
		layeredPane.add(halmaBoard, JLayeredPane.DEFAULT_LAYER);

		field_count = playField.getFieldCount();
		Integer root = (int)Math.sqrt(field_count);

		halmaBoard.setLayout( new GridLayout(root, root) );
		halmaBoard.setPreferredSize( boardSize );
		halmaBoard.setBounds(0, 0, boardSize.width, boardSize.height);

		for (int i = 0; i < field_count; i++) {
			JPanel square = new JPanel( new BorderLayout() );
			square.setBorder(BorderFactory.createLineBorder(Color.black));
			halmaBoard.add( square );
			square.setBackground(fieldColor);
		}

		//@todo at this point the own stone class might be needed

		BufferedImage img_b = null;
		BufferedImage img_w = null;
		try {
			img_b = ImageIO.read(new File(fieldAttribute.aiStoneImagePath));//("img/black.png"));
			img_w = ImageIO.read(new File(fieldAttribute.playerStoneImagePath));//("img/white.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image dimg_b = img_b.getScaledInstance(36, -1, Image.SCALE_SMOOTH);
		Image dimg_w = img_w.getScaledInstance(36, -1, Image.SCALE_SMOOTH);
		//JLabel piece = new JLabel(new ImageIcon("img/black.png"));
		ImageIcon icon_b = new ImageIcon(dimg_b);
		ImageIcon icon_w = new ImageIcon(dimg_w);

		createBoard(icon_b, icon_w);

	}


	private void showField(){

	}
	private void createBoard(ImageIcon icon_b, ImageIcon  icon_w){
		//Stone[][] active_field = playField.getPlayField();
		int root = (int)Math.sqrt(field_count);
		for(int i = 0; i < root; i++){
			for(int j = 0; j < root; j++){
				Stone temp = playField.checkForStone(i,j);
				if(temp != null){
					int bCount = i + ((j ) * (int)Math.sqrt(field_count));
					if(temp.getAffiliation()){
						JLabel piece_w = new JLabel(icon_w);
						JPanel panel_w = (JPanel)halmaBoard.getComponent(bCount);
						System.out.println(panel_w);
						panel_w.add(piece_w);
					}else{
						JLabel piece_b = new JLabel(icon_b);
						JPanel panel_b = (JPanel)halmaBoard.getComponent(bCount);
						System.out.println(panel_b);
						panel_b.add(piece_b);
					}
				}
			}
		}

/*
		switch(field_mode){
			case "renpaarden" :

				for(int i = 0; i<Math.sqrt(field_count) * 2; i++){
					JLabel piece_b = new JLabel(icon_b);
					JPanel panel_b = (JPanel)halmaBoard.getComponent(i);
					panel_b.add(piece_b);

					JLabel piece_w = new JLabel(icon_w);
					JPanel panel_w = (JPanel)halmaBoard.getComponent(field_count -1 - i);
					panel_w.add(piece_w);
				}
			case "classic" :
				int root = (int) Math.sqrt(field_count);
				int linecount = root / 2;
				for(int i = 0; i<root / 2 ; i++) {
					for(int j = 0; j + i < linecount; j++){
						JLabel piece_b = new JLabel(icon_b);
						//algorithm to get the half pyramid formation for stones
						int bCount = i + ((j ) * (int)Math.sqrt(field_count));
						JPanel panel_b = (JPanel)halmaBoard.getComponent(bCount);
						panel_b.add(piece_b);


						JLabel piece_w = new JLabel(icon_w);
						JPanel panel_w = (JPanel)halmaBoard.getComponent(field_count -1 - bCount);
						panel_w.add(piece_w);
					}


				}
		}
		*/

	}




	private boolean setPosition(Stone stone, int x, int y){
		return true;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}
	public ArrayList<Component> getLevelFields(JPanel currentField , Point location){
		ArrayList<Component> ret_fields = new ArrayList<>();
		Dimension dim = currentField.getSize();
		switch(movement_mode){
			case "straight" :
				ret_fields.add(halmaBoard.findComponentAt(location.x , location.y - dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x , location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y ));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.height, location.y ));
			case "diagonal" :
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.width , location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y - dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.height, location.y - dim.height));
			case "free" :
				ret_fields.add(halmaBoard.findComponentAt(location.x , location.y - dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x , location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y ));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.height, location.y ));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.width , location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y - dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.height, location.y - dim.height));
		}

		return ret_fields;
	}


	public ArrayList<JPanel> getAllowedMoves(JPanel currentField, Point location){

		//hardcoded allowed moves for gamemode straight
		ArrayList<Component> possible_fields = getLevelFields(currentField,location);
		//Component c_=  chessBoard.findComponentAt(location.x , location.y - dim.height);
		ArrayList<JPanel> ret_fields = new ArrayList<>();
		Dimension dim = currentField.getSize();

		for(Component field : possible_fields){
			if(field instanceof JPanel){
				field.setBackground(Color.GREEN);
				ret_fields.add((JPanel)field);
			}else if (field instanceof JLabel){
				//if there already is another piece you can skip @todo recursion??
				Point main_loc = (halmaBoard.findComponentAt(location.x , location.y)).getParent().getLocation();
				Point ad_loc = field.getParent().getLocation();

				//ArrayList<Component> skip_fields = new ArrayList<>();
				ArrayList<Component> skip_fields = new ArrayList<>();


				switch(movement_mode){
					case "straight" :
						if(main_loc.getY() < ad_loc.getY()){
							skip_fields.add(halmaBoard.findComponentAt(location.x , location.y + 2 * dim.height));
						}else if(main_loc.getY() > ad_loc.getY()){
							skip_fields.add(halmaBoard.findComponentAt(location.x , location.y - 2 * dim.height));
						}
						if(main_loc.getX() > ad_loc.getX()){
							skip_fields.add(halmaBoard.findComponentAt(location.x - 2 * dim.width, location.y ));
						}else if (main_loc.getX() < ad_loc.getX()){
							skip_fields.add(halmaBoard.findComponentAt(location.x + 2 * dim.width, location.y ));
						}
					case "diagonal":
						if(main_loc.getY() < ad_loc.getY() &&
								main_loc.getX() < ad_loc.getX()){
							skip_fields.add(halmaBoard.findComponentAt(location.x + 2 * dim.width , location.y + 2 * dim.height));
						}else if(main_loc.getY() > ad_loc.getY() &&
								main_loc.getX() > ad_loc.getX()){
							skip_fields.add(halmaBoard.findComponentAt(location.x - 2 * dim.width, location.y - 2 * dim.height));
						}
						if(main_loc.getX() > ad_loc.getX() &&
								main_loc.getY() < ad_loc.getY()){
							skip_fields.add(halmaBoard.findComponentAt(location.x - 2 * dim.width, location.y + 2 * dim.height ));
						}else if (main_loc.getX() < ad_loc.getX() &&
								main_loc.getY() > ad_loc.getY()){
							skip_fields.add(halmaBoard.findComponentAt(location.x + 2 * dim.width, location.y - 2 * dim.height));
						}
					case "free" :
						if(main_loc.getY() < ad_loc.getY()&&
								!(main_loc.getX() != ad_loc.getX())){
							skip_fields.add(halmaBoard.findComponentAt(location.x , location.y + 2 * dim.height));
						}else if(main_loc.getY() > ad_loc.getY() &&
								!(main_loc.getX() != ad_loc.getX())){
							skip_fields.add(halmaBoard.findComponentAt(location.x , location.y - 2 * dim.height));
						}
						if(main_loc.getX() > ad_loc.getX() &&
								!(ad_loc.getY() != main_loc.getY())){
							skip_fields.add(halmaBoard.findComponentAt(location.x - 2 * dim.width, location.y ));
						}else if (main_loc.getX() < ad_loc.getX() &&
								!(main_loc.getY() != ad_loc.getY())){
							skip_fields.add(halmaBoard.findComponentAt(location.x + 2 * dim.width, location.y ));
						}
						if(main_loc.getY() < ad_loc.getY() &&
								main_loc.getX() < ad_loc.getX()){
							skip_fields.add(halmaBoard.findComponentAt(location.x + 2 * dim.width , location.y + 2 * dim.height));
						}else if(main_loc.getY() > ad_loc.getY() &&
								main_loc.getX() > ad_loc.getX()){
							skip_fields.add(halmaBoard.findComponentAt(location.x - 2 * dim.width, location.y - 2 * dim.height));
						}
						if(main_loc.getX() > ad_loc.getX() &&
								main_loc.getY() < ad_loc.getY()){
							skip_fields.add(halmaBoard.findComponentAt(location.x - 2 * dim.width, location.y + 2 * dim.height ));
						}else if (main_loc.getX() < ad_loc.getX() &&
								main_loc.getY() > ad_loc.getY()){
							skip_fields.add(halmaBoard.findComponentAt(location.x + 2 * dim.width, location.y - 2 * dim.height));
						}
				}


				for(Component skip : skip_fields){
					if(skip instanceof JPanel){
						(skip).setBackground(Color.green);
						ret_fields.add((JPanel)skip);
					}
				}
			}
		}
		return ret_fields;
	}

	@Override
	//@todo update the field by controller input then update the board
	public void mousePressed(MouseEvent e) {
		chessPiece = null;
		Component c =  halmaBoard.findComponentAt(e.getX(), e.getY());
		if (c instanceof JPanel){
			return;
		}
		Point parentLocation = c.getParent().getLocation();

		//calculate the allowed moves based on the selected Figure
		JPanel field = (JPanel)c.getParent();

		allowed_fields = getAllowedMoves(field,new Point(e.getX(),e.getY()));

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
		for(JPanel field : allowed_fields){
			field.setBackground(fieldColor);
		}

		if(chessPiece == null){
			return;
		}

		chessPiece.setVisible(false);
		Component c =  halmaBoard.findComponentAt(e.getX(), e.getY());

		//if there is another stone return the dragged stone to its initial place
		if (c instanceof JLabel){
			JPanel old_panel = (JPanel)halmaBoard.findComponentAt(old_loc);
			old_panel.add(chessPiece);
		}
		else {
			boolean move_check = false;
			for(JPanel field : allowed_fields){
				if((field).equals(c)){
					move_check = true;
				}
			}
			if(move_check){
				Container parent = (Container)c;
				parent.add( chessPiece );
			}else{
				JPanel old_panel = (JPanel)halmaBoard.findComponentAt(old_loc);
				old_panel.add(chessPiece);
			}

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
	public static void main(String[] args){


	}
}
