package anno;

import java.lang.annotation.Annotation;

public class AnnotationTest {

	public static void main(String[] args) {
		RGBColor rgbColor = new RGBColor();
		GreenColor greenColor = new GreenColor();
		
		Class<? extends RGBColor> rgbClass = rgbColor.getClass();
		Class rgbColorClassMeta = RGBColor.class;
		Annotation[] annoArray = rgbClass.getAnnotations();
		Annotation[] annoArray2 = rgbColorClassMeta.getAnnotations();
		Annotation[] annoArray3 = RGBColor.class.getAnnotations();
		
		
		
		System.out.println("----rgbClass.getAnnotations();");
		for (Annotation anno : annoArray){
		System.out.println(anno);
		}
		System.out.println("----rgbColorClassMeta.getAnnotations();");
		for (Annotation anno : annoArray2){
			System.out.println(anno);
		}
		System.out.println("----RGBColor.class.getAnnotations();");
		for (Annotation anno : annoArray3){
			System.out.println(anno);
		}
		
		Class<? extends RGBColor> rgbClass1 = rgbColor.getClass();
		AnnoColors rgbColors = rgbClass1.getAnnotation(AnnoColors.class);
		AnnoColor[] rgbColorArray = rgbClass1.getAnnotationsByType(AnnoColor.class);

		Class<? extends GreenColor> greenClass = greenColor.getClass();
		AnnoColors greenColors = greenClass.getAnnotation(AnnoColors.class);
		AnnoColor[] greenColorArray = greenClass.getAnnotationsByType(AnnoColor.class);
		
		System.out.println("rgbColors : "+rgbColors);
		System.out.println("rgbColorArray : " + rgbColorArray);
		System.out.println("rgbColorArray.length : " + ((rgbColorArray == null)? 0 : rgbColorArray.length));
		
		System.out.println("greenColors : " + greenColors);
		System.out.println("rgbColorArray : " + greenColorArray);
		System.out.println("rgbColorArray.length : " + ((greenColorArray == null)? 0 : greenColorArray.length));

	}

}
