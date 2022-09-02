import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application Name: Lockers ME");
		System.out.println("Developed By Bhupendra Valantra");
		List<String> filelist=listofFiles();
		MainMenu(filelist);
	}
	private static void MainMenu(List<String> filelist) {
		try {
		System.out.println();
		System.out.println("===============>Maine Menu<===============");
		System.out.println("1. List all Files");
		System.out.println("2. More Options");
		System.out.println("3. Exit");
		System.out.println("Select any one option");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		
		switch(number){  
	    case 1: IterateAllFiles(filelist);  
	    break;  
	    case 2: ShowMoreOptions(filelist);  
	    break;  
	    case 3: System.out.println("Thank You");  
	    break;  
	    default:System.out.println("Invalid Options");  
	    MainMenu(filelist);
		}
		
	}catch (Exception e) {
		System.out.println("Invalid Input : Please give valid input");
		MainMenu(filelist);
	}
	}
		
	

private static void IterateAllFiles(List<String> filelist) {
	for(String filename:filelist)
	{
		System.out.println(filename);
	}
	System.out.println();
		MainMenu(filelist);
	}



	private static List<String> listofFiles() {
		List<String> files = new ArrayList<>();
		files.add("Bhupen1");
		files.add("Bhupen2");
		files.add("Bhupen3");
		files.add("Bhupen4");
		files.add("Bhupen5");
		files.add("Bhupen6");
		files.add("Bhupen7");
		return files;
	}

	private static void ShowMoreOptions(List<String> filelist) {
		try {
		System.out.println();
		System.out.println("-------------->More Option<--------------");
		System.out.println("1. Add Files");
		System.out.println("2. Delete file");
		System.out.println("3. Search file");
		System.out.println("4. Back To Main Menu");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		
		switch(number){  
	    case 1: AddFile(filelist);  
	    break;  
	    case 2: DeleteFile(filelist);  
	    break;  
	    case 3: SearchFile(filelist);  
	    break;  
	    case 4: MainMenu(filelist);  
	    break;  
	    default:System.out.println("Invalid Options");
	    ShowMoreOptions(filelist);
		}
	}catch (Exception e) {
		System.out.println("Invalid Input : Please give valid input");
		ShowMoreOptions(filelist);
	}	

	}

	private static void AddFile(List<String> filelist) {
		System.out.println("Enter file name");
		Scanner sc=new Scanner(System.in);
		String newfile=sc.nextLine();
		
		filelist.add(newfile);
		System.out.println("File added Successfully");
		ShowMoreOptions(filelist);
				
	}

	
	private static void SearchFile(List<String> filelist) {
		System.out.println("Enter File Name to search");
		Scanner sc=new Scanner(System.in);
		String search=sc.nextLine();
		if(filelist.contains(search))
		{
		System.out.println("File is present");	
		}else
		{
			System.out.println("file not present");
		}
		ShowMoreOptions(filelist);
	}

	private static void DeleteFile(List<String> filelist) {
		System.out.println("Enter File Name to Delete");
		Scanner sc=new Scanner(System.in);
		String delete=sc.nextLine();
		if(filelist.remove(delete))
		{
		System.out.println("File Deleted Successfully");	
		}else
		{
			System.out.println("Invalid File Name : Unable to Delete");
		}
		ShowMoreOptions(filelist);
		
	}
}
