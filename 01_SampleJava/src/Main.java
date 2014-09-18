
public class Main {
	
	public static void main(String[] args){
		
		int i = 0;
		for(i = 1; i <= 100;i++){
			
			if (i % 10 == 2){
				
				System.out.println(i + " is a number ending in 2");
			} else {
				
					System.out.println(i + " is a number not ending in 2");
				
				
				}
			
			}
		
		
		MagicalCar car1 = new MagicalCar("red", "Honda");
		MagicalCar car2 = car1;
		MagicalCar car3 = new MagicalCar("blue", "Mazda");
		
		if(car1 == car2 ) {
			
			System.out.println("car1 and car2 are the same.");
		}
		if(car1 == car3){
			System.out.println("car1 and car3 are the same.");
			
		}
		if(car1.equals(car2)) {
			
			System.out.println("car1 and car2 are the same.");
		}
		
		if(car1.equals(car3)) {
			
			System.out.println("car1 and car3 are the same.");
		}
		
			
			
			
		}
		
		
	}

