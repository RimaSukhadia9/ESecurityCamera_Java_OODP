
@SuppressWarnings("serial")
public class Hybrid extends DVR{
	protected String frequency = "20KHZ";
	protected String encoding = "110";
	
	public Hybrid(){
		
		System.out.println("This is hybrid dvr with" + frequency + " and encoding of " + encoding + " with format " +getDVRType() );
		
	}
	
}
