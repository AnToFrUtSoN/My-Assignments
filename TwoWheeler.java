package week2.day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=876877858L;
	boolean isPunctured=true;
	double runningKM=34000.8;
	String bikeName="Hornet";
			
	public static void main(String[] args) {
		TwoWheeler Hornet=new TwoWheeler();
		System.out.println(Hornet.noOfWheels);
		System.out.println(Hornet.noOfMirrors);
		System.out.println(Hornet.chassisNumber);
		System.out.println(Hornet.isPunctured);
		System.out.println(Hornet.runningKM);
		System.out.println(Hornet.bikeName);
		
	}

}
