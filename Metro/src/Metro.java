

import java.util.*;

class Metro {

	int MAX_SIZE;
	int avail;
	int smalll;
	String stationName;
	String stName;
	int numOfStations;
	int ans[];

	Metro() {
		MAX_SIZE = 1000;
		avail = 0;
		smalll = 1000;
		numOfStations = 0;
		headStation = null;
		tail = null;
		connection = new NodeConnection[200];
		p = new NodeConnection[200];
		ans = new int[100];
		setStations();
		pointTowardsNull();
		setConnection();
	}

	public void start(){
		menu();
	}
	class NodeStation {
		int station_no;
		String name;
		NodeStation next;
	}

	NodeStation headStation;
	NodeStation tail;

	private int spitStation(String name) {
		NodeStation temp = headStation;
		while (temp != null) {
			if (name.equals(temp.name) == true)
				return temp.station_no;
			temp = temp.next;
		}
		return -1;
	}

	private String spitName(int num) {
		NodeStation temp10 = headStation;
		while (temp10 != null) {
			if (temp10.station_no == num)
				return temp10.name;
			temp10 = temp10.next;
		}
		return null;
	}

	private void pushStation() {
		NodeStation temp = new NodeStation();
		numOfStations++;
		temp.station_no = numOfStations;
		System.out.print("\nStation name: ");
		Scanner s = new Scanner(System.in);
		temp.name = s.nextLine();
		temp.next = null;
		if (headStation == null) {
			headStation = temp;
			tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
	}

	private void pushStation(String name) {
		NodeStation temp = new NodeStation();
		numOfStations++;
		temp.station_no = numOfStations;
		temp.name = name;
		temp.next = null;
		if (headStation == null) {
			headStation = temp;
			tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
	}

	private void showStations() {
		if (headStation == null) {
			System.out.print("\nNo Station.");
			return;
		}
		NodeStation temp = headStation;
		System.out.println();
		while (temp != null) {
			System.out.println("\t" + temp.station_no + " : " + temp.name);
			temp = temp.next;
		}
	}

	class NodeConnection {
		int index;
		NodeConnection next;
	}

	NodeConnection connection[];
	NodeConnection temp;
	NodeConnection p[];

	private void pointTowardsNull() {
		for (int i = 0; i < connection.length; ++i) {
			connection[i] = null;
		}
	}

	private void pushConnection(int x, int y) {
		if (connection[x] == null) {
			temp = new NodeConnection();
			temp.index = y;
			temp.next = null;
			connection[x] = temp;
			p[x] = temp;
		} else {
			temp = new NodeConnection();
			temp.index = y;
			temp.next = null;
			p[x].next = temp;
			p[x] = temp;
		}
	}

	private int length(NodeConnection connection) {
		if (connection == null) {
			return 0;
		}
		int smallans = length(connection.next);
		int ans = smallans + 1;
		return ans;
	}

	private int lengthOfConnection(int x) {
		int ans = length(connection[x]);
		return ans;
	}

	private void getStation(int n) {
		switch (n) {
		case 1: {
			stationName = "Adarsh Nagar";
			break;
		}
		case 2: {
			stationName = "AIIMS";
			break;
		}
		case 3: {
			stationName = "Akshardham";
			break;
		}
		case 4: {
			stationName = "Anand Vihar";
			break;
		}
		case 5: {
			stationName = "Arjan Grah";
			break;
		}
		case 6: {
			stationName = "Ashok Park Main";
			break;
		}
		case 7: {
			stationName = "Azadpur";
			break;
		}
		case 8: {
			stationName = "Badapur";
			break;
		}
		case 9: {
			stationName = "Badhkhal Mor";
			break;
		}
		case 10: {
			stationName = "Barakhambha Road";
			break;
		}
		case 11: {
			stationName = "Beta Chowk";
			break;
		}
		case 12: {
			stationName = "Botanical Garden";
			break;
		}
		case 13: {
			stationName = "Central Secretariat";
			break;
		}
		case 14: {
			stationName = "Chandni Chowk";
			break;
		}
		case 15: {
			stationName = "Chhatarpur";
			break;
		}
		case 16: {
			stationName = "Chawri Bazar";
			break;
		}
		case 17: {
			stationName = "Civil Lines";
			break;
		}
		case 18: {
			stationName = "Delhi Aerocity";
			break;
		}
		case 19: {
			stationName = "Dhaula Kuan";
			break;
		}
		case 20: {
			stationName = "Dilshad Garden";
			break;
		}
		case 21: {
			stationName = "Dwarka";
			break;
		}
		case 22: {
			stationName = "Dwarka Morh";
			break;
		}
		case 23: {
			stationName = "Dwarka Sector 10";
			break;
		}
		case 24: {
			stationName = "Dwarka Sector 11";
			break;
		}
		case 25: {
			stationName = "Dwarka Sector 12";
			break;
		}
		case 26: {
			stationName = "Dwarka Sector 13";
			break;
		}
		case 27: {
			stationName = "Dwarka Sector 14";
			break;
		}
		case 28: {
			stationName = "Dwarka Sector 21";
			break;
		}
		case 29: {
			stationName = "Dwarka Sector 8";
			break;
		}
		case 30: {
			stationName = "Dwarka Sector 9";
			break;
		}
		case 31: {
			stationName = "Escorts Mujesar";
			break;
		}
		case 32: {
			stationName = "Faridabad Old";
			break;
		}
		case 33: {
			stationName = "Ghiorni";
			break;
		}
		case 34: {
			stationName = "Govind Puri";
			break;
		}
		case 35: {
			stationName = "Green Park";
			break;
		}
		case 36: {
			stationName = "GTB Nagar";
			break;
		}
		case 37: {
			stationName = "Guru Dronacharya";
			break;
		}
		case 38: {
			stationName = "Haidepur";
			break;
		}
		case 39: {
			stationName = "Hauz Khas";
			break;
		}
		case 40: {
			stationName = "HUDA City Centre";
			break;
		}
		case 41: {
			stationName = "IFFO Chowk";
			break;
		}
		case 42: {
			stationName = "INA";
			break;
		}
		case 43: {
			stationName = "Inderlok";
			break;
		}
		case 44: {
			stationName = "IGIA";
			break;
		}
		case 45: {
			stationName = "Indraprastha";
			break;
		}
		case 46: {
			stationName = "ITO";
			break;
		}
		case 47: {
			stationName = "Jahangirpuri";
			break;
		}
		case 48: {
			stationName = "Janakpuri East";
			break;
		}
		case 49: {
			stationName = "Janakpuri West";
			break;
		}
		case 50: {
			stationName = "Janpath";
			break;
		}
		case 51: {
			stationName = "Jangpura";
			break;
		}
		case 52: {
			stationName = "Jasola Apollo";
			break;
		}
		case 53: {
			stationName = "Jawaharlal Nehru Stadium";
			break;
		}
		case 54: {
			stationName = "Jhandewalan";
			break;
		}
		case 55: {
			stationName = "Jhilmil";
			break;
		}
		case 56: {
			stationName = "Jor Bagh";
			break;
		}
		case 57: {
			stationName = "Kailash Colony";
			break;
		}
		case 58: {
			stationName = "Kalkaji Mandir";
			break;
		}
		case 59: {
			stationName = "Kanhiya Nagar";
			break;
		}
		case 60: {
			stationName = "Karkarduma";
			break;
		}
		case 61: {
			stationName = "Karol Bagh";
			break;
		}
		case 62: {
			stationName = "Kashmere Gate";
			break;
		}
		case 63: {
			stationName = "Kaushambi";
			break;
		}
		case 64: {
			stationName = "Keshav Puram";
			break;
		}
		case 65: {
			stationName = "Khan Market";
			break;
		}
		case 66: {
			stationName = "Kirti Nagar";
			break;
		}
		case 67: {
			stationName = "Kohat Enclave";
			break;
		}
		case 68: {
			stationName = "Lajpat Nagar";
			break;
		}
		case 69: {
			stationName = "Laxmi Nagar";
			break;
		}
		case 70: {
			stationName = "Madipur";
			break;
		}
		case 71: {
			stationName = "Malviya Nagar";
			break;
		}
		case 72: {
			stationName = "Mandi House";
			break;
		}
		case 73: {
			stationName = "Mansarovar Park";
			break;
		}
		case 74: {
			stationName = "Mayur Vihar-1";
			break;
		}
		case 75: {
			stationName = "Mayur Vihar Extension";
			break;
		}
		case 76: {
			stationName = "Mewla Maharajapur";
			break;
		}
		case 77: {
			stationName = "MG Road";
			break;
		}
		case 78: {
			stationName = "Model Town";
			break;
		}
		case 79: {
			stationName = "Mohan Estate";
			break;
		}
		case 80: {
			stationName = "Moolchand";
			break;
		}
		case 81: {
			stationName = "Moti Nagar";
			break;
		}
		case 82: {
			stationName = "Mundka";
			break;
		}
		case 83: {
			stationName = "Nangloi";
			break;
		}
		case 84: {
			stationName = "Nangloi Railway Station";
			break;
		}
		case 85: {
			stationName = "Nawada";
			break;
		}
		case 86: {
			stationName = "Neelam Chowk Ajronda";
			break;
		}
		case 87: {
			stationName = "Nehru Place";
			break;
		}
		case 88: {
			stationName = "Netaji Shubhas Place";
			break;
		}
		case 89: {
			stationName = "New Ashok Nagar";
			break;
		}
		case 90: {
			stationName = "New Delhi";
			break;
		}
		case 91: {
			stationName = "NHPC";
			break;
		}
		case 92: {
			stationName = "Nirman Vihar";
			break;
		}
		case 93: {
			stationName = "Noida City Centre";
			break;
		}
		case 94: {
			stationName = "Noida Golf Course";
			break;
		}
		case 95: {
			stationName = "Noida Sector 15";
			break;
		}
		case 96: {
			stationName = "Noida Sector 16";
			break;
		}
		case 97: {
			stationName = "Noida Sector 18";
			break;
		}
		case 98: {
			stationName = "Okhla";
			break;
		}
		case 99: {
			stationName = "Paschim Vihar East";
			break;
		}
		case 100: {
			stationName = "Paschim Vihar West";
			break;
		}
		case 101: {
			stationName = "Patel Chowk";
			break;
		}
		case 102: {
			stationName = "Patel Nagar";
			break;
		}
		case 103: {
			stationName = "Peera Garhi";
			break;
		}
		case 104: {
			stationName = "Pitam Pura";
			break;
		}
		case 105: {
			stationName = "Pragati Maidan";
			break;
		}
		case 106: {
			stationName = "Pratap Nagar";
			break;
		}
		case 107: {
			stationName = "Preet Vihar";
			break;
		}
		case 109: {
			stationName = "Pul Bagh East";
			break;
		}
		case 110: {
			stationName = "Qutab Minar";
			break;
		}
		case 111: {
			stationName = "Race Course";
			break;
		}
		case 112: {
			stationName = "Rajdhani Park";
			break;
		}
		case 113: {
			stationName = "Rajendra Place";
			break;
		}
		case 114: {
			stationName = "Rajiv Chowk";
			break;
		}
		case 115: {
			stationName = "Rajouri Garden";
			break;
		}
		case 116: {
			stationName = "Ramakrishna Ashram Marg";
			break;
		}
		case 117: {
			stationName = "Ramesh Nagar";
			break;
		}
		case 118: {
			stationName = "Rithala";
			break;
		}
		case 119: {
			stationName = "Rohini East";
			break;
		}
		case 120: {
			stationName = "Rohini Sector 18";
			break;
		}
		case 121: {
			stationName = "Rohini West";
			break;
		}
		case 122: {
			stationName = "Saket";
			break;
		}
		case 123: {
			stationName = "Samaypur Badli";
			break;
		}
		case 124: {
			stationName = "Sarita Vihar";
			break;
		}
		case 125: {
			stationName = "Sarai";
			break;
		}
		case 126: {
			stationName = "Satguru Ramsingh Marg";
			break;
		}
		case 127: {
			stationName = "Sector 28";
			break;
		}
		case 128: {
			stationName = "Seelampur";
			break;
		}
		case 129: {
			stationName = "Shadipur";
			break;
		}
		case 130: {
			stationName = "Shahdara";
			break;
		}
		case 131: {
			stationName = "Shastri Nagar";
			break;
		}
		case 132: {
			stationName = "Shastri Park";
			break;
		}
		case 133: {
			stationName = "Shivaji Park";
			break;
		}
		case 134: {
			stationName = "Shivaji Stadium";
			break;
		}
		case 135: {
			stationName = "Sikandarpur";
			break;
		}
		case 136: {
			stationName = "Subhash Nagar";
			break;
		}
		case 137: {
			stationName = "Sultanpur";
			break;
		}
		case 138: {
			stationName = "Surajmal Stadium";
			break;
		}
		case 139: {
			stationName = "Tagore Garden";
			break;
		}
		case 140: {
			stationName = "Tilak Nagar";
			break;
		}
		case 141: {
			stationName = "Tis Hazari";
			break;
		}
		case 142: {
			stationName = "Tughlakabad";
			break;
		}
		case 143: {
			stationName = "Udyog Bhawan";
			break;
		}
		case 144: {
			stationName = "Udyog Nagar";
			break;
		}
		case 145: {
			stationName = "Uttam Nagar East";
			break;
		}
		case 146: {
			stationName = "Uttam Nagar West";
			break;
		}
		case 147: {
			stationName = "Vaishali";
			break;
		}
		case 148: {
			stationName = "Vidhan Sabha";
			break;
		}
		case 149: {
			stationName = "Vishwa Vidyalaya";
			break;
		}
		case 150: {
			stationName = "Welcome";
			break;
		}
		case 151: {
			stationName = "Yamuna Bank";
			break;
		}
		}
	}

	private void setStations() {
		for (int i = 1; i <= 151; ++i) {
			getStation(i);
			pushStation(stationName);
		}
	}

	void setConnection()

	{
		pushConnection(40, 41);

		pushConnection(41, 40);

		pushConnection(41, 77);

		pushConnection(77, 41);

		pushConnection(77, 135);

		pushConnection(135, 77);

		pushConnection(135, 37);

		pushConnection(37, 135);

		pushConnection(37, 5);

		pushConnection(5, 37);

		pushConnection(5, 33);

		pushConnection(33, 5);

		pushConnection(33, 137);

		pushConnection(137, 33);

		pushConnection(137, 15);

		pushConnection(15, 137);

		pushConnection(15, 110);

		pushConnection(110, 15);

		pushConnection(110, 122);

		pushConnection(122, 110);

		pushConnection(122, 71);

		pushConnection(71, 122);

		pushConnection(71, 39);

		pushConnection(39, 71);

		pushConnection(39, 35);

		pushConnection(35, 39);

		pushConnection(35, 2);

		pushConnection(2, 35);

		pushConnection(2, 42);

		pushConnection(42, 2);

		pushConnection(42, 56);

		pushConnection(56, 42);

		pushConnection(56, 111);

		pushConnection(111, 56);

		pushConnection(111, 143);

		pushConnection(143, 111);

		pushConnection(143, 13);

		pushConnection(13, 143);

		pushConnection(13, 65);

		pushConnection(65, 13);

		pushConnection(13, 101);

		pushConnection(101, 13);

		pushConnection(101, 114);

		pushConnection(114, 101);

		pushConnection(114, 10);

		pushConnection(10, 114);

		pushConnection(114, 116);

		pushConnection(116, 114);

		pushConnection(114, 90);

		pushConnection(90, 114);

		pushConnection(90, 134);

		pushConnection(134, 90);

		pushConnection(90, 16);

		pushConnection(16, 90);

		pushConnection(16, 14);

		pushConnection(14, 16);

		pushConnection(14, 62);

		pushConnection(62, 14);

		pushConnection(62, 132);

		pushConnection(132, 62);

		pushConnection(62, 141);

		pushConnection(141, 62);

		pushConnection(62, 17);

		pushConnection(17, 62);

		pushConnection(17, 148);

		pushConnection(148, 17);

		pushConnection(148, 149);

		pushConnection(149, 148);

		pushConnection(149, 36);

		pushConnection(36, 149);

		pushConnection(36, 78);

		pushConnection(78, 36);

		pushConnection(78, 7);

		pushConnection(7, 78);

		pushConnection(7, 1);

		pushConnection(1, 7);

		pushConnection(1, 47);

		pushConnection(47, 1);

		// //YELLOW LINE

		pushConnection(20, 55);

		pushConnection(55, 20);

		pushConnection(55, 73);

		pushConnection(73, 55);

		pushConnection(73, 130);

		pushConnection(130, 73);

		pushConnection(130, 150);

		pushConnection(150, 130);

		pushConnection(150, 128);

		pushConnection(128, 150);

		pushConnection(128, 132);

		pushConnection(132, 128);

		pushConnection(141, 108);

		pushConnection(108, 141);

		pushConnection(108, 106);

		pushConnection(106, 108);

		pushConnection(106, 131);

		pushConnection(131, 106);

		pushConnection(131, 43);

		pushConnection(43, 131);

		pushConnection(43, 6);

		pushConnection(6, 43);

		pushConnection(43, 59);

		pushConnection(59, 43);

		pushConnection(59, 64);

		pushConnection(64, 59);

		pushConnection(64, 88);

		pushConnection(88, 64);

		pushConnection(88, 67);

		pushConnection(67, 88);

		pushConnection(67, 104);

		pushConnection(104, 67);

		pushConnection(104, 119);

		pushConnection(119, 104);

		pushConnection(119, 121);

		pushConnection(121, 119);

		pushConnection(121, 118);

		pushConnection(118, 121);

		// //RED LINE

		pushConnection(8, 142);

		pushConnection(142, 8);

		pushConnection(142, 79);

		pushConnection(79, 142);

		pushConnection(79, 124);

		pushConnection(124, 79);

		pushConnection(124, 52);

		pushConnection(52, 124);

		pushConnection(52, 98);

		pushConnection(98, 52);

		pushConnection(98, 34);

		pushConnection(34, 98);

		pushConnection(34, 58);

		pushConnection(58, 34);

		pushConnection(58, 87);

		pushConnection(87, 58);

		pushConnection(87, 57);

		pushConnection(57, 87);

		pushConnection(57, 80);

		pushConnection(80, 57);

		pushConnection(80, 68);

		pushConnection(68, 80);

		pushConnection(68, 51);

		pushConnection(51, 68);

		pushConnection(51, 53);

		pushConnection(53, 51);

		pushConnection(53, 65);

		pushConnection(65, 53);

		// //VIOLET LINE

		pushConnection(28, 29);

		pushConnection(29, 28);

		pushConnection(28, 44);

		pushConnection(44, 28);

		pushConnection(44, 18);

		pushConnection(18, 44);

		pushConnection(18, 19);

		pushConnection(19, 18);

		pushConnection(19, 134);

		pushConnection(134, 19);

		// //EXPRESS WAY

		pushConnection(82, 112);

		pushConnection(112, 82);

		pushConnection(112, 84);

		pushConnection(84, 112);

		pushConnection(84, 83);

		pushConnection(83, 84);

		pushConnection(83, 138);

		pushConnection(138, 83);

		pushConnection(138, 144);

		pushConnection(144, 138);

		pushConnection(144, 103);

		pushConnection(103, 144);

		pushConnection(103, 100);

		pushConnection(100, 103);

		pushConnection(100, 99);

		pushConnection(99, 100);

		pushConnection(99, 70);

		pushConnection(70, 99);

		pushConnection(70, 133);

		pushConnection(133, 70);

		pushConnection(133, 109);

		pushConnection(109, 133);

		pushConnection(109, 6);

		pushConnection(6, 109);

		pushConnection(6, 126);

		pushConnection(126, 6);

		pushConnection(126, 66);

		pushConnection(66, 126);

		// GREEN LINE

		pushConnection(29, 30);

		pushConnection(30, 29);

		pushConnection(30, 23);

		pushConnection(23, 30);

		pushConnection(23, 24);

		pushConnection(24, 23);

		pushConnection(24, 25);

		pushConnection(25, 24);

		pushConnection(25, 26);

		pushConnection(26, 25);

		pushConnection(26, 27);

		pushConnection(27, 26);

		pushConnection(27, 21);

		pushConnection(21, 27);

		pushConnection(21, 22);

		pushConnection(22, 21);

		pushConnection(22, 85);

		pushConnection(85, 22);

		pushConnection(85, 146);

		pushConnection(146, 85);

		pushConnection(146, 145);

		pushConnection(145, 146);

		pushConnection(145, 49);

		pushConnection(49, 145);

		pushConnection(49, 48);

		pushConnection(48, 49);

		pushConnection(48, 140);

		pushConnection(140, 48);

		pushConnection(140, 136);

		pushConnection(136, 140);

		pushConnection(136, 139);

		pushConnection(139, 136);

		pushConnection(139, 115);

		pushConnection(115, 139);

		pushConnection(115, 117);

		pushConnection(117, 115);

		pushConnection(117, 81);

		pushConnection(81, 117);

		pushConnection(81, 66);

		pushConnection(66, 81);

		pushConnection(66, 129);

		pushConnection(129, 66);

		pushConnection(129, 102);

		pushConnection(102, 129);

		pushConnection(102, 113);

		pushConnection(113, 102);

		pushConnection(113, 61);

		pushConnection(61, 113);

		pushConnection(61, 54);

		pushConnection(54, 61);

		pushConnection(54, 116);

		pushConnection(116, 54);

		// ................................

		pushConnection(10, 72);

		pushConnection(72, 10);

		pushConnection(72, 105);

		pushConnection(105, 72);

		pushConnection(105, 45);

		pushConnection(45, 105);

		pushConnection(45, 151);

		pushConnection(151, 45);

		pushConnection(151, 3);

		pushConnection(3, 151);

		pushConnection(3, 74);

		pushConnection(74, 3);

		pushConnection(74, 75);

		pushConnection(75, 74);

		pushConnection(75, 89);

		pushConnection(89, 75);

		pushConnection(89, 95);

		pushConnection(95, 89);

		pushConnection(95, 96);

		pushConnection(96, 95);

		pushConnection(96, 97);

		pushConnection(97, 96);

		pushConnection(97, 12);

		pushConnection(12, 97);

		pushConnection(12, 94);

		pushConnection(94, 12);

		pushConnection(94, 93);

		pushConnection(93, 94);

		pushConnection(151, 69);

		pushConnection(69, 151);

		pushConnection(69, 92);

		pushConnection(92, 69);

		pushConnection(92, 107);

		pushConnection(107, 92);

		pushConnection(107, 60);

		pushConnection(60, 107);

		pushConnection(60, 4);

		pushConnection(4, 60);

		pushConnection(4, 63);

		pushConnection(63, 4);

		pushConnection(63, 147);

		pushConnection(147, 63);
	}

	private void set(int A[]) {
		for (int i = 0; i < 100; ++i) {
			A[i] = -1;
		}
	}

	private int noOfElements(int A[]) {
		int count = 0;
		while (true) {
			if (A[count] == -1)
				break;
			++count;
		}
		return count;
	}

	private boolean checkIfStartPresentInArray(int start, int A[]) {
		int count = 0;
		for (int i = 0; i < 100; ++i) {
			if (A[i] == start) {
				++count;
				break;
			}
		}
		if (count == 0)
			return false;
		else
			return true;
	}

	private void copyArray(int newA[], int A[]) {
		for (int i = 0; i < 100; ++i) {
			newA[i] = A[i];
		}
	}

	private void pushStartInA(int start, int A[]) {
		for (int i = 0; i < 100; ++i) {
			if (A[i] == -1) {
				A[i] = start;
				break;
			}
		}
	}

	private void shortestDistance(int start, int end, int A[]) {
		if (start == end) {
			if (noOfElements(A) < smalll) {
				pushStartInA(start, A);
				copyArray(ans, A);
				smalll = noOfElements(A);
			}
			return;
		}
		boolean getans = checkIfStartPresentInArray(start, A);
		if (getans == true)
			return;
		int newA[] = new int[100];
		set(newA);
		copyArray(newA, A);
		pushStartInA(start, newA);
		NodeConnection temp = connection[start];
		while (temp != null) {
			shortestDistance(temp.index, end, newA);
			temp = temp.next;
		}
	}

	private void travel() {
		String initial, destination;
		System.out.print("\n\tEnter Source Metro Station : ");
		Scanner s = new Scanner(System.in);
		initial = s.nextLine();
		System.out.print("\n\tEnter Destination Metro Station : ");
		s = new Scanner(System.in);
		destination = s.nextLine();
		int start, endd;
		start = spitStation(initial);
		endd = spitStation(destination);
		if (start == -1 || endd == -1) {
			System.out.println("\n\tTravelling not possible.");
			return;
		}
		int B[] = new int[100];
		set(B);
		set(ans);
		shortestDistance(start, endd, B);
		System.out.println("\n\tMinimum number of stations : " + smalll);
		System.out.println("\n\n");
		for (int i = 0; i < smalll; i++) {
			System.out.println("\t" + spitName(ans[i]));
		}

		int price;
		if (smalll < 5)
			price = 10;
		else if (smalll < 30)
			price = 20;
		else
			price = 27;
		System.out.println("\n\n\tPrice : Rs." + price);
//		System.out.println("\n\n\tPress enter to continue.");
	}

	private void priceStructure() {
		System.out.println(
				"\n\n\tStations less than 5 : Rs. 10\n\tStations between 5 and 30 : Rs.20\n\tStations greater than 30 : Rs.27\n\n\tPress enter to continue.");
	}

	private void details() {
		System.out.println(
				"\n\tDETAILS:\n\n\tMetro Bhawan Fire Brigade Lane,\n\tBarakhamba Road,\n\tNew Delhi - 110001, India\n\tBoard No. - 011-23417910/12\n\n\tFor Complaints and Suggestions contact : +919876543210\n\tOr drop a mail at customersupport@delhimetro.com\n\n\tPress enter to continue.");
	}

	private void seeAllStations() {
		showStations();
		System.out.println("\n\tPress enter to continue.");
	}

	private void menu() {
		int choice;
		for (;;) {
			System.out.print(
					"\n\tMENU\n\n\t1.Travel\n\t2.Price Structure\n\t3.Details\n\t4.See All Stations\n\t5.Exit\n\n\tEnter your choice : ");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			switch (choice) {
			case 1:
				travel();
				break;
			case 2:
				priceStructure();
				break;
			case 3:
				details();
				break;
			case 4:
				seeAllStations();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("\n\tWrong choice! Press enter to continue.");
				break;
			}
		}
	}

	private void welcome() throws InterruptedException {
		String str1 = "WELCOME TO DELHI METRO RAIL CORPORATION LTD.", str2 = "LOADING...", str3 = "A PROJECT BY : ";
		// System.out.println("W W EEEEE L CCCC OOO M M EEEEE __ "); wait(100);
		// System.out.println("W W E L C C O O MM MM E / "); wait(100);
		// System.out.println("W W E L C O O M M M M E / || "); wait(100);
		// System.out.println("W W E L C O O M M M M E | || | "); wait(100);
		// System.out.println("W W E L C O O M M M E | | | | "); wait(100);
		// System.out.println("W W W EEEEE L C O O M M EEEEE | || | ");
		// wait(100);
		// System.out.println("W W W E L C O O M M E | || | "); wait(100);
		// System.out.println("W W W E L C O O M M E | || | "); wait(100);
		// System.out.println("W W W E L C O O M M E | | | | ");wait(100);
		// System.out.println(" W W W W E L C C O O M M E | | | | "); wait(100);
		// System.out.println(" W W EEEEE LLLLLL CCCC OOO M M EEEEE ");
		// wait(100);
		//
		// System.out.println(" TTTTT OOO "); wait(100);
		// System.out.println(" T O O "); wait(100);
		// System.out.println(" T OOO "); wait(100);
		//
		// System.out.println("DDDD EEEEE L H H IIIII "); wait(100);
		// System.out.println("D D E L H H I "); wait(100);
		// System.out.println("D D Eeeee L HHHHHH I M M EEEEE TTTTT RRRR OOO ");
		// wait(100);
		// System.out.println("D D E L H H I MM MM E T R R O O "); wait(100);
		// System.out.println("DDDD EEEEE LLLLLL H H IIIII M MM M EEEEE T RRRR O
		// O "); wait(100);
		// System.out.println(" M M E T R R O O "); wait(100);
		// System.out.println(" M M EEEEE T R RR OOO "); wait(100);
		// System.out.println(" ");
		System.out.println("\n\n\n\n\t\t");
		System.out.println(str3);
		System.out.println("\n\n\t\tPRATEEK VARSHNEY");
		// wait(500);
		System.out.println("\n\t\tRHIBHU BHATTACHARJEE");
		// wait(500);
		System.out.println("\n\t\tRONAK SHAKYAWAR");
		// wait(500);
		System.out.println("\n\t\tYOGESH MEENA");
		// wait(500);
		System.out.println("\n\n\t\t\t");
		System.out.println(str2);
		// wait(2000);
		System.out.println("\n\n\n\t\tPress enter to continue.");
	}

}
