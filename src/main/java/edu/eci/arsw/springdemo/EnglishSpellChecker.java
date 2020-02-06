package edu.eci.arsw.springdemo;

import org.springframework.stereotype.Service;

//@Service
public class EnglishSpellChecker implements SpellChecker {

    /**
     * 
     * @param text
     * @return 
     */
    @Override
    public String checkSpell(String text) {		
	return "Checked with english checker:"+text;
    }

        
}
