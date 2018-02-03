package io.anuke.mindustry.world.blocks.types;

import io.anuke.mindustry.world.Block;

public class Decoration extends Block{

	public Decoration(String name) {
		super(name);
		shadow = name+"shadow";
		solid = false;
		destructible = true;
	};
	


}
