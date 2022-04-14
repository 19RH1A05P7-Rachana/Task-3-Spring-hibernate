package com.motivity;
import com.motivity.configs.AppConfig;
import com.motivity.entities.Shoppingmall;
import com.motivity.services.ShoppingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
	public class MainMethod
	{
		public static void main(String[] args) throws InterruptedException, SQLException {
	        System.out.println("This is the start of the PT Spring Hibernate application");
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        ShoppingService employeeService = context.getBean(ShoppingService.class);
	        int p,q,r;
	       // char c;
	        String str;
	        Scanner sc=new Scanner(System.in);
	        do {
	        System.out.println("Enter the operation to be performed");
	        System.out.println("1.insert 2.delete 3.update 4.select 5.exit");
	        int ch=sc.nextInt();
	        switch(ch) {
	        case 1: System.out.println("Enter input: employeeid");
	        p=sc.nextInt();
	        System.out.println("Enter input1: branch");
	        str=sc.next();
	        System.out.println("Enter input2: no.of employees");
	        q=sc.nextInt();
	        System.out.println("Enter input3: revenue");
	        r=sc.nextInt();
	        Shoppingmall s1=new Shoppingmall(p,str,q,r);
	        employeeService.add(s1);
	        break;
	        case 2:System.out.println("Enter employeeid which you want to delete");
	        	p=sc.nextInt();
	        Shoppingmall s2=new Shoppingmall(p);
	        s2.setEmployeeid(p);
	        employeeService.delete(s2);
	        case 3: System.out.println("Enter an employeeid whose record has to be updated");
	        p=sc.nextInt();
	        System.out.println("Enter name of the branch which you need to update");
	        str=sc.next();
	        System.out.println("Enter no.of employees which you need to update");
	        q=sc.nextInt();
	        System.out.println("Enter revenue which you need to update");
	        r=sc.nextInt();
	        Shoppingmall s3=new Shoppingmall(p,str,q,r);
	        employeeService.update(s3);
	        case 4: System.out.println("Select details of shopping");
			List<Shoppingmall> shopping=employeeService.selection();
			for(Shoppingmall i:shopping) {
				System.out.println(i.getEmployeeid()+"    "+i.getBranch()+"     "+i.getEmployees()+"          "+i.getRevenue());
			}
			break;
	        case 5: java.lang.System.exit(0);
	        }
	        }while(true);
	        
	}
	}
