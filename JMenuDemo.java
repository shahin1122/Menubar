package JMenu;

import java.awt.Container;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class JMenuDemo extends JFrame implements ActionListener{
	private JMenuBar menu ;
	
	private JMenu file , edit, help ;
	private JMenuItem newItem , opneItem , exitItem , cutItem , copyItem , pasteItem , selectAllItem ; 
	private ImageIcon cut ;
	
	
	
	JMenuDemo(){
		
		
		components();
		
	}
	
	public void components(){
		menu = new JMenuBar();
		this.setJMenuBar(menu);
		cut = new ImageIcon("src/Images/scissors.png/");
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		menu.add(file);
		menu.add(edit); 
		menu.add(help);
		
		newItem = new JMenuItem("new");
		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK ));
		
		opneItem= new JMenuItem("opne");
		
		exitItem= new JMenuItem("exit");
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X ,ActionEvent.CTRL_MASK));
		
		
		cutItem= new JMenuItem("cut");
		cutItem.setIcon(cut);
		
		
		
		copyItem= new JMenuItem("copy");
		pasteItem= new JMenuItem("paste");
		selectAllItem= new JMenuItem("Select All");
		
		file.add(newItem);
		file.add(opneItem);
		file.add(exitItem);
		edit.add(cutItem);
		edit.add(copyItem);
		edit.add(pasteItem);
		edit.add(selectAllItem);
		
		
		newItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== newItem) {
			JFrame frame = new JFrame();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setBounds(400,50,600,550);
			frame.setTitle("New Frame");
			frame.setResizable(false);
			
		}else if(e.getSource()==exitItem) {
			System.exit(0);
		}
		
		
	}
	
	
	public static void main(String []args) {
		
		JMenuDemo frame = new JMenuDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400,50,600,550);
		frame.setTitle("Notepad++");
		frame.setResizable(false);
		
	}

	
	

}
