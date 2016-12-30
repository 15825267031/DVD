import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class SearchButton extends JFrame implements ActionListener{
	public SearchButton() {
		setLayout(null);
		setBounds(0,0,500,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		
		JButton button = new JButton();
		button.setText("搜索");
		button.setBounds(50, 60, 140, 30);
		getContentPane().add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame b =new JFrame();
				b.setBounds(450,260,500,300);
				b.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				
				JTextArea output = new JTextArea();
				output.setRows(20);
				output.setColumns(30);
				JScrollPane outputScrollPane = new JScrollPane();
				outputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				b.getContentPane().add(outputScrollPane);
				outputScrollPane.setViewportView(output);
				
				b.setResizable(false);
				b.setVisible(true);
				
				try {
					 for (int i = 1; i < 6; i++){
					FileReader fileoutstream = new FileReader("F:\\新建文件夹\\新建文本文档 (" + i + ").txt");
					BufferedReader buf = new BufferedReader(fileoutstream);
					output.append(buf.readLine());
					output.append("\n");
					 }
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}

		});
	}
	public void actionPerformed(ActionEvent e) {

	}
}