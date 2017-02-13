package project1;

public class Tuple {

	int key;
	float value;
	
	Tuple(int keyP, float valueP){
		key = keyP;
		value = valueP;
	}
	
	public int getKey(){
		return key;
	}
	
	public float getValue(){
		return value;
	}
	
	public boolean equals(Tuple t){
		if(t.getValue() == this.value){
			return true;
		}
		
		return false;
	}
}
