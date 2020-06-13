package OfficeHours.Practice_05_20_2020;

public class ClassNote {


    /*
    05/20/2020
Practice Topic: Inheritance
				Access modifiers & inheritance
				super keyword

package name: Practice_05_20_2020

access modifiers:

		private < default < protected < public



Inheritance: builds relations between classes (easiest way to get rich)

			sub (child) & super (parent) classes

			Class A  extends class B
			     sub		 sper class

			Class C extends class B

			sub class: inherits from super class
					only the VISIBLE variables & methods can be inherited

					private: NEVER
					default: can be inherited to sub classes that are in same package
					protected & public : can ALWAYS be inherited to ANY sub class

					CONSTRUCTOR WILL NOT BE INERITED

			super class: cannot inherit anything from sub class

			a class can be extedned by multiple classes
			a class can ONLY extend one class



				class A{ // a
					int a;
				}
				class B extends A{ // a, b
					int b;
				}
				class C extends B{ // a, b, c
					int c;
				}

		advantage: re-usable
					easy to maintain

Only a constructor can call another constructor

super:
		super(): calls constructors from super class

		super. : to call instance methods and variables from super clas

constrcutor calls:
		1. at least one MUST be called in sub class
		2. default Cons of super class is called automatically in sub class
		3. parent class' constructors are not deafult MUST be called manually in sub class

task:

	custom class: Cat, Dog, Bunny

	Dog:
		variables:	name, age, color, size, breed, isPet, numberOfeyes

		methods: eat, sleep, drink, toString, bark

	Cat:
		variables:	name, age, color, size, breed, isPet, numberOfeyes

		methods: eat, sleep, drink, toString, scratch

	Bunny:
		variables:	name, age, color, size, breed, isPet, numberOfeyes

		methods: eat, sleep, drink, toString, Dig



	custom class: pet
			variables:	name, age, color, size, breed, isPet, numberOfeyes

			methods: 	eat, sleep, drink, toString


     */

}
