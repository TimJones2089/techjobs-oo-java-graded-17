
package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(test_job.getName() instanceof String);
        assertEquals("Product tester", test_job.getName());

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job.getEmployer().toString());

        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals("Desert", test_job.getLocation().toString());

        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job.getPositionType().toString());

        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job.getCoreCompetency().toString());

    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String firstChar = String.valueOf(testJob1.toString().charAt(0));
        String lastChar = String.valueOf(testJob1.toString().charAt(testJob1.toString().length()-1));

        assertEquals(firstChar, "\r");
        assertEquals(lastChar, "\n");


    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        String expected = lineSeparator() +
                "ID: " + testJob1.getId() + lineSeparator() +
                "Name: " + testJob1.getName() + lineSeparator() +
                "Employer: " + testJob1.getEmployer() + lineSeparator() +
                "Location: " + testJob1.getLocation() + lineSeparator() +
                "Position Type: " + testJob1.getPositionType() + lineSeparator() +
                "Core Competency: " + testJob1.getCoreCompetency() + lineSeparator();
        assertEquals(expected, testJob1.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob1 = new Job();

        String expected = lineSeparator() +
                "ID: " + testJob1.getId() + lineSeparator() +
                "Name: Data not available" + lineSeparator() +
                "Employer: Data not available" + lineSeparator() +
                "Location: Data not available" + lineSeparator() +
                "Position Type: Data not available" + lineSeparator() +
                "Core Competency: Data not available" +
                lineSeparator();

        assertEquals(expected, testJob1.toString());

        }


}
