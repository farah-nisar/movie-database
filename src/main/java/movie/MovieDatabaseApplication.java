package movie;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resources.MovieResource;

public class MovieDatabaseApplication extends Application<MovieDatabaseConfiguration> {
	public static void main(String[] args) throws Exception {
		new MovieDatabaseApplication().run(args);
	}
	@Override
	public void run(MovieDatabaseConfiguration configuration, Environment environment) throws Exception {
		environment.jersey().register(new MovieResource());
		environment.healthChecks().register("Generic Health Check", new MovieDatabaseHealthCheck());
	}
	
	@Override
	public String getName() {
		return "My Movies Database Mini Project";
	}
	
	@Override
	public void initialize(Bootstrap<MovieDatabaseConfiguration> bootstrap) {
		// TODO Auto-generated method stub
		super.initialize(bootstrap);
	}
}
