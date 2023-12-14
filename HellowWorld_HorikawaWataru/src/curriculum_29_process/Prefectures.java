package curriculum_29_process;

public class Prefectures {
	
	private String name;
	private String capital;
	private double area;
	
	public Prefectures(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }
	
	public String getName() {
		return name;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public double getArea() {
		return area;
	}
}
