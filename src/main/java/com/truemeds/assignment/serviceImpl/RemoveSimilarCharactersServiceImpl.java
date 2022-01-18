package com.truemeds.assignment.serviceImpl;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truemeds.assignment.model.RemoveSimilarCharacters;
import com.truemeds.assignment.repository.RemoveSimilarCharacterRepository;

@Service
public class RemoveSimilarCharactersServiceImpl implements RemoveSimilarCharactersService{
	
	private static final Logger logger = LogManager.getLogger(RemoveSimilarCharactersServiceImpl.class);
	@Autowired
	private RemoveSimilarCharacterRepository repo;
	
	public static int count=0;
	@Override
	public RemoveSimilarCharacters createData(RemoveSimilarCharacters removeSimilarCharactor) {
		//String str1="aabcbb cdee";
		//String str1="baacdccce";
		List<String> listData=repo.getAllString();
		logger.info("outside for loop String==={}"+listData);
		for(String listString:listData) {
			logger.info("inside for loop String==={}"+listString);
			String str=listString.replaceAll("[^a-zA-Z]","");
			logger.info("output sort String==={}"+str);
			String final_str=ShortenString(str);
			saveData(final_str);
			count=0;
		}
		
		return removeSimilarCharactor;
	}

	private String  ShortenString(String str1) {
		char last_removed = '\0';
	    return removeUtil(str1, last_removed);  
    }

	private String removeUtil(String str, char last_removed) {
		 
	    if (str.length() == 0 || str.length() == 1)
	      return str;
	    if (str.charAt(0) == str.charAt(1))
	    {
	      last_removed = str.charAt(0);
	      while (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
	    	  str = str.substring(1, str.length());
	      }
	      count++;
	      str = str.substring(1, str.length());
	      return removeUtil(str, last_removed); 
	    }

	    String rem_str = removeUtil(str.substring(
	                  1,str.length()), last_removed);

	    if (rem_str.length() != 0 && 
	             rem_str.charAt(0) == str.charAt(0))
	    {
	      last_removed = str.charAt(0);
	      count++;
	      return rem_str.substring(1,rem_str.length()); 
	    } 
	    if (rem_str.length() == 0 && last_removed == 
	                                      str.charAt(0))
	      return rem_str;
	    return (str.charAt(0) + rem_str);
	}
	private void saveData(String final_str) {
		RemoveSimilarCharacters removeSimilarCharacter=new RemoveSimilarCharacters();
		removeSimilarCharacter.setCount(count);
		removeSimilarCharacter.setFinal_output(final_str);
		removeSimilarCharacter.setName("Shivnarayan Mewada");
		removeSimilarCharacter.setCreationdate_timestamp(new Date());
		logger.info("final_str===={}"+final_str);
		logger.info("count_final===={}"+count);
	    repo.save(removeSimilarCharacter);
	}
}
