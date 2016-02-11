
class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		
	}
	
}

public class App {

	public static void main(String[] args) {
	
		
		
		//this automatically calls the close method..
		//Available after JAVA 7
		
		//TRY with RESOURCES is the name of this SYNTAX
		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
