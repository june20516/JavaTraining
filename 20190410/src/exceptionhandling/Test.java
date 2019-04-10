package exceptionhandling;

import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color colBlack = Color.black;
		try{
			new Integer("3.4");
		//	상속관계를 거슬러 올라가는 순으로 작성
		}catch(NumberFormatException e) {
			
		}catch(IllegalArgumentException e) {
			
		}catch(RuntimeException e) {
			
		}catch(Exception e) {
			
		}
	}

}
