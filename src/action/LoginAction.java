package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;

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
	public void validate(){
		if(username.isEmpty()){
			addFieldError("username", getText("username.empty"));
			System.out.println(getText("username.empty"));
			
		}
		else if(password.isEmpty()){
			addFieldError("password", getText("password.empty"));
		}
	}
	@Override
	public String execute(){
		return SUCCESS;
	}
	
}
