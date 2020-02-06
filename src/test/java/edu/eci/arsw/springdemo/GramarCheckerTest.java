/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.springdemo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author juan.villate-i
 */
public class GramarCheckerTest {
    @Test
    public void probarGrammarEspanol() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GrammarChecker gc = ac.getBean(GrammarChecker.class);
        
        String correct;
        correct="Spell checking output:revisando (la la la) con el verificador de sintaxis del espanolPlagiarism checking output: Not available yet";
        assertTrue(correct.equals(gc.check("la la la")));

    }
}
