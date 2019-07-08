///////////////////////////////////////////
//      Spencer Poultney, 250982673      //
//      spoultne@uwo.ca                  //
//      Assignment 1, CS1027, 2018       //
///////////////////////////////////////////

/**
 * COMMENT EXAMPLE ADD THESE EVERYWHERE
 * @author Spencer Poultney
 *
 */

public class CountryContinentQuery {
	
	//Private variables for CountryContinentQuery class
	private String countryName;
	private String continentName;
	private int countryPopulation;
	private int countryArea;
	private int countryCt=0;
	private int continentCt=0;
	private final int DEFAULT_SIZE = 30;
	Country[] countryArray = new Country[DEFAULT_SIZE];
	Continent[] continentArray = new Continent[DEFAULT_SIZE];

	/**
	 * Constructor method to create a CountryContinentQuery object
	 * @param countryArray, array full of country objects
	 * @param continentArray, array full of continent objects
	 * @param Ct
	 */
	public CountryContinentQuery(Country[] countryArray, Continent[] continentArray, int Ct) {
		this.countryArray=countryArray.clone();
		this.continentArray=continentArray.clone();
		this.continentCt = Ct;
		this.countryCt = Ct;
	}
	
	/**
	 * Method made to return a string with all countries in a specified continent
	 * @param continentName, specified continent 
	 * @return String with a list of all countries in specified continent
	 */
	public String getCountriesOnContinent(String continentName) {
		 String countriesOnContinentString = "";
		 String noCountries = "Sorry there are no countries in that continent";
		for (int i=0; i<continentCt;i++) {
			if (continentArray[i].getContinentName().equals(continentName)){
				countriesOnContinentString = countriesOnContinentString + String.format("%-5s | ", continentArray[i].getCountryName());
			}
		}
			if (countriesOnContinentString == "") {
				return noCountries;
			}
			else{
				return countriesOnContinentString;
			}
		}
	
	
	/**
	 * Method made to provide a string with the population of every country within a specified continent
	 * @param continentName, The name of the specified continent
	 * @return String with the populations of every country within the specified continent
	 */
	public String getPopulationOfContinent(String continentName) {
		String countryPopulations = "";
		String noData = "Sorry we have no data for that continent";
		for (int i=0; i<continentCt;i++) {
			if (continentArray[i].getContinentName().equals(continentName)) {
				int index = 0;
				boolean found = false;
				while (index<countryCt && !found){
					if (continentArray[i].getCountryName().equals(countryArray[index].getName())) {
						found = true;
						countryPopulations = countryPopulations + String.format("%-5s: %-5d \n", continentArray[i].getCountryName(), countryArray[index].getPopulation());
					}
					else {
						index++;
					}
				}
			}
		}
		if (countryPopulations == "") {
			return noData;
		}
		else {
			return countryPopulations;
		}
	}
	
	/**
	 * toString method which returns a string representation of a CountryContinentQueryObject
	 */
	
	public String toString() {
	String countryContQueString = "";
	String noData = "There is no data in this countryContinentQuery object";
		for (int i=0; i<continentCt;i++) {
			for (int j=0; j<continentCt; j++) {
				if (continentArray[i].getCountryName().equals(countryArray[j].getName())){
					countryContQueString = countryContQueString + String.format("Country Name: %-3s, Located in: %-3s, Population: %-3d, Area: %-3d \n" , countryArray[j].getName(), continentArray[i].getContinentName(), countryArray[j].getPopulation(), countryArray[j].getArea());
					}
			}	
	}
		if (countryContQueString == ""){
			return noData;
		}
		else{
		return countryContQueString;
	}
	}
	
}
	
	
	
		
	


