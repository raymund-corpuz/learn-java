
public class MLHeroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create heroes using both constructors
		MLHero miya =  new MLHero("Miya", "Marksman", "Rain of Arrows", 15);
		MLHero gusion = new MLHero("Gusion", "Assasin");
		
		//Display initial information;
		miya.displayInfo();
		gusion.displayInfo();
		
		System.out.println("\n ==== GAME ACTIONS ==== \n");
		
		//Use methods on Miya
		miya.useUltimate();
		miya.levelUp();
		miya.levelUp();
		miya.displayInfo();
		
		System.out.println();
		
		//Use methods on Gusion
		
		gusion.useUltimate();
		gusion.levelUp();
		gusion.changeRole("Fighter");
		gusion.renameHero("Balmon");
		gusion.displayInfo();
			
	}

}

// =================== ML Hero Class ==================== //
class MLHero{
	
	//fields (hero attributes)
	String name;
	String role;
	String ultimateSkill;
	int level;
	
	// Full Constructor
	MLHero(String name, String role, String ultimateSkill, int level){
		this.name = name;
		this.role = role;
		this.ultimateSkill = ultimateSkill;
		this.level = level;
	}
	
	//Constructor chaining (default skill + level);
	MLHero(String name, String role){
		this(name, role, "Basic Attack", 1);
	}
	
	//Print hero info;
	void displayInfo() {
		System.out.println();
		System.out.println("=== HERO INFO ===");
		System.out.println("Name             :" + name);
		System.out.println("Role             :" + role);
		System.out.println("Ultimate Skill   :" + ultimateSkill);
		System.out.println("Level            :" + level);
		System.out.println();
	}
	
	//level up hero
	void levelUp(){
		level++;
		System.out.println(name + " leveled up to " + level + "!");
	}
	
	//use hero ultimate skill
	void useUltimate() {
		System.out.println(name + " uses ultimate " + ultimateSkill + "!");
	}
	
	//change the hero's role
	void changeRole(String newRole) {
		System.out.println(name + " change role from " + role + " => " + newRole);
		this.role = newRole;
	}
	
	// rename hero
	void renameHero(String newName) {
		System.out.println("Hero renamed " + name + " => " + newName);
		this.name = newName;
	}
}