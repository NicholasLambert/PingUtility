import java.io.BufferedReader;
import java.io.InputStreamReader;


public class pingDevice {
	
	//Variables
	String building = "";
	int room = 0;
	String device = "";
	String domain = "";
	
	
	void setBuilding(String buildingCode) {
		building = buildingCode;
	}
	
	
	void setRoom(int roomNum) {
		room = roomNum;
	}
	
	
	void setDevice(String deviceType) {
		device = deviceType;
	}
	
	
	void setDomain(String domainLocation) {
		domain = domainLocation;
	}
	
	
	public String createCommand() {
		String deviceToPing = building + "-" + room + "-" + device + "." + domain;
		return runSystemCommand(deviceToPing);
	}
	
	
	//Takes in the the device name and returns a chunk of data based on if you can ping the device or not
	public static String runSystemCommand(String command) {
		String returnString = "";
		try {
			Process p = Runtime.getRuntime().exec("ping " + command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));
			
			String s = "";
			//reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				//System.out.println(s);
				returnString += "\n " + s;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnString;
	}
}
