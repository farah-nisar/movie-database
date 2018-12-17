package movie;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

/**
 * Movie entity with an array of possible fields. The id, title, releaseDate,
 * language and runningTime fields are required for the movie model, the rest
 * are optional and added for completeness.
 * 
 * @author farahnisar
 */
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
	
	private float userRating;

	private float criticsRating;

	/*
	 * URL to the movie's poster image. Can be stored in some FTP of cloud file
	 * system.
	 */
	private String posterImageUrl;

	private String trailerUrl;

	private String website;

	private String studioName;

	private Actor[] cast;

	private Director[] directors;

	private String[] awardNominations;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(long id, String title, DateTime releaseDate, String language, int runningTime) {
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.language = language;
		this.runningTime = runningTime;
	}

	public Movie(long id, String title, DateTime releaseDate, String language, String countryOfOrigin, int runningTime,
			String description, String[] genres, float userRating, float criticsRating, String posterImageUrl,
			String trailerUrl, String website, String studioName, Actor[] cast, Director[] directors,
			String[] awardNominations) {
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.language = language;
		this.countryOfOrigin = countryOfOrigin;
		this.runningTime = runningTime;
		this.description = description;
		this.genres = genres;
		this.userRating = userRating;
		this.criticsRating = criticsRating;
		this.posterImageUrl = posterImageUrl;
		this.trailerUrl = trailerUrl;
		this.website = website;
		this.studioName = studioName;
		this.cast = cast;
		this.directors = directors;
		this.awardNominations = awardNominations;
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

	public float getUserRating() {
		return userRating;
	}

	public void setUserRating(float userRating) {
		this.userRating = userRating;
	}

	public float getCriticsRating() {
		return criticsRating;
	}

	public void setCriticsRating(float criticsRating) {
		this.criticsRating = criticsRating;
	}

	public String getPosterImageUrl() {
		return posterImageUrl;
	}

	public void setPosterImageUrl(String posterImageUrl) {
		this.posterImageUrl = posterImageUrl;
	}

	public String getTrailerUrl() {
		return trailerUrl;
	}

	public void setTrailerUrl(String trailerUrl) {
		this.trailerUrl = trailerUrl;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getStudioName() {
		return studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}

	public Actor[] getCast() {
		return cast;
	}

	public void setCast(Actor[] cast) {
		this.cast = cast;
	}

	public Director[] getDirectors() {
		return directors;
	}

	public void setDirectors(Director[] directors) {
		this.directors = directors;
	}

	public String[] getAwardNominations() {
		return awardNominations;
	}

	public void setAwardNominations(String[] awardNominations) {
		this.awardNominations = awardNominations;
	}

}
