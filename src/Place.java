/**
 * Created by Administrator on 2015/9/26.
 */
public class Place implements Comparable<Place> {
   private String Zip,State,TOWN_NAME;

    //set up Place
    public Place(String zipcode, String state,String town){
        this.Zip = zipcode;
        this.State = state;
        this.TOWN_NAME = town;
    }

    protected String getZip() {return Zip;}
    protected String getTown() {
        return TOWN_NAME;
    }
    protected String getState() {
        return State;
    }
    protected String modifier(){
        return Zip;
    }

    // display the property of the place
    public String toString(){
       String result= "The zip code "+this.Zip + " belongs to " + this.TOWN_NAME + ", " + this.State;
        return result;
    }
     public boolean equals(String var1) {
        return this.TOWN_NAME.equals(var1);
       }

        public boolean equalsIgnoreCase(String var){
            return this.TOWN_NAME.equalsIgnoreCase(var);
        }

    @Override

    //set the rule of the sort Ascending
    public int compareTo(Place place) {
        Integer inputZip  =Integer.parseInt(this.getZip());
        Integer zip=Integer.parseInt(place.getZip());
        return inputZip.compareTo(zip);
    }
}
