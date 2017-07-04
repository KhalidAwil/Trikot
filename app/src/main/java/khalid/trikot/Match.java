package khalid.trikot;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Match class - Stores match information
 */
public class Match {
    private String id;
    private String name;
    private String latitude;
    private String longitude;
    private Calendar matchTime = Calendar.getInstance();
    private String owner;
    private ArrayList<String> attendees;
}
