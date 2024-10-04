package anthony;
import java.util.Scanner;
public class MUTUMBA {
	//Simple Health System in Java


	public class HealthSystem {
	    private static String[] patientPayments;

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of patients: ");
	        int numPatients = scanner.nextInt();
	        
	        String[] PatientNames = new String[numPatients];
	        double[]patientpayment = new double[numPatients];
	        
	        // Input patient details
	        for (int i = 0; i < numPatients; i++) {
	            System.out.print("Enter name for patient " + (i + 1) + ": ");
	            PatientNames[i] = scanner.nextLine();
	            
	            System.out.print("Enter payment for patient" +(i + 1)+ ": ");
	            double[] patientPayments = null;
				patientPayments[i] = scanner.nextDouble();
	        }
	        
	        // Display patient details
	        System.out.println("\nPatientDetails:");
	        for (int i = 0; i < numPatients; i++) {
	            patientPayments = null;
				System.out.println("Patient"+(i+1)+":Name="+PatientNames[i]+",Payment=$"+ patientPayments[i]);
	        }
	      
	        scanner.close();
	    }
	}
}
