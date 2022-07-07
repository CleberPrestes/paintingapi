package com.prestes.painting.model;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Painting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String link;
	
	@Column
	private String artist;
	
	@Column
	private int madeIn;
	
	
	public int getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(int madeIn) {
		this.madeIn = madeIn;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artist, id, link, madeIn, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Painting other = (Painting) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(id, other.id) && Objects.equals(link, other.link)
				&& madeIn == other.madeIn && Objects.equals(name, other.name);
	}


	
	
	
	
	

}
