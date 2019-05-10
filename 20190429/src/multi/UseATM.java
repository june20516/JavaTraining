package multi;

public class UseATM {



	public static void main(String[] args) {
		ATMSample atmSample =  new ATMSample();

		Thread  mm = new Thread(atmSample, "엄마");
		Thread  ff = new Thread(atmSample, "아빠");
		Thread  dd = new Thread(atmSample, "아들");
		Thread  nn = new Thread(atmSample, "할머니");

			mm.start();
			nn.start();
			ff.start();
			dd.start();

	}

}

