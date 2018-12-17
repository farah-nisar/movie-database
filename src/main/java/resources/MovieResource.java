package resources;

import java.util.ArrayList;
import java.util.HashMap;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.ArrayUtils;

import movie.Movie;

@Path("/movie-database")
@Produces(MediaType.APPLICATION_JSON)
public class MovieResource {
	public static HashMap<Long, Movie> MOVIES_COLLECTION = new HashMap<Long, Movie>();

	@GET
	public HashMap<Long, Movie> getAllMovies() {
		// MOVIES_COLLECTION.put((long) 11, new Movie(11, "Movie 11", new DateTime(),
		// "EN", 120));
		return MOVIES_COLLECTION;
	}
	
	@GET
	@Path("{id}")
	public static Movie getMovieById(@PathParam("id") long id) {
		return MOVIES_COLLECTION.get(id);
	}

	@POST
	public static void createMovie(Movie movie) {
		MOVIES_COLLECTION.put(movie.getId(), movie);
	}
	
	@DELETE
	@Path("{id}")
	public void deleteMovie(@PathParam("id") long movieId) {
		MOVIES_COLLECTION.remove(movieId);
	}

	@PUT
	@Path("{id}")
	public void updateMovie(@PathParam("id") long movieId, Movie newMovie) {
		MOVIES_COLLECTION.remove(movieId);
		MOVIES_COLLECTION.put(movieId, newMovie);
	}

	@GET
	@Path("/genre/{genre}")
	public ArrayList<Movie> findMovieByGenre(@PathParam("genre") String genre) {
		/*
		 * Note: Since here we have stored the movies in memory in a map instead of some
		 * persistent database, our findBy* method loops through the collection and
		 * looks for the movie with the desired property.
		 * 
		 * Normally with some database at the backedn, Hibernate Criterias can be easily
		 * used to search for data which comes baked-in with the DropWizard framework.
		 * 
		 */
		ArrayList<Movie> movies = new ArrayList<Movie>();
		for (Movie m : MOVIES_COLLECTION.values()) {
			if (ArrayUtils.contains(m.getGenres(), genre))
				movies.add(m);
		}
		return movies;
	}
}
