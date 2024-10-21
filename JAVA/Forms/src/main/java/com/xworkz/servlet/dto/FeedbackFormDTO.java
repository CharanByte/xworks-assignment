package com.xworkz.servlet.dto;

import java.io.Serializable;

public class FeedbackFormDTO implements Serializable {
	private String name;
	private String email;
	private String comments;

	public FeedbackFormDTO() {
		super();
	}

	public FeedbackFormDTO(String name, String email, String comments) {
		super();
		this.name = name;
		this.email = email;
		this.comments = comments;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return "FeedbackFormDTO [name=" + name + ", email=" + email + ", comments=" + comments + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeedbackFormDTO other = (FeedbackFormDTO) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
