package training.taylor.timetracker.core;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

/**
 * Created by Jason on 6/20/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerCoreConfigTest {

    @Autowired
    List<TimeEntry> entries;

    @Test
    public void testMe() {
        assertNotNull(entries);
    }

}
