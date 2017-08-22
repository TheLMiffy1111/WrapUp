package thelm.wrapup.event;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IContextSetter;

public class PostInitializationWrapUpEvent extends Event implements IContextSetter {

	public int id = -1;
	public FMLPostInitializationEvent event;
	
	public PostInitializationWrapUpEvent(FMLPostInitializationEvent event) {
		this.event = event;
	}

	public static class Event0 extends PostInitializationWrapUpEvent {
		public Event0(FMLPostInitializationEvent event) {
			super(event);
			id = 0;
		}
	}

	public static class Event1 extends PostInitializationWrapUpEvent {
		public Event1(FMLPostInitializationEvent event) {
			super(event);
			id = 1;
		}
	}

	public static class Event2 extends PostInitializationWrapUpEvent {
		public Event2(FMLPostInitializationEvent event) {
			super(event);
			id = 2;
		}
	}

	public static class Event3 extends PostInitializationWrapUpEvent {
		public Event3(FMLPostInitializationEvent event) {
			super(event);
			id = 3;
		}
	}

	public static class Event4 extends PostInitializationWrapUpEvent {
		public Event4(FMLPostInitializationEvent event) {
			super(event);
			id = 4;
		}
	}
}
