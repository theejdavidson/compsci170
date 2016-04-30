
class need{
	private int[] supplies = {3, 3, 3 , 0};
	/*private int foodCount = 3;
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
	} */
	
	public void foodGained(int food){
		this.supplies[0] = this.supplies[0] + food;
	}
	public void waterGained(int water){
				this.supplies[1] = this.supplies[1] + water;
	}
	public void gasGained(int gas){
				this.supplies[2] = this.supplies[2] + gas;
	}
	public void weaponsGained(int weapons){
				this.supplies[3] = this.supplies[3] + weapons;
	}
	// subtract from objectives
	/*public void foodLossed(int food){
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
	*/
	public int getFood(){
		return this.supplies[0];
	}
	public int getWater(){
		return this.supplies[1];
	}
	public int getWeapons(){
		return this.supplies[2];
	}
	public int getGas(){
		return this.supplies[3];
	}
	
	
	
	
	//print objectives
	public void print(){
		/*int foodCount = 0, waterCount = 0, weaponsCount = 0, gasCount = 0;
		for(int i = 0; i >3; i++){
			if(i == 0){
				foodCount = this.supplies[i];
				}
			else if(i== 1){
				waterCount = this.supplies[i];
			}
		else if(i== 2){
			gasCount = this.supplies[i];
			}
		
		else if(i== 3){
			weaponsCount = this.supplies[i];
			}
		}*/
		System.out.println("Objectives: Food, Water, Weapons, Gas");
		System.out.println("             " +this.supplies[0] + "     " + this.supplies[1] 
		+ "        " + this.supplies[3] + "     " + this.supplies[2]);  
	
	
	

}
}