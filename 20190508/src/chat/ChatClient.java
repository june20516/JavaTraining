package chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class ChatClient extends Frame implements ActionListener {

	private Panel upper = new Panel();
	private TextArea ta = new TextArea(10, 30);
	private Panel lower = new Panel();
	private TextField tf = new TextField(30);

	private ChatThread cth = new ChatThread(this,"준호");

	public ChatClient() {

		upper.add(ta);

		Thread t = new Thread(cth);
		t.setDaemon(true);
		t.start();

		lower.add(tf);

		tf.addActionListener(this);

		setLayout(new BorderLayout());
		add(upper, BorderLayout.CENTER);
		add(lower, BorderLayout.SOUTH);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				System.exit(0);
			}
		});
	}

	public void addMsg(String msg) {
		ta.append(msg + "\n"); // 줄 바꿈을 위해서 추가한다.
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String userMsg = tf.getText();
		System.out.println(userMsg);
		tf.setText("");
		cth.sendMsg(userMsg);
	}

	public static void main(String[] args) {
		Frame f = new ChatClient();
		f.pack();
		f.setVisible(true);

	}

}
