package com.igeek;

public class Demo02 {
	
	public static void main(String[] args) {
		
		Waiter waiter = new Waiter("zs");
		waiter.work();
		
		Manager manager = new Manager("ls");
		manager.work();
		
		Chief chief = new Chief("wu");
		chief.work();
		
		//多态
		employeeWork(waiter,manager,chief);
		
		Driver driver = new Driver("jack");
		driver.test();
		driver.filedDrive();
		driver.roadDrive();
		//多态
		employeeDrive(driver);
	}
	
	public static void employeeWork(Employee... employee) {
		for (Employee employee2 : employee) {
			employee2.work();
		}
	}
	
	public static void employeeDrive(Drivable drivable) {
		drivable.test();
		drivable.filedDrive();
		drivable.roadDrive();
		
	}
	
	
}
