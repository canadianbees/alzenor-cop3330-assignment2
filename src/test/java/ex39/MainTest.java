/*
 *  UCF COP3330 Fall 2021 assignment_name Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex39;

import org.junit.Test;


import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void printTable()
    {
        Map<String, People> test1 = new TreeMap<>();
        test1.put("Martin", new People("John","Martin","Manager","2001-8-25"));
        test1.put("Jabr", new People("Tou","Bradford","Software Engineer","1996-07-06"));
        test1.put("Smith", new People("Michaela","Smith","District Manager","2007-5-04"));
        test1.put("Chavez", new People("Jake","Chavez","Programmer","2021-9-18"));
        test1.put("Jackson", new People("Jacquelyn","Jackson","Intern",""));
        test1.put("Lane", new People("Sally","Lane","Intern","2009-04-22"));
        test1.put("King", new People("Karen","King","Product Manager","2010-10-31"));
        test1.put("Pratt", new People("Lee","Pratt","Software Developer","2004-01-25"));
        test1.put("Piker", new People("Michael","Piker","Software Engineer","2001-12-27"));
        test1.put("Wayne", new People("Bruce","Wayne","Programmer",""));
        test1.put("Florence", new People("Michelle","Florence","Intern",""));
        test1.put("Webber", new People("Janice","Webber","Human Resources","2020-12-18"));

        Records test = new Records();
       assertTrue(test.sort(test1));
    }
}
