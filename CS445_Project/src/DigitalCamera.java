
@SuppressWarnings("serial")
public class DigitalCamera extends SecurityCamera{
	protected String encoding = "Video Encoder";
	
	public DigitalCamera(){
		
		System.out.println("This is Digital cam with" + encoding + "datarate, resolution of " + resolution + " with zoom of " + zoom );
		
	}

}
