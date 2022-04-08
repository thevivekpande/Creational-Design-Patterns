package builderTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuilderTest builderTest=new BuilderTest.Builder().withAge(20).withClgName("IIMT").withIsMale(true).withName("Vivek Pandey").build();
		System.out.println(builderTest);
	}

}
