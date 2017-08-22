package thelm.wrapup.event;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IContextSetter;

public class InitializationWrapUpEvent extends Event implements IContextSetter {

	public int id = -1;
	public FMLInitializationEvent event;
	
	public InitializationWrapUpEvent(FMLInitializationEvent event) {
		this.event = event;
	}

	public static class Event0 extends InitializationWrapUpEvent {
		public Event0(FMLInitializationEvent event) {
			super(event);
			id = 0;
		}
	}

	public static class Event1 extends InitializationWrapUpEvent {
		public Event1(FMLInitializationEvent event) {
			super(event);
			id = 1;
		}
	}

	public static class Event2 extends InitializationWrapUpEvent {
		public Event2(FMLInitializationEvent event) {
			super(event);
			id = 2;
		}
	}

	public static class Event3 extends InitializationWrapUpEvent {
		public Event3(FMLInitializationEvent event) {
			super(event);
			id = 3;
		}
	}

	public static class Event4 extends InitializationWrapUpEvent {
		public Event4(FMLInitializationEvent event) {
			super(event);
			id = 4;
		}
	}
}
