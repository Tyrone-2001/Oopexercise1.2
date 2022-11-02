public class BicycleRegistration {
	public static void main(String[] args) {
		Bicycle bike1,bike2,bike3;
		Bicycle tagno1,tagno2;

		String owner1,owner2,owner3;
		String Tagnum1,Tagnum2,Tagnum3;	
		
			bike1= new Bicycle();
			bike1.setOwnerName("Mr. Dagalea");
		
			bike2= new Bicycle();
			bike2.setOwnerName("Mr. Gonzales");
		
		owner1=bike1.getOwnerName();
		owner2=bike2.getOwnerName();
		
		tagno1= new Bicycle();
		tagno1.setTagNo("2019-346B");
		
		tagno2= new Bicycle();
		tagno2.setTagNo("2002-456A");
		
		Tagnum1=tagno1.getTagNo();
		Tagnum2=tagno2.getTagNo();
		
		bike3= new Bicycle("2006-590Z","Mr. Phua");
		owner3=bike3.getOwnerName();
		Tagnum3=bike3.getId();
		
		System.out.println(owner1+" owns a Bicycle with a tag number: "+Tagnum1);
		System.out.println(owner2+" also owns a  Bicycle with a tag number: "+Tagnum2);
		System.out.println("\nExercise 1.2 output \n"+owner3+" owns a Bicycle with a tag number: "+Tagnum3);
	}
}
