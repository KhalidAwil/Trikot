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

    /**
     * Empty contructor
     */
    public Match(){}

    /**
     * Getter for match ID
     * @return Match id
     */
    public String getId() {
        return id;
    }

    /**
     * Getter for the latitude of the Match's location
     * @return Match's latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Setter for latitude of the Match's location
     * @param latitude Latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter for longitude of Match's location
     * @return Match's longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Setter for longitude of Match's location
     * @param longitude Longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Getter for Match's name
     * @return Match's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Match's name
     * @param name Name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Match's date and time
     * @return Match's date and time
     */
    //TODO Determine how Calendar object handles time and date
    public Calendar getMatchTime() {
        return matchTime;
    }


    /**
     * Helper method for setting Match's date and time in millis
     * @param matchTime Match's Calendar time in millis
     */
    public void setMatchTime(Long matchTime) {
        this.matchTime.setTimeInMillis(matchTime);
    }

    /**
     * Setter for updating the Match object
     * @param matchtime updated Match Calendar object
     */
    public void setMatchtimeValue(Calendar matchtime){
        setMatchTime(matchtime.getTimeInMillis());
    }
}

