/**
 * 
 */
package com.sivalabs.mockdata;

import java.util.ArrayList;
import java.util.List;

import com.sivalabs.core.domain.Movie;

/**
 * @author skatam
 *
 */
public class SampleData 
{
	public static List<Movie> getMovies() 
	{
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(1, "KungfuPanda"));
		movies.add(new Movie(5, "KungfuPanda 2"));
		movies.add(new Movie(2, "Taken"));
		movies.add(new Movie(3, "Pursuit Of Happiness"));
		movies.add(new Movie(4, "Madagascar I"));
		movies.add(new Movie(6, "Madagascar II"));
		
		return movies;
	}
}
