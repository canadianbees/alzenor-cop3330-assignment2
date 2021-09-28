/*
 *  UCF COP3330 Fall 2021 assignment_name Solution
 *  Copyright 2021 Celina Alzenor
 */

package ex40;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void printTable()
    {
        Map<String, Workers> test1 = new TreeMap<>();
        test1.put("Martin", new Workers("John","Martin","Manager","2001-8-25"));
        test1.put("Jabr", new Workers("Tou","Bradford","Software Engineer","1996-07-06"));
        test1.put("Smith", new Workers("Michaela","Smith","District Manager","2007-5-04"));
        test1.put("Chavez", new Workers("Jake","Chavez","Programmer","2021-9-18"));
        test1.put("Jackson", new Workers("Jacquelyn","Jackson","Intern",""));
        test1.put("Lane", new Workers("Sally","Lane","Intern","2009-04-22"));
        test1.put("King", new Workers("Karen","King","Product Manager","2010-10-31"));
        test1.put("Pratt", new Workers("Lee","Pratt","Software Developer","2004-01-25"));
        test1.put("Piker", new Workers("Michael","Piker","Software Engineer","2001-12-27"));
        test1.put("Wayne", new Workers("Bruce","Wayne","Programmer",""));
        test1.put("Florence", new Workers("Michelle","Florence","Intern",""));
        test1.put("Webber", new Workers("Janice","Webber","Human Resources","2020-12-18"));

        EmpRecords test = new EmpRecords();
       assertTrue(test.findEmp(test1,"Mich"));
    }
}
