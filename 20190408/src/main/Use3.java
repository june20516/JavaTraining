package main;

import abst.NoInstance;
import derovation.SubImple;

/**
 * interface 인스턴스 만들어서 사용
 * @author USER
 *
 */
public class Use3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoInstance ref1 = new SubImple();
		ref1.m3();
	}

}
