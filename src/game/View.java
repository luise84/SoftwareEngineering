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
	private GameController controller;
	JLayeredPane layeredPane;
	JPanel halmaBoard;
	JLabel chessPiece;
	String movement_mode;
	String field_mode ="classic";
	Stone temp;
	private boolean user_enabled = false;


	int field_count;
	int xAdjustment;
	int yAdjustment;
	Point old_loc;
	Color fieldColor;
	ArrayList<JPanel> allowed_fields = new ArrayList<>();

	public View(Field playField, GameController controller){
		this.playField = playField;
		this.fieldAttribute = new Attribute();
		this.movement_mode = this.playField.getMovementType();
		this.fieldColor = fieldAttribute.fieldColor;
		this.controller = controller;
		setupView();
	}
	public void enableUserInput(boolean user_enabled){
		this.user_enabled = user_enabled;
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
	public void updateView(){
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

		emptyBoard();
		createBoard(icon_b, icon_w);
	}

	private void showField(){

	}
	public void showEndGame(){
		JLabel endText = new JLabel("Das Spiel ist zu Ende!");

		endText.setLocation(halmaBoard.getX(),halmaBoard.getY());
		endText.setSize(endText.getWidth(), endText.getHeight());
		halmaBoard.add(endText);


	}
	private void emptyBoard(){
		int root = (int)Math.sqrt(field_count);
		for(int i = 0; i < root; i++){
			for(int j = 0; j < root; j++){
				int bCount = i + ((j ) * (int)Math.sqrt(field_count));
				JPanel c = (JPanel)halmaBoard.getComponent(bCount);
				c.removeAll();
			}
		}
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
						panel_w.add(piece_w);
					}else{
						JLabel piece_b = new JLabel(icon_b);
						JPanel panel_b = (JPanel)halmaBoard.getComponent(bCount);
						panel_b.add(piece_b);
					}
				}
			}
		}
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
				break;
			case "diagonal" :
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.width , location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y - dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.height, location.y - dim.height));
				break;
			case "free" :
				ret_fields.add(halmaBoard.findComponentAt(location.x , location.y - dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x , location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y ));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.height, location.y ));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.width , location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y + dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x - dim.width, location.y - dim.height));
				ret_fields.add(halmaBoard.findComponentAt(location.x + dim.height, location.y - dim.height));
				break;
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
				//if there already is another piece you can skip
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
						break;
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
						break;
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
						break;
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
		if(user_enabled){
			chessPiece = null;
			Component c =  halmaBoard.findComponentAt(e.getX(), e.getY());

			if (c instanceof JPanel){
				return;
			}

			Point parentLocation = c.getParent().getLocation();

			//calculate the allowed moves based on the selected Figure
			JPanel field = (JPanel)c.getParent();

			Dimension dim = c.getSize();
			int newx = (int)field.getX() / dim.width;
			int newy = (int)field.getY() / dim.height;
			//stone must be stored in temp in order to move it in the 2d array
			Stone news = playField.checkForStone(newx,newy);
			Point check = 	playField.getPositionOfStone(news);
			//if the stone belongs to ai then dont allow movement
			if(!news.getAffiliation()){
				return;
			}
			//if its the user save it in temp
			temp = news;
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

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(user_enabled){
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
					Dimension dim = c.getSize();
					int newx = (int)c.getLocation().getX() / dim.width;
					int newy = (int)c.getLocation().getY() / dim.height;
					playField.setPosition(temp,newx,newy);
					//@todo notify gamecontroller that userinput is finished
					controller.notifyOfInput();

				}else{
					JPanel old_panel = (JPanel)halmaBoard.findComponentAt(old_loc);
					old_panel.add(chessPiece);
				}

			}

			Stone[][] field = playField.getPlayField();

			for(int i = 0 ;i< field.length; i++){
				for(int j = 0 ;j < field[i].length; j++){
					if(field[i][j] instanceof  Stone){
//					System.out.print(" X " );
//					System.out.print(field[i][j].getAffiliation());
					}else{
//					System.out.print(" O " );

					}

				}
//			System.out.println("_____");
			}

			chessPiece.setVisible(true);
		}

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
