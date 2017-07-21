package khalid.trikot;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Match class - Stores match information
 */
public class Match extends AbstractItem<Match, Match.ViewHolder> {
    private int id;
    private String name;
    private String locationName;
    private String latitude;
    private String longitude;
    private Calendar matchTime = Calendar.getInstance();
    private String owner;
    private String pitchType;
    private int aSide;
    private ArrayList<String> attendees;

    //Contructor
    public Match(int id, String name, String locationName){
        this.id = id;
        this.name = name;
        this.locationName = locationName;
    }

    //Method for outputting dummy matches to populate RecyclerView
    public List<Match> loadMatches(){
        List<Match> list = new LinkedList<>();
        for(int i = 0; i <=5; i++){
            list.add(new Match(i, "Match " + i, "Location " + i));
        }
        return list;
    }

    /**
     * Getter for match ID
     * @return Match id
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
     * Getter for location name, if there is one
     * @return Match location name
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Setter for location name
     * @param locationName Match location name
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * Getter for Match attendees
     * @return ArrayList of User ID strings
     */
    public ArrayList<String> getAttendees() {
        return attendees;
    }

    /**
     * Setter for Match attendees
     * @param attendees ArrayList of User ID strings
     */
    public void setAttendees(ArrayList<String> attendees) {
        this.attendees = attendees;
    }

    /**
     * Getter for Owner User ID
     * @return User ID String of Owner User
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter for Owner User ID
     * @param owner Match Owner User ID String
     */
    public void setOwner(String owner) {
        this.owner = owner;
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
     * Setter for Match datetime Calender object
     * @param matchTime Calender object containing updated matchtime
     */
    public void setMatchTime(Calendar matchTime) {
        this.matchTime = matchTime;
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

    /**
     * Getter for Match "# a side" value
     * @return Match "A Side" value
     */
    public int getaSide() {
        return aSide;
    }

    /**
     * Setter for Match "# a side" value
     * @param aSide Match "A Side" value
     */
    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    /**
     * Getter for Match Pitch Type String value - Ex. "Turf, Grass, Concrete, Wood..."
     * @return Match Pitch Type value
     */
    public String getPitchType() {
        return pitchType;
    }

    /**
     * Setter for Match Pitch Type String value
     * @param pitchType Match Pitch type string value
     */
    public void setPitchType(String pitchType) {
        this.pitchType = pitchType;
    }


    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_match_list_item;
    }

    @Override
    public ViewHolder getViewHolder(View v) {
        return null;
    }

    //The logic to bind your data to the view
    @Override
    public void bindView(ViewHolder viewHolder, List<Object> payloads) {
        //call super so the selection is already handled for you
        super.bindView(viewHolder, payloads);

        //bind our data
        //set the text for the name
        viewHolder.matchName.setText(name);
        //set the text for the description or hide
        viewHolder.matchLocation.setText(locationName);
    }


    protected static class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView matchName;
        public final TextView matchLocation;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            matchName = (TextView) view.findViewById(R.id.item_match_name);
            matchLocation = (TextView) view.findViewById(R.id.item_match_location);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + matchLocation.getText() + "'";
        }
    }
}



