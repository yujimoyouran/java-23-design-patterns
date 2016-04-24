package com.design.patterns.command;

import org.junit.Test;

/*
 * 命令模式（Command）：将一个请求封装成一个对象，使得你用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 * 命令模式，顾名思义来理解即可，就是客户端发布一个命令（也就是“请求”），而这个命令是已经被封装成一个对象的。即这个命令对象的内部可能已经指定了该命令具体被谁负责执行。
 * 就像开发经理从客户那边获取对方的需求（命令），客户在描述具体的需求可以决定是否明确指出该需求的执行方。
 */
public class CommandPattern {
	@Test
	public void TestCommand() {
		DvdName jayAndBob = new DvdName("Jay and Silent Bob Strike Back");
		DvdName spongeBob = new DvdName("Sponge Bob Squarepants - " + "Nautical Nonsense and Sponge Buddies");
		System.out.println("as first instantiated");
		System.out.println(jayAndBob.toString());
		System.out.println(spongeBob.toString());

		CommandAbstract bobStarsOn = new DvdCommandNameStarsOn(jayAndBob);
		CommandAbstract bobStarsOff = new DvdCommandNameStarsOff(jayAndBob);
		CommandAbstract spongeStarsOn = new DvdCommandNameStarsOn(spongeBob);
		CommandAbstract spongeStarsOff = new DvdCommandNameStarsOff(spongeBob);

		bobStarsOn.execute();
		spongeStarsOn.execute();
		System.out.println(" ");
		System.out.println("stars on");
		System.out.println(jayAndBob.toString());
		System.out.println(spongeBob.toString());

		spongeStarsOff.execute();
		System.out.println(" ");
		System.out.println("sponge stars off");
		System.out.println(jayAndBob.toString());
		System.out.println(spongeBob.toString());
	}
}
