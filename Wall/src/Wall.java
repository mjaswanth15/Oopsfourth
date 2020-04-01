
public class Wall {

	public static void main(String[] args) {
	Innerwall cement = new Innerwall();
	cement.setWidth(10.00);
	cement.setHeight(20.00);
	Innerwall i = new Innerwall(24 , 1.5);
	System.out.println(cement.getWidth());
	System.out.println(cement.getHeight());
	System.out.println(cement.getArea());
	System.out.println(i.getWidth());
	System.out.println(i.getHeight());
	System.out.println(i.getArea());
	}

}
