package SpringBoot1.firstSpringboot;


public class SpringBootexam 
{
	private String H;

	public SpringBootexam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpringBootexam(String h) {
		super();
		H = h;
	}

	@Override
	public String toString() {
		return H ;
	}

	public String getH() {
		return H;
	}

	public void setH(String h) {
		H = h;
	}
	
	
}
