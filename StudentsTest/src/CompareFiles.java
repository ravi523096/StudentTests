// Compare files and print differences.
/**
 * Write logic in "findDifferences(...)" function to compare files
 * 
 * @author Ravi_Kalla
 *
 */
public class CompareFiles {
	public static void main(String[] args) {
		String strFileName1 = "data1.txt";
		String strFileName2 = "data2.txt";
		String strComparisonResultFileContent = CompareFiles.findDifferences(strFileName1, strFileName2);
		System.out.println("Comparison results : \n " + strComparisonResultFileContent);
	}

	private static String findDifferences(String strFileName1,
			String strFileName2) {
		// TODO : Write logic to compare two files and return the comparison results
		return null;
	}
}

/*
Eg1:
	File1 Content :
		Employee1,111,Manager
		Employee3,333,Developer
		Employee4,444,Tester
	File2 Content :
		Employee1,111,Manager
		Employee2,222,ProjectLead
		Employee4,444,Tester

	ComparisonResultFile Content:
		Employee1,111,Manager
		// Start : Difference exist between File1 and File2
		// First file content
		Employee3,333,Developer
		// Second file content
		Employee2,222,ProjectLead
		// End : Difference exist between File1 and File2
		Employee4,444,Tester

Eg2:
	File1 Content :
		Employee1,111,Manager
		Employee2,222,ProjectLead
		Employee3,333,Developer
		Employee4,444,Tester
	File2 Content :
		Employee1,111,Manager
		Employee2,222,ProjectLead
		Employee4,444,Tester

	ComparisonResultFile Content:
		Employee1,111,Manager
		Employee2,222,ProjectLead
		// Start : Difference exist between File1 and File2
		// First file content
		Employee3,333,Developer
		// Second file content
		Employee3,333,Developer
		// End : Difference exist between File1 and File2
		Employee4,444,Tester
*/