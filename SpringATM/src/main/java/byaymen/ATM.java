package byaymen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ATM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Min(1)
	private long id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Min(1)
	private long acct;

	
	
	@NotNull
	@Size(min = 2, max = 30)
	private String reason;
	
}
