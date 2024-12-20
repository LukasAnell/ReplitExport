import java.util.ArrayList;

public class UserName {
    // The list of possible usernames, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames;

    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain only uppercase and lowercase letters.
     */
    public UserName(String firstName, String lastName) {
        possibleNames = new ArrayList<>();
        for(int i = 0; i < lastName.length(); i++) {
            possibleNames.add(lastName + firstName.substring(0, i + 1));
        }
    }

    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(name.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */
    public void setAvailableUserNames(String[] usedNames) {
        for(int i = possibleNames.size() - 1; i >= 0; i--) {
            if(isUsed(possibleNames.get(i), usedNames)) {
                possibleNames.remove(i);
            }
        }
    }
}
