package stringexamples;
public class NestedElse {

	public static void main(String[] args) {
		NestedElse NestedElse = new NestedElse();
		NestedElse.StudentName();
		NestedElse.StudentOtherDetails();
		
	}
	
	public void StudentName() {
		String name= "anil";
		String middleName= "Kallappa";
		String LastName="Patil";
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(LastName);
		System.out.println("Last name is:"+LastName);
		System.out.println("changes in line 18&19");




	}
	
	public void StudentOtherDetails() {
		int rollNumber = 21;
		String birthDate= "12 July 1993";
		String address= "rajgoli Khurd";
		System.out.println(rollNumber);
		System.out.println(birthDate);
		System.out.println(address);


	}		
	
}
