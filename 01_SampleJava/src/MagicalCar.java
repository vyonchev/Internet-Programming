
public class MagicalCar {
	public String colour;
	public String model;
	
	public MagicalCar(String defColour, String defModel ){
		
		colour = defColour;
		model = defModel;
		
		
	}
	
	public void changeColor(String newColour){
		colour = newColour;
		
	}
	
	public void changeModel(String newModel){  //It is a magical car after all. It can change its model any time
		
		model = newModel;
		
	}

}
