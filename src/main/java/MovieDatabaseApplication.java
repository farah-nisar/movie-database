import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MovieDatabaseApplication extends Application<MovieDatabaseConfiguration> {

	@Override
	public void run(MovieDatabaseConfiguration configuration, Environment environment) throws Exception {
		// TODO Auto-generated method stub

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
