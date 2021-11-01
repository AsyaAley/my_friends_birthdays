import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BirthdayContainer {

    private final Map<String, Collection<Birthdate>> birthdayMap = new HashMap<>();

    public void addBirthday(Birthdate birthdate) {
        birthdayMap.computeIfAbsent(birthdate.getPersonName(), k -> new ArrayList<>()).add(birthdate);
    }

    public Collection<Birthdate> getBirthdaysByName(String personName) {
        return birthdayMap.get(personName);
    }

}
