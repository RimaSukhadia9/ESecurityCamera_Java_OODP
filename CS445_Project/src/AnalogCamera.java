
@SuppressWarnings("serial")
public class AnalogCamera extends SecurityCamera{
	
	protected String mediaFormat = "Large Format";
	
	public AnalogCamera(){
		
		System.out.println("This is Analog cam with" + mediaFormat + "datarate, resolution of " + resolution + " with zoom of " + zoom );
		
	}

}
