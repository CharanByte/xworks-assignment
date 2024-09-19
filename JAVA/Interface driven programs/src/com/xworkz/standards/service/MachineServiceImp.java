package com.xworkz.standards.service;

import com.xworkz.standards.repo.MachineRepository;

public class MachineServiceImp implements MachineService {
	private MachineRepository machineRepository;

	public MachineServiceImp(MachineRepository machineRepository) {
		super();
		this.machineRepository = machineRepository;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		if (machineRepository != null) {
			machineRepository.save();
			System.out.println("successfully saved");
			return;
		} else {
			System.out.println("not saved");
		}

	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		if (machineRepository != null) {
			int update = machineRepository.update();
			if (update > 0) {
				System.out.println("successfully updated");
				return update;
			} else {
				System.out.println("not updated");
				return update;
			}
		}
		System.out.println("issue in machineRepository");
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		if (machineRepository != null) {
			int delete = machineRepository.delete();
			if (delete > 0) {
				System.out.println("successfully deleted");
				return delete;
			} else {
				System.out.println("not deleted");
				return delete;
			}
		}
		System.out.println("issue in machineRepository");
		return 0;

	}

	@Override
	public int read() {
		// TODO Auto-generated method stub
		if (machineRepository != null) {
			int read = machineRepository.read();
			if (read > 0) {
				System.out.println("successfully readed");
				return read;
			} else {
				System.out.println("not readed");
				return read;
			}
		}
		System.out.println("issue in machineRepository");
		return 0;

	}

}