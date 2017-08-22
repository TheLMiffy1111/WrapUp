package thelm.wrapup.event;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IContextSetter;

public class PreInitializationWrapUpEvent extends Event implements IContextSetter {

	public int id = -1;
	public FMLPreInitializationEvent event;
	
	public PreInitializationWrapUpEvent(FMLPreInitializationEvent event) {
		this.event = event;
	}

	public static class Event0 extends PreInitializationWrapUpEvent {
		public Event0(FMLPreInitializationEvent event) {
			super(event);
			id = 0;
		}
	}

	public static class Event1 extends PreInitializationWrapUpEvent {
		public Event1(FMLPreInitializationEvent event) {
			super(event);
			id = 1;
		}
	}

	public static class Event2 extends PreInitializationWrapUpEvent {
		public Event2(FMLPreInitializationEvent event) {
			super(event);
			id = 2;
		}
	}

	public static class Event3 extends PreInitializationWrapUpEvent {
		public Event3(FMLPreInitializationEvent event) {
			super(event);
			id = 3;
		}
	}

	public static class Event4 extends PreInitializationWrapUpEvent {
		public Event4(FMLPreInitializationEvent event) {
			super(event);
			id = 4;
		}
	}
}
