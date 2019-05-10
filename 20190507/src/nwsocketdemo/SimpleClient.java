package nwsocketdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	String name;
	String message;
	Socket socket;
	BufferedWriter writer;
	BufferedReader reader;

	public SimpleClient(String userName) {
		name = userName;
		try {
			socket = new Socket("192.168.0.81", 3333);
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			reader = new BufferedReader(new InputStreamReader(System.in));
		} catch (UnknownHostException uhe) {
			System.out.println(uhe.getMessage());
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

	public void sendMessage() throws IOException {
		while (true) {
			message = getInputMessage();
			if (message.equals(name + " : bye\n"))
				throw new IOException("Ending Message");
			writer.write(message);
			writer.flush();
		}
	}

	public String getInputMessage() throws IOException {
		return name + " : " + reader.readLine() + "\n";
	}

	public void closeAll() {
		try {
			reader.close();
			writer.close();
			socket.close();
		} catch (IOException ie) {
			System.out.println((ie.getMessage()));
		}
	}
	
	public static void main(String[] args) {
		SimpleClient sc = new SimpleClient("bran");
		try {
			sc.sendMessage();
		} catch (IOException e) {
			sc.closeAll();
			System.out.println(e.getMessage());
		}
		
	}
}
