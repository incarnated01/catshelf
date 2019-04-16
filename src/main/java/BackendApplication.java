import net.catshelf.backend.domain.security.UserRole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Entity
	public static class role implements Serializable {
		private static final long serialVersionUID = 123456L;

		@Id
		private int roleID;
		private String name;
		private Set<UserRole> userRoles = new HashSet<>();

		public role(){}

		public int getRoleID() {
			return roleID;
		}

		public void setRoleID(int roleID) {
			this.roleID = roleID;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<UserRole> getUserRoles() {
			return userRoles;
		}

		public void setUserRoles(Set<UserRole> userRoles) {
			this.userRoles = userRoles;
		}
	}
}
