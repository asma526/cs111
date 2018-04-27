public class Movietest{
		private String name, director, description;
		private int year;
		private int ratings;

	public Movietest(String name, String director, String description, int year, int ratings){
		this.name=name;
		this.director=director;
		this.description=description;
		this.year=year;
		this.ratings=ratings;
	}

	 public Movietest(String name) {
        this.name = name;
    }

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDirector(){
		return director;
	}
	public void setDirector(String director){
		this.director=director;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getRatings(){
		return ratings;
	}
	public void setRatings(int ratings){
		this.ratings=ratings;
	}

	public String toString(){
		return name + "\n" +year+ "\n" + ratings;
	}
	public boolean equals(Movietest other){
		if (name.equalsIgnoreCase(other.name) && director.equalsIgnoreCase(other.director)&& year==other.year){
			return true;
		}
		else{
			return false;
		}
	}

	public int compareTo(Movietest other){
		if (name.length() == other.name.length()){
			return 0;
		}
		else if(name.length()< other.name.length()){
			return -1;
		}
		else
			return 1;
	}

}
