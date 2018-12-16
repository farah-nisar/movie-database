package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.joda.time.DateTime;

import movie.Movie;

@Path("/movie-database")
@Produces(MediaType.APPLICATION_JSON)
public class MovieResource {

	@GET
	public Movie getMovie() {
		return new Movie(1, "title 1", new DateTime(), "EN", 120);
	}
	
}
