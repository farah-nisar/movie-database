package movie;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

public class Movie {
	@NotEmpty
	private long id;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private DateTime releaseDate;
	
	@NotEmpty
	@Length(max = 2)
	private String language;
	
	private String countryOfOrigin;
	
	@NotEmpty
	// Movie running time in minutes
	private int runningTime;
	
	private String description;
	
	private String[] genres;
	
	public Movie(long id, String title, DateTime releaseDate, String language, int runningTime) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.language = language;
		this.runningTime = runningTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(DateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getGenres() {
		return genres;
	}

	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	
	
}
