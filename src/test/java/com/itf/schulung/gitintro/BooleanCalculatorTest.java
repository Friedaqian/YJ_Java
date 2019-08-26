package com.itf.schulung.gitintro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BooleanCalculatorTest {

	//TODO: Raise Boolean Calculator Test to 100% Coverage
	
	    @Test
	    @DisplayName("Texts ist it true")
	    public void isItTrue() {
	        // assert statements
	    	assertEquals(true, BooleanCalculator.and(true, true), "true and true must be true");
	    	assertEquals(true, BooleanCalculator.or(true, true), "true or true must be true");
	    	assertEquals(true, BooleanCalculator.or(false, true), "true or false must be true");
	    	
	    }
	    
	    @Test
	    @DisplayName("Texts ist it false")
	    public void isItFalse() {
	        // assert statements
	    	assertEquals(false, BooleanCalculator.and(false, true), "true and false must be false");
	    	assertEquals(false, BooleanCalculator.and(true, false), "true and false must be false");
	    	assertEquals(false, BooleanCalculator.or(false, false), "false or false must be false");
	    	assertEquals(false, BooleanCalculator.and(false, false), "false and false must be true");
	    }
	    
	    @Test
	    @DisplayName("Texts booleanList")
	    public void booleanList() {
	        // assert statements
	    	assertEquals(false, BooleanCalculator.specialAnd(null), "Boollist ist null");
	    	
	    }
	   
	    
	    @Test
		@DisplayName("Tests Class")
		public void tsClass() {
			assertNotNull(new BooleanCalculator(), "constructor should not be empty");
			assertNull(null, "null");
		}
	    
//	    @Test
//	    @DisplayName("Texts booleanList")
//	    public void booleanListNotNull() {
//	    	
//	    	List<Boolean> boolList = new ArrayList<Boolean>();
//	    	boolList.add(true);
//	    	
//	    	assertEquals(false, BooleanCalculator.specialAnd(boolList), "Boollist ist size 1");
//	    	
//	    }
	    
	    
	    
	    
}
