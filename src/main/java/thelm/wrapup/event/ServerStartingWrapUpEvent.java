package thelm.wrapup.event;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IContextSetter;

public class ServerStartingWrapUpEvent extends Event implements IContextSetter {

	public int id = -1;
	public FMLServerStartingEvent event;
	
	public ServerStartingWrapUpEvent(FMLServerStartingEvent event) {
		this.event = event;
	}

	public static class Event0 extends ServerStartingWrapUpEvent {
		public Event0(FMLServerStartingEvent event) {
			super(event);
			id = 0;
		}
	}

	public static class Event1 extends ServerStartingWrapUpEvent {
		public Event1(FMLServerStartingEvent event) {
			super(event);
			id = 1;
		}
	}

	public static class Event2 extends ServerStartingWrapUpEvent {
		public Event2(FMLServerStartingEvent event) {
			super(event);
			id = 2;
		}
	}

	public static class Event3 extends ServerStartingWrapUpEvent {
		public Event3(FMLServerStartingEvent event) {
			super(event);
			id = 3;
		}
	}

	public static class Event4 extends ServerStartingWrapUpEvent {
		public Event4(FMLServerStartingEvent event) {
			super(event);
			id = 4;
		}
	}
}
