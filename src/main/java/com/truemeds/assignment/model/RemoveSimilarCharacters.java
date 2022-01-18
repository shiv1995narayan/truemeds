package com.truemeds.assignment.model;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shivnarayan_mewada_java_output")
public class RemoveSimilarCharacters implements Serializable {
	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="id")
	    private int id;
		
		@Column(name="count")
	    private int count;
	 
	    @Column(name="created_by")
	    private String name;
	 
	    @Column(name="creationdate_timestamp")
	    private Date creationdate_timestamp ;
	    
	    @Column(name="final_output")
	    private String final_output;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getCreationdate_timestamp() {
			return creationdate_timestamp;
		}

		public void setCreationdate_timestamp(Date creationdate_timestamp) {
			this.creationdate_timestamp = creationdate_timestamp;
		}

		public String getFinal_output() {
			return final_output;
		}

		public void setFinal_output(String final_output) {
			this.final_output = final_output;
		}
	 
	 
	   
}
