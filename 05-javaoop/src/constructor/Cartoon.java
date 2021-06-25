package constructor;

public class Cartoon {
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	public Cartoon(String n, int s, String p, boolean c) {
		name = n;
		series = s;
		painter = p;
		complete = c;
	}
	
    public void	getInfo(){
		System.out.println("웹툰제목 : " + name);
		System.out.println("웹툰회차 : " + series);
		System.out.println("웹툰작가 : " + painter);
		System.out.println("완결여부 : " + complete);
	}
}
