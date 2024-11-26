
public class DigitalVideoDisc {
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public int getID() {
		return id;
	}
	public String toString() {
		return String.format("DVD - [%s] - [%s] - [%s] - [%d]: [%.2f]$", title, category, director, length, cost);
	}
	public String getTitle() {
		return title;
	}
	public String toString() {
		return String.format("DVD - [%s] - [%s] - [%s] - [%d]: [%.2f]$", title, category, director, length, cost);
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
    public DigitalVideoDisc (String title){
        this.title = title;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public DigitalVideoDisc (String title, String category, float cost){
       	this.title = title;
       	this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    public DigitalVideoDisc (String director, String category, String title, float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;

    }   

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }   

}
