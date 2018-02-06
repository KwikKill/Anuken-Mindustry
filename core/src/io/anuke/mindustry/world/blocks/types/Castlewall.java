package io.anuke.mindustry.world.blocks.types;

import io.anuke.mindustry.world.Block;

public class Castlewall extends Block{

	public Castlewall(String name) {
		super(name);
		solid = true;
		destructible = true;
		rotate = true;
	}

	public boolean canReplace(Block other){
		return other instanceof Wall && health > other.health;
	}

}
