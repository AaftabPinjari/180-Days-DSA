package Arrays;


public class Array101 {
	
	public static void main(String[] args) {
		DVD[] dvdCollection = new DVD[15];
		DVD avengersDVD = new DVD("Avengers", 2012);
		dvdCollection[1] = avengersDVD;
		System.out.println(dvdCollection[1]);
	}

}
