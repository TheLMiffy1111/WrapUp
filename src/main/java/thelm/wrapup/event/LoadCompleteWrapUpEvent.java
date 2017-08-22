package thelm.wrapup.event;

import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IContextSetter;

public class LoadCompleteWrapUpEvent extends Event implements IContextSetter {

	public int id = -1;
	public FMLLoadCompleteEvent event;
	
	public LoadCompleteWrapUpEvent(FMLLoadCompleteEvent event) {
		this.event = event;
	}

	public static class Event0 extends LoadCompleteWrapUpEvent {
		public Event0(FMLLoadCompleteEvent event) {
			super(event);
			id = 0;
		}
	}

	public static class Event1 extends LoadCompleteWrapUpEvent {
		public Event1(FMLLoadCompleteEvent event) {
			super(event);
			id = 1;
		}
	}

	public static class Event2 extends LoadCompleteWrapUpEvent {
		public Event2(FMLLoadCompleteEvent event) {
			super(event);
			id = 2;
		}
	}

	public static class Event3 extends LoadCompleteWrapUpEvent {
		public Event3(FMLLoadCompleteEvent event) {
			super(event);
			id = 3;
		}
	}

	public static class Event4 extends LoadCompleteWrapUpEvent {
		public Event4(FMLLoadCompleteEvent event) {
			super(event);
			id = 4;
		}
	}
}
