package project1;
import java.util.concurrent.ThreadLocalRandom;

public class HashFunction {
	int a, b, p;
	
	HashFunction(int range){
		int i = range;
		while(!isPrime(i)){
			i++;
		}
		
		p = i;
		
		a = ThreadLocalRandom.current().nextInt(0, p);
		b = ThreadLocalRandom.current().nextInt(0, p);
	}
	
	public int hash(int x){
		return (a*x+b)%p;
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	public int getP(){
		return p;
	}
	
	public void setA(int x){
		this.a = x%p;
	}
	
	public void setB(int x){
		this.b = x%p;
	}
	
	public void setP(int x){
		while(!isPrime(x)){
			x++;
		}
		
		this.p = x;
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
