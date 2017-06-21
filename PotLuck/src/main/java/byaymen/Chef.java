package byaymen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Chef {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	@Size(min = 2, max = 30)
	private String chefName;

	@NotNull
	@Size(min = 2, max = 30)
	private String dish;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getchefName() {
		return chefName;
	}

	public void setchefName(String chefName) {
		this.chefName = chefName;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	@Override
	public String toString() {
		return "Chef{" + "id=" + id + ", chefName='" + chefName + '\'' + ", dish='" + dish + '\'' + '}';
	}

}
