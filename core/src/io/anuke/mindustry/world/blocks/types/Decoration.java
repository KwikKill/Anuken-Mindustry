package io.anuke.mindustry.world.blocks.types;

import io.anuke.mindustry.world.Block;

public class Wall extends Block{

	public Decoration(String name) {
		super(name);
		solid = false;
		destructible = true;
	};
	


}
