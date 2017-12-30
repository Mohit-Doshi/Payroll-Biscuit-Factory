
/**
 * Write a description of class payrollxbisfac here.
 * 
 * @author (MOHIT) 
 * @version (December 13, 2014)
 */
import java.io.*;
public class payrollbifa 
{
	public static void main(String args[]) throws IOException
	{
	    InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
	    System.out.println("Enter your choice");
	    System.out.println("Enter 1 for the company's Payroll, 2 for the Company's Inventory and 3 for the Accounts.");
		int ch = Integer.parseInt(in.readLine());
		switch (ch)
		{
		    case 1:
		    {
		int k = 0,j = 0;
		System.out.println("Enter the number of employees.");
		int n = Integer.parseInt(in.readLine());
		String name[] = new String[n];
		String des[] = new String[n];
		String mon[] = new String[n];
		int year[] = new int[n];
		int dw[] = new int[n];
		long accno[] = new long[n];
		float basic[] = new float[n];
		float hra[] = new float[n];
		float cca[] = new float[n];
		float con[] = new float[n];
		float os[] = new float[n];
		float pf[] = new float[n];
		float esi[] = new float[n];
		float pt[] = new float[n];
		float adv[] = new float[n];
		float lun[] = new float[n];
		float ren[] = new float[n];
		float otre[] = new float[n];
		float others[] = new float[n];
		float gs[] = new float[n];
		float ns[] = new float[n];
		System.out.println("Enter the employee's name,designation,month,year,number of days he/she has worked,account number,basic salary,House Rent Allowance,City Compensatory Allowance,conveyance,other salary,advance,lunch charge,rent charge and others recovery.");
		for(int i = 0;i < n;i++)
		{
			name[i] = in.readLine();
			des[i] = in.readLine();
			mon[i] = in.readLine();
			year[i] = Integer.parseInt(in.readLine());
			dw[i] = Integer.parseInt(in.readLine());
			accno[i] = Long.parseLong(in.readLine());
			basic[i] = Float.parseFloat(in.readLine());
			hra[i] = Float.parseFloat(in.readLine());
			cca[i] = Float.parseFloat(in.readLine());
			con[i] = Float.parseFloat(in.readLine());
			os[i] = Float.parseFloat(in.readLine());
			adv[i] = Float.parseFloat(in.readLine());
			lun[i] = Float.parseFloat(in.readLine());
			ren[i] = Float.parseFloat(in.readLine());
			otre[i] = Float.parseFloat(in.readLine());
			others[i] = lun[i] + ren[i] + otre[i];
			gs[i] = basic[i] + hra[i] + cca[i] + con[i] + os[i];
			}
		for(int i  = 0;i < n;i++)
		{
			pf[i] = (12/100) * basic[i];
			esi[i] =  (float) ((1.78/100)*basic[i]);
			if(basic[i] < 10000)
				pt[i] = 0;
			if((basic[i] >= 10000) && (basic[i] < 15000))
				pt[i] = 150;
			if(basic[i] >= 15000)
				pt[i] = 200;
		}
		for(int i = 0;i < n;i++)
		{
			ns[i] = gs[i] - (pf[i] + esi[i] + pt[i] + adv[i] + others[i]);
		}
		System.out.println("Enter the employee's name to get his/her salary slip.");
		String namesearch = in.readLine();
		for(int i = 0;i < n;i++)
		if(name[i].equalsIgnoreCase(namesearch))
		{
			k = 1;
			j = i;
			}
		if(k == 1)
		{
			System.out.println("    Salary Slip     ");
			System.out.println("Name : " + name[j]);
			System.out.println("Designation : " + des[j]);
			System.out.println("Month : " + mon[j]);
			System.out.println("Year : " + year[j]);
			System.out.println("Number of days worked : " + dw[j]);
			System.out.println("Account number : " + accno[j]);
			System.out.println("Basic Salary : " + basic[j]);
			System.out.println("House Rent Allowance : " + hra[j]);
			System.out.println("City Compensatory Allowance : " + cca[j]);
			System.out.println("Conveyance : " + con[j]);
			System.out.println("Other Salary : " + os[j]);
			System.out.println("Gross Salary : " + gs[j]);
			System.out.println("Provident Fund : " + pf[j]);
			System.out.println("Employees' State Insurance : " + esi[j]);
			System.out.println("Professional Tax : " + pt[j]);
			System.out.println("Advance : " + adv[j]);
			System.out.println("Others : " + others[j]);
			System.out.println("Net Salary :  " + ns[j] );
			break;
		}
		else
		{
			System.out.println("Name not found.");
			break;
	     }
	   }
        default :
	   System.out.println("Wrong choice!");
	
      }
    }
}


