package model;

public class Account {
	private String username;
	private String password;

	/*
	Every method is self-explanatory. No need for documentation.
	 */

	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Account account = (Account) o;

		if (!username.equals(account.username)) return false;
		return password.equals(account.password);
	}

	@Override
	public int hashCode() {
		int result = username.hashCode();
		result = 31 * result + password.hashCode();
		return result;
	}
}
