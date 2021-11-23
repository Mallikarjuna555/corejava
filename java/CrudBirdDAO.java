package com.xworkz.java;

public class CrudBirdDAO implements BirdDAO {

	BirdDTO[] birdDTO = new BirdDTO[5];
	int counter = 0;

	@Override
	public boolean save(BirdDTO birdDTO) {
		System.out.println("save method invoked:");
		if (counter < this.birdDTO.length && birdDTO != null) {
			this.birdDTO[counter++] = birdDTO;
			System.out.println("save:".concat(birdDTO.getOrigin()));
		} else {
			System.err.println("save invalid");
		}
		return true;
	}

	@Override
	public BirdDTO findByOrigin(String origin) {
		System.out.println("search method invoked");
		for (int i = 0; i < birdDTO.length; i++) {
			BirdDTO ref = birdDTO[i];
			if (ref != null) {
				String res = ref.getOrigin();
				System.out.println("find:".concat(res));
				if (origin.equals(res)) {
					System.out.println("found:");

				} else {
					System.out.println("not found:");
				}
			}
		}

		return null;
	}

	@Override
	public void displayAllDetails() {
		System.out.println("display method invoked");
		for (int i = 0; i < birdDTO.length; i++) {
			BirdDTO ref = birdDTO[i];
			if (ref != null) {
				System.out.println("breed:" + ref.getBreed());
				System.out.println("origin:" + ref.getOrigin());
				System.out.println("fly:" + ref.isCanFly());
				System.out.println("age:" + ref.getAge());
				System.out.println("ID:" + ref.getId());
			}
		}

	}

}
