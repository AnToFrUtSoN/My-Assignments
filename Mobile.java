package week2.day1;

public class Mobile {
	String mobileBrandName="Samsung";
			char mobilelogo='s';
			short noOfMobilePiece=15;
			int modelNumber=24;
			long mobilemeiNumber=87697536689L;
			float mobilePrice=19000.70F;
			boolean isDamaged=false;

	public static void main(String[] args) {
		Mobile samsung=new Mobile();
		System.out.println(samsung.mobileBrandName);
		System.out.println(samsung.mobilelogo);
		System.out.println(samsung.noOfMobilePiece);
		System.out.println(samsung.modelNumber);
		System.out.println(samsung.mobilemeiNumber);
		System.out.println(samsung.mobilePrice);
		System.out.println(samsung.isDamaged);
		
		
		

	}

}
