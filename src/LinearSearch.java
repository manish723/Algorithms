
public class LinearSearch extends SearchClass implements SearchMethod, Runnable {

	//Class fields
	static private String className = "Linear Search";
	
	//Constructor
	LinearSearch() {
		super(className);
	}
	
	//Constructor
	LinearSearch(int[] newDataObj) {
		super(className, newDataObj);
	}
		
	//Constructor
	LinearSearch(int[] newDataObj, int newAim) {
		super(className, newDataObj, newAim);
	}

	//Search Algorithm
	@Override
	public void search() {
		
		int iterations = 0;
		String output = "";
		
		for(int i = 0; i < super.getDataObj().length; i++){
			
			if(super.getDataObj()[i] == super.getAim()){
				
				output = String.format("\"%d\" has been found at index %d after %d iterations", super.getAim(), i, iterations);
				break;
			}
			else{
				
				output = String.format("\"%d\" has not been found after %d iterations", super.getAim(), iterations);
			}
			
			iterations++;
		}
		
		System.out.println(output + "\n");
	}

	@Override
	public void sort() {}

	
	//Multi-threading
	@Override
	public void run() {
		
		System.out.println(String.format("Thread Started -> %s", super.getDescription()));
		search();
		System.out.println(String.format("Thread Finished -> %s\n", super.getDescription()));
	}

	//END OF CLASS
}
