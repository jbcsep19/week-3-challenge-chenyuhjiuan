/*
Write a program that will allow a user to enter in:
a name,
an email address,
at least 1 job:
company,
job title,
start date,
end date,
at least 1 job description
Save each job to a list.
Enter in multiple jobs until they say stop.
Print the name and email
 Print each job out from the list using a method.
 Print out how many jobs there are in the list.
*/

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JobApp {

    public static void main (String arg[]){
        System.out.println("Welcome to our job hunt blog. We are going to ask you some questions related to your job information.");
        ArrayList<Jobs> jobs =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        ArrayList<Description> descripArr= new ArrayList<>();

        Person person= new Person();
        System.out.println("May we know your name?");
        String name = sc.nextLine();
        person.setName(name);

        System.out.printf("And your email?");
        String email=sc.nextLine();
        person.setEmail(email);
        System.out.printf("Thank you! ");
        //start a while loop which can let the user answer the same questions in a while loop until he types no
        while(true){
            Jobs job =new Jobs();
            System.out.printf("What was the company's name you last worked?");
            String comapny=sc.nextLine();
            job.setCompany(comapny);

            System.out.printf("And what was your title?");
            String title=sc.nextLine();
            job.setTitle(title);

            System.out.printf("When did you start to work here?");
            String startdate=sc.nextLine();
            job.setStartdate(startdate);

            System.out.printf("When did you quit this job?");
            String enddate=sc.nextLine();
            job.setEnddate(enddate);


            jobs.add(job);

            //a sub while loop
            while (true) {
                //Description description=new Description();
                System.out.printf("May you describe anything about this job?");
                String descrip = sc.nextLine();
                String descripStr[]=Arrays.asList(descrip).toArray(new String[0]);
                job.setDescriptions(descripStr);
                jobs.add(job);

                System.out.printf("Do you want to talk more about this company? (y/n)");
                String decrip1= sc.nextLine();
                if(decrip1.equalsIgnoreCase("n"))
                    break;
            }
            /*Jobs j=new Jobs();
            for(Jobs desc:j.getDescriptions()){
                String descS=desc.displaytxt();}*/
            System.out.printf("Did you have another job before this one? y/n");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("n"))
                break;

        }



        System.out.println("The summary for the information you just keyed in: ");
        System.out.println(person.displaytxt());
        int count=1;



                for (Jobs j : jobs) {
                    System.out.println(j.displayJob());

                }

        count++;

    }
}
