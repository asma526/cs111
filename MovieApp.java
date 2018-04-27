public class MovieApp {
  private Movie[] items;     // keep movies in an unsorted array
  private int numberOfItems; // number of movies in the array

  /*
   * Default constructor allocates array with capacity for 20 movies
   */
  MovieApp () {
    items = new Movie[20];
    numberOfItems = 0;
  }

  /*
   * One argument constructor allocates array with user defined capacity
   *
   * @param capacity defines the capacity of the movie library
   */
  MovieApp (int capacity) {
    items = new Movie[capacity];
    numberOfItems = 0;
  }

  /*
   * Add a movie into the library (unsorted array)
   *
   * Inserts @m into the first empty spot in the array.
   * If the array is full (there is no space to add another movie)
   *   - create a new array with double the size of the current array
   *   - copy all current movies into new array
   *   - add new movie
   *
   * @param m The movie to be added to the libary
   *
   */
  public void addMovie (Movie m) {
    if(numberOfItems == items.length){
      Movie newarray[] = new Movie[items.length * 2];
      for(int i = 0; i < items.length; i++){
        newarray[i]= items[i];
      }
      newarray[items.length] = m;
      items = newarray;
      numberOfItems += 1;
    }else{
      for(int i = 0; i < numberOfItems; i++){
        if(items[i] == null){
          items[i] = m;
          numberOfItems += 1;
          break;
        }
      }
    }
  }

  /*
   * Removes a movie from the library. Returns true if movie is removed, false
   * otherwise.
   * The array should NOT become sparse after a remove, that is, all movies
   * should be in consecutive array indices.
   *
   * @param m The movie to be removed
   * @return Returns true is movie is successfuly removed, false otherwise
   *
   */
  public boolean removeMovie (Movie m) {
    for (int i = 0; i < numberOfItems; i++) {
        if (items[i].equals(m)) {
          if (i == numberOfItems - 1){
            numberOfItems -= 1;
          }else {
            for (int j = i; j < numberOfItems - 1; j++) {
              items[j] = items[j + 1];
            }
            numberOfItems--;
          }
          return true;
        }
    }
    return false;
  }

    /*
     * Returns the library of movies
     *
     * @return The array of movies
     */
  public Movie[] getMovies () {
    return items;
  }

    /*
     * Returns the current number of movies in the library
     *
     * @return The number of items in the array
     */
  public int getNumberOfItems () {
    return numberOfItems;
  }

    /*
     * Update the rating of movie @m to @ratings
     *
     * @param @m The movie to have its ratings updated
     * @param @ratings The new ratings of @m
     * @return tue if update is successfull, false otherwise
     *
     */
  public boolean updateRating (Movie m, int ratings) {
    for(int i=0; i < numberOfItems; i++){
      if(items[i]==m){
        items[i].setRatings(ratings);
        return true;
      }
    }
    return false;
  }

    /*
     * Prints all movies
     */
  public void print () {
    for(int i = 0; i < items.length; i++){
      System.out.println(items[i]);
    }
  }

    /*
     * Return all the movies by @director. The array size should be the
     * number of movies by @director.
     *
     * @param director The director's name
     * @return An array of all the movies by @director
     *
     */
  public Movie[] getMoviesByDirector (String director) {
    int count = 0;
    for (int i = 0; i < numberOfItems; i++){
      if (items[i].getDirector().equalsIgnoreCase(director))
        count += 1;
    }
    Movie[] directorArr = new Movie[count];
    for (int j = 0; j < numberOfItems; j++){
      if (items[j].getDirector().equalsIgnoreCase(director)){
        for (int k = 0; k < count; k++){
          if (directorArr[k] == null){
            directorArr[k] = items[j];
            break;
          }
        }
      }
    }
    return directorArr;
  }

    /*
     * Returns all the movies made in @year. The array size should be the
     * number of movies made in @year.
     *
     * @param year The year the movies were made
     * @return An array of all the movies made in @year
     *
     */
  public Movie[] getMoviesByYear (int year) {
    int count = 0;
    for (int i = 0;i < numberOfItems; i++){
      if (items[i].getYear() == year){
        count += 1;
      }
    }
    Movie[] yearArr = new Movie[count];
    for (int j = 0; j < numberOfItems; j++){
      if (items[j].getYear() == year){
        for (int k = 0; k < count; k++){
          if (yearArr[k] == null){
            yearArr[k] = items[j];
            break;
          }
        }
      }
    }
    return yearArr;
  }

    /*
     * Returns all the movies with ratings greater then @ratings. The array
     * size should match the number of movies with ratings greater than @ratings
     *
     * @param ratings
     * @return An array of all movies with ratings greater than @ratings
     *
     */
  public Movie[] getMoviesWithRatingsGreaterThan (int ratings) {
    Movie betterRatingsArr[] = new Movie[numberOfItems];
    for(int i = 0; i < numberOfItems; i++){
      Movie ptr = items[i];
      if(ptr.getRatings() > ratings){
        betterRatingsArr[i]=ptr;
      }
    }
    return betterRatingsArr;
  }
}
