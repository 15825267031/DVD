import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class RegisterInterface  extends JFrame{

	public RegisterInterface(){
		setTitle("×¢²á½çÃæ");
		setBounds(0,0,400,500);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		}
	
	
	
	public static void main(String[] args){
		RegisterInterface r1 = new RegisterInterface();
		r1.setVisible(true);
		}
}
