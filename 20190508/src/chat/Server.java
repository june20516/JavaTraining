package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	private ServerSocket ss;
	private ArrayList<ServerThread> clientList = new ArrayList<ServerThread>();
	
	public Server() {
		try {
			ss = new ServerSocket(1111);
			
			while (true) {
					Socket clientSocket = ss.accept();
					ServerThread aClient = new ServerThread(clientSocket, this);
					aClient.start();
					clientList.add(aClient);
			}
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	public void broadcast(String msg) {
		for(int i =0; i<clientList.size(); i++) {
			try {
				clientList.get(i).sendMsg(msg);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void exitRoom(ServerThread aClient) {
		synchronized (clientList) {
			clientList.remove(aClient);
			System.out.println("A client is exited");
			broadcast("A client is exited");
		}
	}
	
	public static void main(String[] args) {
		Server s = new Server();
		

	}
	
	public class ServerThread extends Thread{
		private Socket client;
		private Server server;
		
		private InputStream in;
		private InputStreamReader isr;
		private BufferedReader br;
		
		private OutputStream out;
		private OutputStreamWriter osw;
		private BufferedWriter bw;
		
		public ServerThread(Socket clientSocket,Server realServer) {
			this.client= clientSocket;
			this.server = realServer;
			init();
			
		}
		private void init () {
			
			try {
				in = client.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				
				out = client.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		
		public void sendMsg(String otherMsg) throws Exception{
			bw.write(otherMsg + "\n");
			bw.flush();
		}
		
		public void run (){
			
			while (true) {
				
				try {
					String msg = br.readLine();
					System.out.println("MESSAGE FROM USER" + msg);
					server.broadcast(msg);
				} catch (IOException e) {
					break;
				}
			}
		}
	}
}
