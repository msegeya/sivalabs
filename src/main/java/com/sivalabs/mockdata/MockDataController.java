/**
 * 
 */
package com.sivalabs.mockdata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sivalabs.core.domain.Country;
import com.sivalabs.core.domain.Movie;
import com.sivalabs.core.domain.User;
import com.sivalabs.core.json.JSONResponse;

/**
 * @author skatam
 *
 */
@Controller
public class MockDataController
{
	@RequestMapping(value = "/something", method = RequestMethod.POST)
	@ResponseBody
	//public User handle(@RequestBody String body) throws IOException 
	public User handle(@RequestBody User user) throws IOException 
	{
		System.out.println("Username From Client : "+user.getUserName());
		System.out.println("EmailId from Client : "+user.getEmailId());
		user.setUserName("SivaPrasadReddy");
		user.setEmailId("siva@sivalabs.com");		
		return user;
	}
	
	@RequestMapping("/getCountries")
	@ResponseBody
	public JSONResponse getCountries(HttpServletResponse response) {
		response.setContentType("application/json");
		List<Country> countries = new ArrayList<Country>();
		countries.add(new Country(1, "India"));
		countries.add(new Country(2, "China"));
		countries.add(new Country(3, "USA"));
		countries.add(new Country(4, "Canada"));
		return new JSONResponse(countries);
	}
	
	@RequestMapping("/getFavoriteMovies")
	@ResponseBody
	public JSONResponse getFavoriteMovies(@RequestParam("query")String query, HttpServletResponse response) {
		response.setContentType("application/json");
		List<Movie> allMovies = SampleData.getMovies();
		List<Movie> movies = new ArrayList<Movie>();
		for (Movie movie : allMovies) {
			if(movie.getName().toLowerCase().startsWith(query.toLowerCase())){
				movies.add(movie);
			}
		}
		return new JSONResponse(movies);
	}
}
