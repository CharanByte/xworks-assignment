package com.xworkz.standards.service;

import com.xworkz.standards.repo.*;

public class AddressServiceImp implements AddressService {

	private AddressRepository addressRepository;

	public AddressServiceImp(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public boolean push() {
		if (addressRepository != null) {
			boolean saved = addressRepository.save();
			if (saved) {
				System.out.println("successfully Saved");
				return true;
			} else {
				System.out.println("not saved");
				return false;
			}
		}
		System.out.println("there  is an issue");
		return false;
	}

	@Override
	public int refresh() {
		if (addressRepository != null) {
			int updated = addressRepository.update();
			if (updated > 0) {
				System.out.println("updated sucessfully");
				return updated;
			} else {
				System.out.println("not updated");
				return updated;
			}
		}
		System.out.println("there is issue");
		return 0;
	}

	@Override
	public void remove() {
		if (addressRepository != null) {
			System.out.println("addressrep is not null");
			addressRepository.delete();
			return;
		} else {
			System.out.println("addressrep is not null");
		}
	}

	@Override
	public String load() {
		if (addressRepository != null) {
			String updated = addressRepository.read();
			if (updated != null) {
				System.out.println(updated + " loaded sucessfully");
				return "Success";
			} else {
				System.out.println(updated + " not loaded");
				return "failed";
			}
		}

		return "Issue";
	}

}
