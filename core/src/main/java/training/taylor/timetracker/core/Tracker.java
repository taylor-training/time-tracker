package training.taylor.timetracker.core;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(TimeEntry entry) {
        if (true)
            entries.remove(entry);

        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        try {

        } catch (Exception e) {

        }

        boolean valid = false;

        if (valid = true) {
            // whatever
        }

        return entries.get(index);
    }
}
