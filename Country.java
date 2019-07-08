///////////////////////////////////////////
//      Spencer Poultney, 250982673      //
//      spoultne@uwo.ca                  //
//      Assignment 1, CS1027, 2018       //
///////////////////////////////////////////

public class Country {

	//Private variables for Country class
	private String name;
	private int population;
	private int area;
	private double popDensity;
	
	
	/**
	 * Constructor method used to create country object.
	 * @param name, the name of the country
	 * @param population, the population of the country
	 * @param area, the area of the country
	 */
	public Country(String name, int population, int area) {
		this.name = name;
		this.population = population;
		this.area = area;
		
	}
	
	/**
	 * Getter method for name of country object
	 * @return name of country object
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter method for population of country object
	 * @return population of country object
	 */
	
	public int getPopulation() {
		return population;
	}
	
	/**
	 * Getter method for area of country object
	 * @return area of country object
	 */
	
	public int getArea() {
		return area;
	}
	
	/**
	 * Setter method for name of a country object
	 * @param newName, new name for country object
	 */
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * Setter method for population of country object
	 * @param newPopulation, new population for country object
	 */
	
	public void setPopulation(int newPopulation) {
		this.population = newPopulation;
	}
	
	/**
	 * Setter method for area of country object
	 * @param newArea, new area for country object
	 */
	
	public void setArea(int newArea) {
		this.area = newArea;
	}
	
	/**
	 * Method to calculate the population density of a country object
	 * @return calculated population density of country object
	 */
	
	public double getPopulationDensity() {
		popDensity = this.population / this.area;
		return popDensity;
	}
	
	/**
	 * toString method to return String format of a country object
	 */
	
	public String toString(){
		String s= String.format("This country's name is: %-20s \n", this.getName()) +
			String.format("The country's population is: %-10d \n", this.getPopulation()) +
			String.format("The country's area is: %-10d \n" ,this.getArea()) +
			String.format("The country's population density is: %.2f \n", this.getPopulationDensity());
		return s;
		
	}
}
