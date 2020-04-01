
public class Innerwall {
double width;
double height;
public Innerwall() {
}
public Innerwall(double width, double height) {
	if(width < 0) {
		this.width = 0;
	}
	if(height < 0) {
		this.height = 0;
	}
	this.width = width;
	this.height = height;
	}
public double getWidth() {
	if(width < 0) {
		this.width = 0;
	}
	return this.width;
}
public double getHeight() {
	if(height < 0) {
		this.height = 0;
	}
	return this.height;
}
public void setWidth(double w) {
	width = w;
}
public void setHeight(double h) {
	height = h;
}
public double getArea() {
	return (getWidth() * getHeight());
}
}
