package java01;
interface iShape03 {  //界面iShape03 
	public void show();  
	public void area(); 
}

interface iColor {//界面iColor
	public void showColor();
}

class CWin implements iShape03,iColor {
	protected int width;
	protected int height;
	protected String color;
	public CWin(int w,int h,String str) {
		width=w;
		height=h;
		color=str;
	}
	public void show() {
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
	public void area() {
		System.out.println("area="+width*height);
	}
	public void showColor() {
		System.out.println("color="+color);
	}
}
public class Class02 {
	public static void main(String[] args) {
		CWin win=new CWin(5,7,"Green");
		win.showColor();
		win.show();
		win.area();
	}

}