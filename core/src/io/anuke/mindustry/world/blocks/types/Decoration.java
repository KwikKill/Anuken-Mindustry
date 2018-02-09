package io.anuke.mindustry.world.blocks.types;

import io.anuke.mindustry.world.Block;

public class Decoration extends Block{

	public Decoration(String name) {
		shadow = name;
		super(name);
		solid = false;
		breakable = true;
	};



}
