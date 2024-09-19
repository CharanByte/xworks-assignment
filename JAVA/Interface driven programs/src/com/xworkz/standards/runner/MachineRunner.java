package com.xworkz.standards.runner;

import com.xworkz.standards.repo.*;
import com.xworkz.standards.service.MachineService;
import com.xworkz.standards.service.MachineServiceImp;

public class MachineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MachineRepository machineRepository = new MachineRepositoryImp();
		MachineService machineService = new MachineServiceImp(machineRepository);
		machineService.save();
		int update = machineService.update();
		System.out.println(update);
		int delete = machineService.delete();
		System.out.println(delete);
		int read = machineService.read();
		System.out.println(read);

	}

}
