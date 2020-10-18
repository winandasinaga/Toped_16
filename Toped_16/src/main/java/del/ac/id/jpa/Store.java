package del.ac.id.jpa;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("store")
public class Store {

	private String store_name;
	private String location;
	private String points;
	private String reputation;
	private String latest_online;
	
	public Store() {}

	public Store(final String reputation, final String store_name, final String location, final String points, final String latest_online) {
		super();
		
		this.store_name = store_name;
		this.location = location;
		this.points = points;
		this.reputation = reputation;
		this.latest_online = latest_online;
	}

	public String getLatest_Online() {
		return latest_online;
	}

	public void setLatest_Online(String latest_online) {
		this.latest_online = latest_online;
	}
	public String getReputation() {
		return reputation;
	}

	public void setReputation(String reputation) {
		this.reputation = reputation;
	}
	public String getCondition() {
		return store_name;
	}

	public void setCondition(String store_name) {
		this.store_name = store_name;
	}

	public String getInsurance() {
		return location;
	}

	public void setInsurance(String location) {
		this.location = location;
	}

	public String getCategory() {
		return points;
	}

	public void setCategory(String points) {
		this.points = points;
	}
	
	
}
