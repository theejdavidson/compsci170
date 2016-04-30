
class need{
	private int foodCount = 3;
	private int waterCount = 3;
	private int gasCount = 3;
	private int weaponsCount =0;
	//add to the objectives
	public void foodGained(int food){
		this.foodCount = this.foodCount + food;
	}
	public void waterGained(int water){
				this.waterCount = this.waterCount + water;
	}
	public void gasGained(int gas){
				this.gasCount = this.gasCount + gas;
	}
	public void weaponsGained(int weapons){
				this.weaponsCount = this.weaponsCount + weapons;
	}
	// subtract from objectives
	public void foodLossed(int food){
		this.foodCount = this.foodCount - food;
	}
	public void waterLossed(int water){
				this.waterCount = this.waterCount - water;
	}
	public void gasLossed(int gas){
				this.gasCount = this.gasCount - gas;
	}
	public void weaponsLossed(int weapons){
				this.weaponsCount = this.weaponsCount - weapons;
	}
	//call the objectives with the getMethods
	public int getFood(){
		return this.foodCount;
	}
	public int getWater(){
		return this.waterCount;
	}
	public int getWeapons(){
		return this.weaponsCount;
	}
	public int getGas(){
		return this.gasCount;
	}
	
	
	
	
	//print objectives
	public void print(){
		System.out.println("Objectives: Food, Water, Weapons, Gas");
		System.out.println("             " + this.foodCount + "     " + this.waterCount 
		+ "        " + this.weaponsCount + "     " + this.gasCount);
	}
	
	
	
	
	
	
	
}