package Practice;
import java.util.*;
public class Attendees {
static HashSet<Integer> hs = new HashSet<>();
static void checkIn(int id) {
if(!hs.contains(id)) {
hs.add(id);
}
}
static boolean isCheckedIn(int id) {
if(hs.contains(id)) {
return true;
}
return false;
}
static void removeCheck(int id) {
hs.remove(id);
}
static void displayAllCheckedIn(){
System.out.println(hs);
}
public static void main(String[] args) {
Attendees.checkIn(22);
Attendees.checkIn(12);
Attendees.checkIn(20);
Attendees.removeCheck(22);
System.out.println(Attendees.isCheckedIn(12));
Attendees.displayAllCheckedIn();
} 

}
