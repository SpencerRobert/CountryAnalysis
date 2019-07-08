///////////////////////////////////////////
//      Spencer Poultney, 250982673      //
//      spoultne@uwo.ca                  //
//      Assignment 1, CS1027, 2018       //
///////////////////////////////////////////

public class Continent {
	
	//Private variables for Continent Class
	private String countryName;
	private String continentName;
	
	/**
	 * Constructor method to create Continent objects 
	 * @param countryName, the name of the country in the continent
	 * @param continentName, the name of the continent
	 */
	public Continent(String countryName, String continentName) {
		this.countryName = countryName;
		this.continentName = continentName;
	}
	
	/**
	 * Getter method to get the name of the country associated with the continent object
	 * @return the name of the associated country
	 */
	
	public String getCountryName() {
		return countryName;
	}
	
	/**
	 * Getter method to get the name of the continent
	 * @return the name of the continent
	 */
	
	public String getContinentName() {
		return continentName;
	}
	
	/**
	 * Setter method to change the Continents associated country name
	 * @param newCountryName, the new country name
	 */
	
	public void setCountryName(String newCountryName) {
		this.countryName = newCountryName;
	}
	
	/**
	 * Setter method to change the continent name
	 * @param newContinentName, the new continent name
	 */
	
	public void setContinentName(String newContinentName) {
		this.continentName = newContinentName;
	}
	
	/**
	 * toString method, creates a string representation of a Continent object.
	 */
	
	public String toString() {
		String s = String.format("The name of the country is: %-20s \n", this.getCountryName()) +
					String.format("The name of the continent it's in is: %-20s \n" , this.getContinentName());
		return s;
	}

}
