package seleniumWithTestNG;
import org.testng.annotations.Test;

public class HandlingDependents {
	 
	  @Test (dependsOnMethods = { "findAGirlAndFallInLove" })
	  public void getMarried() {
		  System.out.println("Get married "); 
	  }
	 
	  @Test	 
	  public void findAGirlAndFallInLove() {	 
		  System.out.println("Find your dream girl");	 
	  }
	 
	  @Test (dependsOnMethods = { "getMarried" })	 
	  public void haveKids() {	 
		  System.out.println("Have Kids");	 
	  }	
}
