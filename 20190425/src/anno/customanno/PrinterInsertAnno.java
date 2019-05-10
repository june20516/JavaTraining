package anno.customanno;

public class PrinterInsertAnno {

	public static void main(String[] args) {
		
		InsertAnnoUse1 anno1 = new InsertAnnoUse1();
		System.out.println(anno1);
		InsertDataAnnotationHandler.process(anno1);
		System.out.println(anno1);

		InsertAnnoUse2 anno2 = new InsertAnnoUse2();
		System.out.println(anno2);
		InsertDataAnnotationHandler.process(anno2);
		System.out.println(anno2);
	}

}