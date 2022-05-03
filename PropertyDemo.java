//Mini project to create the Specification page of A Dell Laptop.

/* Create a text file using property class by using I/O Stream,
   Create a XML file using property class by using I/O Stream,
   Read the text file using property class by using I/O Stream,
   Read the XML file using property class by using I/O Stream. */

package a.CollectionFramework5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		
		p.setProperty("Brand", 		"Dell");
		p.setProperty("OS", 		"Windows");
		p.setProperty("Processor", 	"Intel i7");
		p.setProperty("Model", 		"Latitude");
		p.setProperty("RAM",   		"8GB");
		p.setProperty("Hard Disk", 	"1TB");
		p.setProperty("Battery", 	"Lithium 5000MAH");
		p.setProperty("Cell", 		"4 Cell");
		p.setProperty("Backup", 		"up to 8 hrs");
		p.setProperty("camera", 	"2 Mega Pixel");
		p.setProperty("Display", 	"full hd");
		p.setProperty("Resolution", 	"1680x2040");
		p.setProperty("Touch Screen", 	"Yes");
		p.setProperty("Rotation", 	"180 Degree");
		p.setProperty("Microphone", 	"Yes");
		p.setProperty("Speaker", 	"Duel Strero");
		p.setProperty("Blutooth", 	"0.5");
		p.setProperty("wifi", 		"0.5");
		p.setProperty("Port", 		"2 USB3.0");
		p.setProperty("HeadPhone jack", "Yes 2.0");
		p.setProperty("Bright Keyboard", "Yes");
		p.setProperty("Charger", 	"Ac Adapter");
		p.setProperty("Fast Charging", 	"Yes");
		p.setProperty("Pen", 		"No");
		p.setProperty("Fingerprint", 	"No");
		p.setProperty("Warrenty", 	"2Years(Domestic)");
		
		
		//Method to generate the text file
		try {
			p.store(new FileOutputStream("E:\\ProgramData/data.txt"), "Laptop_Details");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//Method to generate the XML file
		try {
			p.storeToXML(new FileOutputStream("E:\\ProgramData/MyData.xml"), "Laptop Details");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		//Method to read the text file
// 		try {
// 			p.load(new FileInputStream("E:\\ProgramData/data.txt"));
// 		} catch (FileNotFoundException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		}
// 		System.out.println(p);
		
		
		
		//Method to read the XML file
//		try {
//			p.loadFromXML(new FileInputStream("E:\\ProgramData/MyData.xml"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(p);
//	}
	}
}
