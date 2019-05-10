package chat;

import java.io.*;
import java.net.*;

public class ChatThread implements Runnable {

   private ChatClient view;
   private Socket socket;
   private String name;
   
   //inputStream
   private InputStream in;
   private InputStreamReader isr;
   private BufferedReader br;
   
   //outputStream
   private OutputStream out;
   private OutputStreamWriter osw;
   private BufferedWriter bw;
   
   private boolean runFlag = false;
   
   public ChatThread(ChatClient awtView, String name) {
      this.view = awtView;
      this.name = name;
      this.runFlag = true; // 실행되게 한다.
      try {
         socket = new Socket("192.168.0.82",1111);
         
         in = socket.getInputStream();
         isr = new InputStreamReader(in);
         br = new BufferedReader(isr);
         
         out = socket.getOutputStream();
         osw = new OutputStreamWriter(out);
         bw = new BufferedWriter(osw);
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   @Override
   public void run() {
      while(runFlag) {
         
         try {
            String serverMsg = br.readLine();
            view.addMsg(serverMsg);
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      }
      System.out.println("CLIENT TERMINATED");
   }
   
   public void sendMsg(String userMsg) {
      
      try {
         System.out.println("Thread send Msg" + userMsg);
         bw.write(name + " : " + userMsg+"\n");
         bw.flush();
         if(userMsg.equals("BYEBYE")) {
            terminate();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   public void terminate() throws IOException{
      this.runFlag = false;
      bw.close();
      osw.close();
      out.close();
      br.close();
      isr.close();
      in.close();
      socket.close();
      System.exit(0);
   }

}