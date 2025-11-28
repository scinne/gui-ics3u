
public class LaptopStoreApp {
	
	//laptop array
	public static Laptop[] laptopArray; // note will be error until others are done
	
	//main method
	public static void main(String[] args) {
		
		//run file input
		new fileInput();
		
		//load title screen
		new TitleScreen().setVisible(true);
		
	}
}
