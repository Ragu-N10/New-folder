package com;

class Bird {
		protected String species = "Peacock";
		public void sound() 
		{ 
			System.out.println("crowing");
		}
	}

	class Animal extends Bird{
		private String Name = "crane";
		public static void main (String[] args) {
			Animal newAnimal = new Animal ();
			newAnimal.sound();
			System.out.println(newAnimal.species+""+newAnimal.Name);
		}
	}

