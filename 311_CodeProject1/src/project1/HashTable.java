package project1;

public class HashTable {

	HashTable(int size){
		int p = size;
		while(!isPrime(p)){
			p++;
		}
		
		//TODO create hash table of size p;
		
		HashFunction hashFunction = new HashFunction(p);
	}
	
	public int maxLoad(){
		return 0;
	}
	
	public void averageLoad(){
		
	}
	
	public void size(){
		
	}
	
	public void numElements(){
		
	}
	
	public void loadFactor(){
		
	}
	
	public void addTuple(Tuple t){
		
	}
	
	public void search(int k){
		
	}
	
	public void remove(Tuple t){
		
	}
	
	private boolean isPrime(int n) {
		if(n%2 == 0){
			return false;
		}
		
	    for(int i = 3; i <= Math.sqrt(n); i += 2) {
	        if(n%i == 0)
	            return false;
	    }
	    return true;
	}
}
