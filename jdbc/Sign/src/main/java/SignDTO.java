
public class SignDTO {

	private String songs ;
	private String cars ;
	private String mobiles;
	private String apps;
	private String bikes;
	public SignDTO(String songs, String cars, String mobiles, String apps, String bikes) {
		super();
		this.songs = songs;
		this.cars = cars;
		this.mobiles = mobiles;
		this.apps = apps;
		this.bikes = bikes;
	}
	public void setSongs(String songs) {
		this.songs = songs;
	}
	public void setCars(String cars) {
		this.cars = cars;
	}
	public void setMobiles(String mobiles) {
		this.mobiles = mobiles;
	}
	public void setApps(String apps) {
		this.apps = apps;
	}
	public void setBikes(String bikes) {
		this.bikes = bikes;
	}
	public String getSongs() {
		return songs;
	}
	public String getCars() {
		return cars;
	}
	public String getMobiles() {
		return mobiles;
	}
	public String getApps() {
		return apps;
	}
	public String getBikes() {
		return bikes;
	}
	@Override
	public String toString() {
		return "SignDTO [songs=" + songs + ", cars=" + cars + ", mobiles=" + mobiles + ", apps=" + apps + ", bikes="
				+ bikes + "]";
	}
	
	
}
