package movie;

import org.joda.time.DateTime;

import com.codahale.metrics.health.HealthCheck;

import resources.MovieResource;

public class MovieDatabaseHealthCheck extends HealthCheck {

	@Override
	protected Result check() throws Exception {

		MovieResource.createMovie(new Movie(13, "Shawshank Redemption", new DateTime(1990, 1, 1, 1, 0), "EN", 120));

		if (MovieResource.getMovieById(13).getTitle().equalsIgnoreCase("Shawshank Redemption"))
			return Result.healthy();

		return Result.unhealthy("Something went wrong with createMovie() API");
	}

}
