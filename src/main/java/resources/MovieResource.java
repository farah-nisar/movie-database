package resources;

import java.util.HashMap;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
	public Movie getMovieById(@PathParam("id") long id) {
		return MOVIES_COLLECTION.get(id);
	}

	@POST
	public void createMovie(Movie movie) {
		MOVIES_COLLECTION.put(movie.getId(), movie);
	}
	
	@DELETE
	@Path("{id}")
	public void deleteMovie(@PathParam("id") long movieId) {
		MOVIES_COLLECTION.remove(movieId);
	}
}
