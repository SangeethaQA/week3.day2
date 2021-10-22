package week3.day2.assignments;

public class Desktop implements Hardware,Software{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d= new Desktop ();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResource();
		

	}

	public void softwareResource() {
		// TODO Auto-generated method stub
		System.out.println("Software Resource");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hardware Resource");
		
	}
	public void desktopModel()
	{
		System.out.println("Desktop Model");
	}


}
